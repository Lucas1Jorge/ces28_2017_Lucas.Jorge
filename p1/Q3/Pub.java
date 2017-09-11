package Q3;
import java.util.ArrayList;
import java.util.HashMap;

public class Pub {

	// ENCAPSULAMENTO: mudar os atributos para private:
	private static final Drink ONE_BEER = new Drink("hansa");
	private static final Drink ONE_CIDER = new Drink("grans");
	private static final Drink A_PROPER_CIDER = new Drink("strongbow");
	private static final Drink GT = new Drink("gt");
	private static final Drink BACARDI_SPECIAL = new Drink("bacardi_special");
	
	private PubMenu _menu = new PubMenu();
	
	public int computeCost(Drink drink, boolean student, int amount) {
		// one unit of rum
		_menu.addIngredient("ingredient1", 65);
		// one unit of grenadine
		_menu.addIngredient("ingredient2", 10);
		// one unit of lime juice
		_menu.addIngredient("ingredient3", 10);
		// one unit of green stuff
		_menu.addIngredient("ingredient4", 10);
		// one unit of tonic water
		_menu.addIngredient("ingredient5", 20);
		// one unit of gin
		_menu.addIngredient("ingredient6", 85);
		
		_menu.addDrink(ONE_BEER, 74);
		_menu.addDrink(ONE_CIDER, 103);
		_menu.addDrink(A_PROPER_CIDER, 110);
		_menu.addDrink(GT, 0);					// As bebidas com preço zero tem seu valor
		_menu.addDrink(BACARDI_SPECIAL, 0);		// calculado conforme seus ingredientes
			
		if (!_menu.contains(drink)) 
			throw new RuntimeException("No such drink exists");
		
		if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL))
			throw new RuntimeException("Too many drinks, max 2.");
		
		int price = _menu.getPrice(drink);
		
		// 10% de desconto para estudante em algumas bebidas:
		if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER))
			price *= 0.9;
				
		return price * amount;
	}
}

//if (drink.equals(ONE_BEER)) {
//return = 74;
//} else if (drink.equals(ONE_CIDER)) {
//return = 103;
//} else if (drink.equals(A_PROPER_CIDER))
//return = 110;
//else if (drink.equals(GT)) {
//return = ingredient6() + ingredient5() + ingredient4();
//} else if (drink.equals(BACARDI_SPECIAL)) {
//price = ingredient6() + ingredient1() + ingredient2() + ingredient3();
//} else {
//throw new RuntimeException("No such drink exists");
//}
package Q3;

import java.util.ArrayList;
import java.util.HashMap;

public class PubMenu {
	PubMenu() {
		this._ingredients = new HashMap<String, Integer>();
		this._drinks = new HashMap<Drink, Integer>();
	}
	
	// HashMap contendo os preços dos ingredientes
	private HashMap<String, Integer> _ingredients;
	
	// Menu de bebidas do Pub
	private HashMap<Drink, Integer> _drinks;
	
	
	public boolean contains(Drink drink) {
		return _drinks.containsKey(drink);
	}
	
	public int getPrice(Drink drink) {
		if(_drinks.get(drink) != 0)
			return _drinks.get(drink);
		
		else {
			int price = 0;
			for(String ingredient : drink.getIngredients()) {
				price += _ingredients.get(ingredient);
			}
			return price;
		}
	}
	
	void addIngredient(String ingredient, int price) {
		_ingredients.put(ingredient, price);
	}
	
	void addDrink(Drink drink, int price) {
		_drinks.put(drink, price);
	}
}

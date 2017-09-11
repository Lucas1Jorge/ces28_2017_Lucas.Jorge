package Q3;

import java.util.ArrayList;

public class Drink {
	Drink(String name) {
		this._name = name;
	}
	
	ArrayList<String> getIngredients() {
		return _ingredients;
	}
	
	private String _name;
	
	// A bebida tem uma lista de ingredientes:
	private ArrayList<String> _ingredients = new ArrayList<String>();
}

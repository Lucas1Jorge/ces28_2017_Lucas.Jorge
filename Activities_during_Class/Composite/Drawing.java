package Composite;

import java.util.ArrayList;

public class Drawing {
	public Drawing() {
		this._shapes = new ArrayList<Shape>();
	}
	
	private ArrayList<Shape> _shapes;
	
	public void draw(String fillColor) {
		for (Shape shape : this._shapes) {
			shape.draw(fillColor);
		}
	}
	public void add(Shape shape) {
		this._shapes.add(shape);
	}
	public void remove(Shape shape) {
		this._shapes.remove(shape);
	}
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		_shapes.clear();
	}
}

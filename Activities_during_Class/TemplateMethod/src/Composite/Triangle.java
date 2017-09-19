package Composite;

public class Triangle implements Shape {
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triganle with color " + fillColor);
	}
}

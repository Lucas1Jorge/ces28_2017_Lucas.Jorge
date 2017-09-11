package Q1;

public class Circle extends Elipse {
//	Circle(double r, double r) {
//		this = new Elipse(1.0, 1.0);
//	}
	
	public double pi = 3.141592;
	private double _r;
	
	public double getArea() {
		return 2*pi*this._r;
	}
}

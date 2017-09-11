package Q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
	public double pi = 3.141592;
	
	Circle circle = new Circle(1.0, 1.0);
	Elipse elipse = new Elipse(1.0, 1.0);
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void test() {
		assertEquals(circle.getArea(), 2*pi*1,0.01);
	}

}

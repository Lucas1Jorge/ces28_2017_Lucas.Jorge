package House;

public class HousingClient {

	public static void main(String[] args) {
		WoodenHouse woodenhouse = new WoodenHouse();
		GlassHouse glasshouse = new GlassHouse();
		woodenhouse.buildHouse();
		glasshouse.buildHouse();
		System.out.println("************");
	}

}

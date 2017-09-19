package House;

public class WoodenHouse {
	public final void buildHouse(){
		  buildFoundation();
		  buildPillars();
		  buildWalls();
		  buildWindows();
		  System.out.println("House is built.");
	}
	private void buildFoundation() {
	  System.out.println("Building foundation with cement,iron rodsand sand");
	}
	protected void buildPillars() {
	  System.out.println("Building Pillars with Wood coating");
	}
	protected void buildWalls() {
	  System.out.println("Building Wooden Walls");
	}
	private void buildWindows() {
	  System.out.println("Building Glass Windows");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

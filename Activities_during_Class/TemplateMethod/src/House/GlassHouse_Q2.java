package House;

public class GlassHouse_Q2 {
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
	private void buildPillars() {
	  System.out.println("Building Pillars with glass coating");
	}
	private void buildWalls() {
	  System.out.println("Building Glassy Walls");
	}
	private void buildWindows() {
	  System.out.println("Building Glass Windows");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

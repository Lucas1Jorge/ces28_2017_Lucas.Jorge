package observer_std;

import java.util.Observable;

public class Ex12 {

	public static void main(String[] args) {
		RN rn = new RN();

		IU iu = new IU();
		SO os = new SO();
		
		rn.addObserver(iu);
		rn.addObserver(os);
		
		for (int i=0; i<10; i++) {
			rn.setState(i);
		}
	}
	
}

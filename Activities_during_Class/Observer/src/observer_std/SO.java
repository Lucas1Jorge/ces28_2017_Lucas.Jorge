package observer_std;

import java.util.Observable;
import java.util.Observer;

public class SO implements Observer {
	private int _observableState;
	
	public void update(Observable obs, Object obj) {
		RN rn = (RN) obs;
		this._observableState = rn.getState();
		System.out.println(_observableState);
	}
}

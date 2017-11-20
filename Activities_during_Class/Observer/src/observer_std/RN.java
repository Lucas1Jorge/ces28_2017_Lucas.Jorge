package observer_std;

import java.util.Observable;

public class RN extends Observable{
	private int _state;
	
	public void setState(int state) {
		_state = state;
		this.setChanged();
		this.notifyObservers();
	}

	public int getState() {
		return _state;
	}
}

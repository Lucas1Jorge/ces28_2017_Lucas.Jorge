package Ex17;

import java.util.Observable;

public class Publisher extends Observable{
	private String _state;
	
	public void setState(String state) {
		_state = state;
		this.setChanged();
		this.notifyObservers();
	}

	public String getState() {
		return _state;
	}
}

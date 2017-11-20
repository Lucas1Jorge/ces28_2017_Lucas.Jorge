package observer;

import java.util.ArrayList;

public class RN_Usuario extends Subject {
	public RN_Usuario(int state) {
		this._observers = new ArrayList<Observer>();
		this._state = state;
	}
}

package observer;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
	protected List<Observer> _observers; // = new ArrayList<Observer>();
	protected int _state;
	
	public void attach(Observer obs) {
		_observers.add(obs);
	}
	
	public void dettach(Observer obs) {
		_observers.remove(obs);
	}
	
	protected void obsNotify() {
		for(Observer obs : _observers) {
			obs.update(_state);
		}
	}
	
	public int getState() {
		return _state;
	}
	
	public void setState(int state) {
		_state = state;
		obsNotify();
	}
}

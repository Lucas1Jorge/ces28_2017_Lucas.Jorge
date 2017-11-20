package Ex17;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
	private String _observableState;
	private String _name;
	
	public Subscriber(String name) {
		_name = name;
	}
	
	public void update(Observable obs, Object obj) {
		Publisher pub = (Publisher) obs;
		this._observableState = pub.getState();
		System.out.println(_name + ": recebi msg do sub" + _observableState);
	}
}
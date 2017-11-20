package Ex17;

import java.awt.List;

public class PB {
	private List _subscriptions;
	
	public PB() {
		_subscriptions = new ArrayList<Publisher>();
	}
	
	public void add(Publisher pub, Subscriber sub) {
		_subscriptions.put(pub, sub);
		pub.addObserver(sub);
	}
	
	public void notify(Publisher pub, Subscriber sub) {
		
	}
}

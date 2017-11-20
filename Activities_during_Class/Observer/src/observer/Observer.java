package observer;

public abstract class Observer {
	protected Subject _subject;
	protected int _observerState;
	
	public abstract void update(int state);
}

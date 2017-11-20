package observer;

public class IU_TelaConversa extends Observer {
	public IU_TelaConversa(Subject subject) {
		this._subject = subject;
		this._observerState = _subject.getState();
	}
	
	public void update(int state) {
		this._observerState = state;
		System.out.println(_observerState);
	}
}

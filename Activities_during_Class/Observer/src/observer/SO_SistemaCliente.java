package observer;

public class SO_SistemaCliente extends Observer {
	public SO_SistemaCliente(Subject subject) {
		this._subject = subject;
		this._observerState = _subject.getState();
	}
	
	public void update(int state) {
		this._observerState = state;
		System.out.println(_observerState);
	}
	
	public void setState(int state) {
		_subject.setState(state);
	}
}

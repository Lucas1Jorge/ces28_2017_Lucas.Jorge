package questao_5;

import java.util.Observable;

public class Drone implements View_Observer {
	private CLOUD_Presenter _CLOUD;
	private Object _status;
	String _name;
	private GCS _GCS;
	
	public Drone(String name, CLOUD_Presenter CLOUD) {
		_name = name;
		_CLOUD = CLOUD;
		_status = (Integer) 0;
	}
	
	public void avoidColision() {
		// ... while(true) { drive } ...
		// update _status
	}
	
	public String getName() {
		return _name;
	}
	
	public void setStatus(Object status) {
		_status = status;
	}
	
	public Object getStatus() {
		return _status;
	}
	
	public void setGCS(GCS gcs) {
		_GCS = gcs;
	}
	
	public void sendStatus() {
		_CLOUD.setStatus(getName(), getStatus());
	}
	
	@Override
	public void update(Observable CLOUD, Object status) {
		// status vai ser this._status e CLOUD será this_CLOUD
//		CLOUD_Presenter cloud = (CLOUD_Presenter) CLOUD;
//		cloud.setStatus(status);
		System.out.println(_name + " updated");
	}
	
	public void communicate_with_CGS() {
//		link de comunicaçao que nao precisa
//		ser implementado
	}
}

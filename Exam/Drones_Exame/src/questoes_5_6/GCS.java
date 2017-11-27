package questao_5;

import java.util.Observable;

public class GCS implements View_Observer {
	private CLOUD_Presenter _CLOUD;
	private Object _map;
	String _name;
	private Drone _drone;
	
	public GCS(String name, CLOUD_Presenter CLOUD) {
		_name = name;
		_CLOUD = CLOUD;
	}
	
	@Override
	public void update(Observable CLOUD, Object map) {
		_map = map;
		System.out.println(_name + ": Mapa atualizado!");
	}
	
	public void setDrone(Drone drone) {
		_drone = drone;
	}
	
	public void communicate_with_Drone() {
//		link de comunicaçao que nao precisa
//		ser implementado
	}
}

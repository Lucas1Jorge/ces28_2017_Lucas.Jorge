package questao_5;

public class Main {

	public static void main(String[] args) {
		CLOUD_Presenter CLOUD = new CLOUD_Presenter();
		
		GCS gcs_1 = new GCS("GCS_1", CLOUD);
		Drone drone_1 = new Drone("drone_1", CLOUD);
		drone_1.setStatus((Integer) 1);		// configuraçoes iniciais do drone
		gcs_1.setDrone(drone_1);			// associa o drone a um único GCS 
		drone_1.setGCS(gcs_1);				// e vice-versa
		
		GCS gcs_2 = new GCS("GCS_2", CLOUD);
		Drone drone_2 = new Drone("drone_2", CLOUD);
		drone_1.setStatus((Integer) 2);
		gcs_2.setDrone(drone_2);
		drone_2.setGCS(gcs_2);
		
		GCS gcs_3 = new GCS("GCS_3", CLOUD);
		Drone drone_3 = new Drone("drone_3", CLOUD);
		drone_1.setStatus((Integer) 3);
		gcs_3.setDrone(drone_3);
		drone_3.setGCS(gcs_3);
		
		CLOUD.addView(gcs_1);
		CLOUD.addView(gcs_2);
		CLOUD.addView(gcs_3);
		CLOUD.addView(drone_1);
		CLOUD.addView(drone_2);
		CLOUD.addView(drone_2);
		
		// passados 10 segundos:
		drone_1.sendStatus();	// envia sua posiçao para a CLOUD
		drone_2.sendStatus();
		drone_3.sendStatus();
		
		// passados 20 segundos:
		CLOUD.notifyViews();
		CLOUD.getMap();
		
		System.out.println("OK");
	}

}

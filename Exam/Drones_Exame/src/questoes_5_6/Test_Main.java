package questao_5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Test_Main {
	private static CLOUD_Presenter CLOUD;
	private static GCS gcs_1;
	private static GCS gcs_2;
	private static GCS gcs_3;
	private static Drone drone_1;
	private static Drone drone_2;
	private static Drone drone_3;
	private UTM_Model UTM;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		CLOUD = mock(CLOUD_Presenter.class);
		
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
		
	}

	@Test
	void CGS_recebe_mapa_da_UTM_a_cada_20_segundos() {
		when(CLOUD.setStatus("drone1", 1)).thenReturn("sfdkjafdlkj");
	}

}

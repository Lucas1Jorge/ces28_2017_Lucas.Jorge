package questao_5;

public class UTM_Model {
	private static UTM_Model _instance;						// singleton - questões 3 e 5.c
	private Object _map;
	
	private UTM_Model() {}
	
	public static synchronized UTM_Model getInstance() {	// synchronized torna a lazy
		if (_instance == null) {							// initialization thread-safe
			_instance = new UTM_Model();					// pois duas threads podem acessar
		}													// o método enquanto o _instance é null
		return _instance;									// e as duas gerariam duas instâncias
	}
	
	public void processInfo(String name, Object allInfos) {
//		process information and
//		update this._map
	}
	
	public Object getSaInfo() { // fornece o mapa para as GCSs através do presenter
		return _map;
		
	}
}

package observer;

public class Ex11 {

	public static void main(String[] args) {
		Subject rn = new RN_Usuario(1);
		
		Observer iu = new IU_TelaConversa(rn);
		Observer so = new SO_SistemaCliente(rn);
		
		rn.attach(iu);
		rn.attach(so);
		
		for (int i=0; i<10; i++) {
			rn.setState(i);
		}
	}

}

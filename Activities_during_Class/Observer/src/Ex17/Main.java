package Ex17;

import observer_std.IU;
import observer_std.RN;
import observer_std.SO;

public class Main {
	public static void main(String[] args) {
		Publisher pub1 = new Publisher();
		Publisher pub2 = new Publisher();
		Subscriber sub1 = new Subscriber("obs1");
		Subscriber sub2 = new Subscriber("obs2"); 

		PB pb = new PB();
		pb.add(pub1, sub1);
		pb.add(pub1, sub2);
		pb.add(pub2, sub1);
		pb.add(pub2, sub2);
		
//		sub1.addObserver(obs1);
//		sub1.addObserver(obs2);
//		
//		sub2.addObserver(obs1);
//		sub2.addObserver(obs2);
		
		for (int i=0; i<10; i++) {
//			sub1.setState("1");
//			sub2.setState("2");
			
		}
	}
}
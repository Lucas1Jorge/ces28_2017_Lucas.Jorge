package v0;

import java.util.ArrayList;

public class Person {
	private static int nextId = 0;
	private int _id;

	Person() {
		_id = nextId++;
	}

	public int getId() {
		return _id;
	}

	

//	public static void main(String[] args) {
//		ArrayList<Person> ps = new ArrayList<Person>();
//		for (int i = 0; i < ps.size(); i++)
//			ps.add(new Person());
//
//		Project pj = new Project();
//		pj.setParticipants(ps);
//		pj.printParticipants();
//
//		Person x = new Person();
//		if (pj.participation(x)) {
//			System.out.println("Person " + x.getId() + " belongs to project");
//		} else {
//			System.out.println("Person " + x.getId() + " does not belong to project");
//		}
//		Person p = ps.get(1);
//		if (pj.participation(p)) {
//			System.out.println("Person " + p.getId() + " belongs to project");
//		} else {
//			System.out.println("Person " + p.getId() + " does not belong to project");
//		}
//
//	}

}

package v0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
	private Person p1,  p2, p3;
	private Project pj;
	private ArrayList<Person> p;
	String expected, result;
	
	@Before
	public void setUp(){
		p = new ArrayList<Person>();
		p1 = new Person();
		p2 = new Person();
		p3 = new Person();
		pj = new Project();
	}
	
	@Test
	public void testPrintParticipants() {
		p.add(p1);
		p.add(p3);
		pj.setParticipants(p);
		expected = "project has person 3\n"
				 + "project has person 5\n";
		result = pj.printParticipants();
		System.out.println(expected);
		System.out.println(result);
		assertTrue(expected.equals(result));
	}

	@Test
	public void WhenPersonIsParticipantInProjectParticipationReturnsTrue() {
		p.add(p1);
		pj.setParticipants(p);
		assertTrue(pj.participation(p1));
	}
	
	@Test
	public void WhenPersonIsNotParticipantInProjectParticipationReturnsFalse() {
		p.add(p1);
		pj.setParticipants(p);
		assertFalse(pj.participation(p2));
	}
}

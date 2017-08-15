package v0;

import java.util.ArrayList;

public class Project {
	Project() {
		_participants = new ArrayList<Person>();
	}
	
	private ArrayList<Person> _participants;

	public ArrayList<Person> getParticipants() {
		return _participants;
	}

	public int getNumberOfParticipants() {
		return _participants.size();
	}

	public void setParticipants(ArrayList<Person> p) {
		_participants = p;
	}

	public String printParticipants() {
		String toReturn = "";
		for (int i = 0; i < _participants.size(); i++)
			toReturn += "project has person " + _participants.get(i).getId() + "\n";
		return toReturn;
	}
	
	boolean participation(Person p) {
		return _participants.contains(p);
	}
}

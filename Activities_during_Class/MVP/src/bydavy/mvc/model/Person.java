package bydavy.mvc.model;

import java.util.ArrayList;
import java.util.List;


public class Person {
	public interface PersonListener{
		void onPersonNameChanged();
	}
	
	public Person()
	{
	
	}
	
	public Person(String name)
	{
		this.setName(name);
	}

	public String getName()
	{
		System.out.println("action5: getName");
		return _name;
	}
	
	public void setName(String name)
	{
		System.out.println("action3: Set name");
		if(!hasNoAlpha(name) && Character.isUpperCase(name.charAt(0))) {
			_name = name;
		}
		fireOnNameChanged();
	}

	public boolean hasNoAlpha(String str) {
		return str.matches("^.*[^a-zA-Z0-9 ].*$");
	}


	public void addListener(PersonListener l)
	{
		this.listeners.add(l);
	}
	
	public void removeListener(PersonListener l)
	{
		this.listeners.remove(l);
	}
	
	private void fireOnNameChanged() {
		for(PersonListener l:this.listeners)
		{
			l.onPersonNameChanged();
		}
	}
	
	private String _name;
	private List<PersonListener> listeners = new ArrayList<PersonListener>();
}

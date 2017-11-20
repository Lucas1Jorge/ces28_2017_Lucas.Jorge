package Presenter;

import java.util.ArrayList;
import java.util.List;

import com.sun.glass.ui.View;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public abstract class Presenter implements Observable {
	private List<View> _views = new ArrayList<View>();
	
	@Override
	public void addListener(InvalidationListener arg0) {
		View view = (View) arg0;
		_views.add(view);
	}
	
	// public void notify() already implemented
	
	@Override
	public void removeListener(InvalidationListener arg0) {
		// TODO Auto-generated method stub
		
	}

}

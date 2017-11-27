package questao_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class CLOUD_Presenter extends Observable {
	private List<View_Observer> _views;
	private UTM_Model _model;
	private Object _map;
	
	public CLOUD_Presenter() {
		_views = new ArrayList<View_Observer>();
		_model = UTM_Model.getInstance();			// singleton - questões 3 e 5.c
	}
	
	public Object getMap() {
		_map = _model.getSaInfo();
		System.out.println("Cloud received sa info from UTM-CTR");
		return _map;
	}
	
	public String setStatus(String name, Object status) {
		String str = ("CLOUD received " + name + " status " + Integer.toString((Integer)status));
		_model.processInfo(name, status);
		System.out.println(str);
		return str;
	}
	
	public void addView(View_Observer view) {
		_views.add(view);
	}
	
	public void notifyViews() {
		for (View_Observer view : _views) {
			view.update(this, _map);
		}
	}
}

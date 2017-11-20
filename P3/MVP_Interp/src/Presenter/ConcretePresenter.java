package Presenter;

import View.ConcreteView_CubicSpline;
import View.ConcreteView_Lagrange;
import View.View_InterpolationMethod;

public class ConcretePresenter extends Presenter {
	private View_InterpolationMethod interpolationModel;
	private String DEFAULT_METHOD = "Lagrange";
	private final String CS_METHOD = "Cubic Spline";
	private final String L_METHOD = "Lagrange";
	
	public ConcretePresenter() {
		bind();
	}

	public void bind() {
		interpolationModel = (View_InterpolationMethod) getMethod(DEFAULT_METHOD);
	}
	
	public View_InterpolationMethod getMethod() {
		return interpolationModel;
	}
	
	public View_InterpolationMethod getMethod(String method) {
		switch (method) {
		case L_METHOD:
			interpolationModel = new ConcreteView_Lagrange();
			break;
		case CS_METHOD:
			interpolationModel = new ConcreteView_CubicSpline();
			break;
		default:
			System.out.println("Unknown method " + method);
		}

		return interpolationModel;
	}
	
	public void setModel(View_InterpolationMethod model) {
		interpolationModel = model;
	}
}

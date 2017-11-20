package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.StringTokenizer;
import java.util.Vector;

import Presenter.Presenter;
import javafx.beans.InvalidationListener;

public abstract class View_InterpolationMethod implements Observer {						// Substitui a interface InterpolationMethod
	private View_InterpolationMethod interpolationModel;
	
	private List<Presenter> _presenters = new ArrayList<Presenter>();
	private double _value, result;
	private File _file;
	private Vector<Double> x, y;
	private DecimalFormat formatResult = new DecimalFormat("####.######");
	private FileReader input;
	private BufferedReader bufRead;
	private StringTokenizer xy;
	private final String CS_METHOD = "Cubic Spline";
	private final String L_METHOD = "Lagrange";
	
	@Override
	public void update(Observable arg0, Object arg1) {
	
	}
	
	public void add(Presenter p) {
		InvalidationListener listener = (InvalidationListener) this;
		p.addListener(listener);
	}
	
	public File getDataFile() {
		return _file;
	}
	
	public abstract double calculateResult(double t, Vector<Double> xx, Vector<Double> yy);
	
	// RESPONSABILITY: DADO O VALOR DE X, EFETIVAMENTE LER O ARQUIVO E CHAMAR O
	// CALCULO.
	public void calculateResult(float value, File file) {
		_value = value;
		buildDataPoints(file);
		if (getMethod() != null) {
			result = getMethod().calculateResult(_value, x, y);
			printResult();
		} else {
			System.out.println("It is not defined an interpolation method.");
		}
	}

	// RESPONSABILITY: IMPRIMIR RESULTADOS
	private void printResult() {
		System.out.println("***********************");
		System.out.println("DataFile: " + getDataFile());
		System.out.println("Interp at " + formatResult.format(_value) + " ; result = " + formatResult.format(result));
	}
	
	// RESPONSABILITY: LER ARQUIVO DE DADOS
	private void buildDataPoints(File file) {
		if (file == null)
			return;
		else
			_file = file;

		x = new Vector<Double>();
		y = new Vector<Double>();
		try {
			input = new FileReader(_file);
			/* Filter FileReader through a Buffered read to read a line at a time */
			bufRead = new BufferedReader(input);
			// Read first line
			String line = bufRead.readLine();
			// Read through file one line at time.
			while (line != null) {
				xy = new StringTokenizer(line, "\t ");
				while (xy.hasMoreTokens()) {
					x.addElement(Double.parseDouble(xy.nextToken()));
					y.addElement(Double.parseDouble(xy.nextToken()));
				}
				line = bufRead.readLine();
			}
			bufRead.close();
		} catch (IOException e) { // If another exception is generated, print a stack trace
			e.printStackTrace();
		}
	}// buildDataPoints
	
	// RESPONSABILITY: ESCOLHER O METODO DE INTERPOLACAO DESEJADO E CRIAR O OBJETO
	// CORRESPONDENTE
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
}

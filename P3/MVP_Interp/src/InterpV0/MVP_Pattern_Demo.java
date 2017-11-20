package InterpV0;

import java.io.File;

import Presenter.ConcretePresenter;
import View.View_InterpolationMethod;

public class MVP_Pattern_Demo {
	
	public static void main(String[] args) {
		// RESPONSABILITY: CREATE APP
		ConcretePresenter presenter = new ConcretePresenter();

		// ENTRADA DE USUARIO HUMANO: ESCOLHA DO METODO DE INTERPOLACAO
		// RESPONSABILITY: LEITURA DO NOME DO METODO DE INTERPOLACAO
		View_InterpolationMethod method = presenter.getMethod("Lagrange");
		// ENTRADA DE USUARIO HUMANO: PONTO DE INTERPOLACAO E NOME DO ARQUIVO DE DADOS.
		// RESPONSABILITY: DEFINIR PONTO DE INTERPOLACAO (LEITURA ENTRADA DE USUARIO
		// HUMANO)
		float t = 10.3f;
		// RESPONSABILITY: DEFINIR QUAL EH O ARQUIVO COM DADOS DE PONTOS DA FUNCAO
		// (LEITURA ENTRADA DE USUARIO HUMANO)
		File file = new File("./data.dat");
		method.calculateResult(t, file);
	}

}// class

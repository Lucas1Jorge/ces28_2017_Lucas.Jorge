package Q4.orig;

import java.util.Iterator;

public class RelatorioDespesas {
	public RelatorioDespesas(Iterator<Despesa> despesas, Calculadora calc) {
		this._despesas = despesas;
		setTotalDespesa(calc);
	}
	
	private Iterator<Despesa> _despesas;
	private float _totalDespesa;
	
	public void setTotalDespesa(Calculadora calc) {
		_totalDespesa =  calc.calcularTotalDespesa(_despesas);
	}
	
	public float getTotalDespesa(Calculadora calc) {
		return  calc.calcularTotalDespesa(_despesas);
	}
	
	public String ImprimirRelatorio(SistemaOperacional so) {
		String conteudo = "Relatório de Despesas\n Total das despesas:" + _totalDespesa;

		return so.getDriverImpressao(conteudo);
	}
}
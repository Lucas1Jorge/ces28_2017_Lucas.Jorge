package Q4.orig;

import java.util.Iterator;

public class Calculadora {
	public float calcularTotalDespesa(Iterator<Despesa> despesas) {
		float totalDespesa = 0.0f;
		while (despesas.hasNext()) {
			totalDespesa += despesas.next().getDespesa();
		}
		return totalDespesa;
	}
}
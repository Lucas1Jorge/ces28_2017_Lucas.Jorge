package Q4.orig;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class RelatorioDespesasTest {
	
	SistemaOperacional so;
	Iterator<Despesa> iterator;
	RelatorioDespesas relatorio;
	Calculadora calc;
	Despesa d1, d2;
	List<Despesa> despesas;
	
	@Before
	public void setUp() {
		so = Mockito.mock(SistemaOperacional.class);
		iterator = Mockito.mock(Iterator.class);
		calc = Mockito.mock(Calculadora.class);
		d1 = Mockito.mock(Despesa.class);
		d2 = Mockito.mock(Despesa.class);
		despesas = new ArrayList<Despesa>();
		despesas.add(d1);
		despesas.add(d2);
		Iterator<Despesa> iterator = despesas.iterator();
	}
	
	@Test
	public void ImprimeCorreto() {
		when(iterator.hasNext()).thenReturn(false);
		when(calc.calcularTotalDespesa(iterator)).thenReturn(20f);
		float totalDespesas = 20f;
		String conteudo = "Relatório de Despesas\n Total das despesas:" + totalDespesas;
		when(so.getDriverImpressao(conteudo)).thenReturn(conteudo + "\nImpressão realizada com sucesso");
		relatorio = new RelatorioDespesas(iterator, calc);
		assertEquals(relatorio.ImprimirRelatorio(so), conteudo + "\nImpressão realizada com sucesso");
	}

}

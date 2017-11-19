package notaFiscal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import BD.BD_NF;
import BD.BD_PS;
import BD.BD_Tax;

class ItemVendaTest {
	private NotaFiscal _NF;
	private ItemVenda _IV;
	private static BD_PS _bdps;
	private static BD_NF _bdnf;
	private static BD_Tax _bdtax;
	private static Validador _validador;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		_bdps = mock(BD_PS.class);
		_bdtax = mock(BD_Tax.class);
		_validador = mock(Validador.class);
	}

	@Test
	void requisito_1() throws Exception {
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		_NF = new NotaFiscal(_IV);		// o construtor precisar receber
		assertTrue(_NF.hasIV());		// um IV ja garante o requisito 1	
	}
	
	@Test
	void requisito_2_UmIvEmMaisDeUmaNotaGeraExceçao() throws Exception{
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		_NF = new NotaFiscal(_IV);
		assertThrows(Exception.class, ()->{
			NotaFiscal NF2 = new NotaFiscal(_IV);
		});
	}
	
	@Test
	void requisito_3() throws Exception {
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		assertEquals(_IV.getPS(), _bdps.getPS("Lollipop"));
	}

	// requisito 4 -> composite patterns implementado em ProdutoServiço
	
	@Test
	void requisito_5_NFAdicionarPSNaoCadastradoGeraExceçao() throws Exception {
		when(_bdps.hasPS("Lollipop")).thenReturn(false);
		BD_PS bdps = new BD_PS();
		assertThrows(Exception.class, ()->{
			_IV = new ItemVenda("Lollipop", 1, bdps);
		});
	}
	
	@Test
	void requisito_6() throws Exception {
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		_NF = new NotaFiscal(_IV);
		assertTrue(_NF.getEstado().equals("em elaboraçao"));
	}
	
	@Test
	void requisito_7() throws Exception {
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		when(_bdps.getPS("Bubbaloo")).thenReturn(new ProdutoServiço("Bubbaloo"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		ItemVenda IV2 = new ItemVenda("Bubbaloo", 1, _bdps);
		_NF = new NotaFiscal(_IV);
		NotaFiscal NF2 = new NotaFiscal(IV2);
		
		when(_validador.checarRequisitos(_NF)).thenReturn(true);
		when(_validador.checarRequisitos(NF2)).thenReturn(true);
		_bdnf = new BD_NF(_validador);
		_bdnf.validar(_NF);															// ********** falta tornar as NFs imutáveis
		_bdnf.validar(NF2);
		assertEquals(NF2.getID(), _NF.getID()+1);
	}
	
	@Test
	void requisito_8() throws Exception {
		when(_bdps.getPS("Apple")).thenReturn(new ProdutoServiço("Apple"));
		_IV = new ItemVenda("Apple", 1, _bdps);
		when(_bdtax.getImposto(_IV)).thenReturn(new ImpostoFoo(0.15));
		_NF = new NotaFiscal(_IV);
		Validador validador = new Validador(_bdtax);
		_NF.validar(validador);
		double imposto = _NF.calcularImpostos(validador);
		assertEquals(imposto, 0.15, 0.01);
	}
	
	@Test
	void requisitos_9_10() throws Exception {
		when(_bdps.getPS("Lollipop")).thenReturn(new ProdutoServiço("Lollipop"));
		_IV = new ItemVenda("Lollipop", 1, _bdps);
		_NF = new NotaFiscal(_IV);
		ImpostoFoo imposto = new ImpostoFoo(0.15);
		assertEquals(imposto.gerarImposto(_IV), 0.25, 0.01);
	}
	
	// requisito 12 -> na implementaçao
	
	// requisito 13 -> método readIVs() de NF -> unmodifiable list
	
	// requisito 15 -> pattern strategy: Imposto é abstrato. Novos impostos devem extender e sobrescrever o método gerarImposto(ItemVenda)
}

package BD;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class NotaFiscalTest {
	
	@Mock
	private BDCliente BDC;
	
	@Mock
	private BDServico BDS;
	
	@Mock
	private VerificadorCPF verif;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		String itemVenda = "777";
	}
	
	@Test
	public void test() {
		Mockito.when(verif.verifySPC("777")).thenReturn(true);
		Mockito.when(BDC.getCliente("777")).thenReturn(new Cliente("777"));
		Mockito.when(BDS.getItem("Abajour")).thenReturn(new ItemVenda("Abajour"));
		NotaFiscal NF = new NotaFiscal(verif, BDC, BDS, "Abajour", 7, "777");
	}
	
	@Test
	public void test() {
		Mockito.when(verif.verifySPC("777")).thenReturn(true);
		Mockito.when(BDC.getCliente("777")).thenReturn(new Cliente("777"));
		Mockito.when(BDS.getItem("Abajour")).thenReturn(new ItemVenda("Abajour"));
		NotaFiscal NF = new NotaFiscal(verif, BDC, BDS, "Abajour", 7, "555");
	}
	

}

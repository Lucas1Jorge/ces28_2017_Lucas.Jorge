package Q4;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class ControladorPTCTest {
	
	private ControladorPTC controlador;
	private Sensor sensor;
	private PainelCondutor painel;
	private Datacenter data;
	
	@Before
	public void setup() {
		sensor = mock(Sensor.class);
		painel = mock(PainelCondutor.class);
		data = mock(Datacenter.class);
		
		// a) inicializacao do controladorPTC
		controlador = new ControladorPTC(sensor, data, painel);
	}
	
	// b)
	@Test
	public void TremForaDoCruzamentoSensorRetornaFalso() {
		when(sensor.isCruzamento()).thenReturn(false);
		when(sensor.getVelocidade()).thenReturn(50.0);
//		when(painel.imprimirAviso("Velocidade Baixa", 1)).thenReturn(true);
		controlador.run();
		verify(data, times(1)).gerarRelatorio((new Double(50.0)).toString());
		verify(painel, times(1)).imprimirAviso((new Double(50.0)).toString(), 1);
	}
	
	// c)
	@Test
	public void TremNoCruzamentoVelocMaiorQue100() {
		when(sensor.isCruzamento()).thenReturn(true);
		when(sensor.getVelocidade()).thenReturn(120.0);
		when(painel.imprimirAviso("Velocidade alta", 1)).thenReturn(true);
		controlador.run();
		verify(painel, times(1)).imprimirAviso("Velocidade alta", 1);
	}
	
	// d)
	@Test
	public void TremNoCruzamentoVelcMenorQue20() {
		when(sensor.isCruzamento()).thenReturn(true);
		when(sensor.getVelocidade()).thenReturn(10.0);
		when(painel.imprimirAviso("Velocidade Baixa", 1)).thenReturn(false);
		controlador.run();
		verify(painel, times(2)).imprimirAviso("Velocidade Baixa", 1);
	}
}

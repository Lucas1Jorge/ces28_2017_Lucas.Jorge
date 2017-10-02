package Q3.TireMonitor;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class AlarmTest {
	
	Sensor sensor;
	Alarm alarm = new Alarm();
	
	@Before
	public void setUp() {
		sensor = Mockito.mock(Sensor.class); 
	}
	
	@Test
	public void WhenPressureBetween17and21AlarmsCheckIsFalse() {
		when(sensor.popNextPressurePsiValue()).thenReturn(18.0);
		alarm.setSensor(sensor);
		alarm.check();
		assertEquals(alarm.isAlarmOn(), false);
	}
	
	@Test
	public void WhenPressureLessThan17AlarmsCheckIsTrue() {
		when(sensor.popNextPressurePsiValue()).thenReturn(15.0);
		alarm.setSensor(sensor);
		alarm.check();
		assertEquals(alarm.isAlarmOn(), true);
	}
	
	@Test
	public void WhenPressureGreaterThan21AlarmsCheckIsTrue() {
		when(sensor.popNextPressurePsiValue()).thenReturn(25.0);
		alarm.setSensor(sensor);
		alarm.check();
		assertEquals(alarm.isAlarmOn(), true);
	}
	
}

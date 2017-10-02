package Q3.TireMonitor;


public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;
//    Sensor_Incorrect sensor = new Sensor_Incorrect();
    private boolean alarmOn = false;
    private Sensor _sensor;
    
    public void setSensor(Sensor sensor) {
    	this._sensor = sensor;
    }
    
    public void check()
    {
        double psiPressureValue = _sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
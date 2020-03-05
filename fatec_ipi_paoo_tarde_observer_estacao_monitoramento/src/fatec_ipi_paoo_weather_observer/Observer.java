package fatec_ipi_paoo_weather_observer;

public interface Observer {
	public void update(double temp, double humidity, double pressure);
}

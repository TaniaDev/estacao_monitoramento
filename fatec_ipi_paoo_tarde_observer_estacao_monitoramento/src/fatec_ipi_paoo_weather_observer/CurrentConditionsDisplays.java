package fatec_ipi_paoo_weather_observer;

public class CurrentConditionsDisplays implements Observer, DisplayElement{
	public void update (double temp, double humidity, double pressure) {
		display(temp, humidity, pressure);
	}
	
	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Umidade: %.2f\nPressao: %.2f\nTemperatura: %.2f\n", h, p, t);
	}
}

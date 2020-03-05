package fatec_ipi_paoo_weather_observer;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement{
	private Random gerador = new Random ();
	public void update (double temp, double humidity, double pressure) {
		display(temp, humidity, pressure);
	}
	
	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Previsão: %.2f\n", (t - 3) + gerador.nextDouble() * 6);
		
	}
}

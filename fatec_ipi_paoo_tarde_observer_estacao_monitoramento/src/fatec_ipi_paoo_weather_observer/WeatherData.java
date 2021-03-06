package fatec_ipi_paoo_weather_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{

	private List <Observer> observers = new LinkedList <> ();
	private double temperature, humidity, pressure;
	private Random gerador = new Random();

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers)
			o.update(getTemperature(), getHumidity(), getPressure());
			System.out.println("-----------------------------------");
		
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	
	public double getHumidity() {
		return this.humidity;
	}
	
	public double getPressure() {
		return this.pressure;
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	public void setMeasurements() {
		this.temperature = 17 + gerador.nextDouble() * 17;
		this.humidity = 0.6 + gerador.nextDouble() * 0.1;
		this.pressure = 600 + gerador.nextDouble() * 400;
		this.measurementsChanged();
	}

	public void iniciar() {
		while (true) {
			setMeasurements();
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
	}
}

package fatec_ipi_paoo_weather_observer;

public class Teste {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplays conditionsDisplay =
				new CurrentConditionsDisplays();
		ForecastDisplay forecatDisplay =
				new ForecastDisplay();
		StatsDisplay statsDisplay =
				new StatsDisplay();
		
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecatDisplay);
		wd.registerObserver(statsDisplay);
		wd.iniciar();
	}

}

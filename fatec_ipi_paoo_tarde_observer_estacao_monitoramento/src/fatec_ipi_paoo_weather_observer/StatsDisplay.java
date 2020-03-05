package fatec_ipi_paoo_weather_observer;

import java.util.ArrayList;
import java.util.List;

public class StatsDisplay implements Observer, DisplayElement{
	private List <Double> temps = new ArrayList <> ();
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display(temp, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Media: %.2f\n", calculaMedia());
		calculaMediaDez();
		historicoTemp(t);
	}
	
	private double calculaMedia () {
		double soma = 0;
		for (Double temp : temps)
			soma += temp;
		return soma / temps.size();
	}

	private void calculaMediaDez() {
		double soma = 0;
		int cont = 1;
		for (Double temp : temps) {
			soma += temp;
			cont = cont+1;
			
			if(cont == 10) {
				System.out.printf("Media dos 10 ultimos: %.2f\n", soma/cont);
				cont=0;
				soma=0;
			}		
		}
	}
	private void historicoTemp (double t) {
		int cont = 1;
		for (Double temp : temps) {
			cont = cont+1;
			if(cont == 10)
				System.out.printf("Historico 10 ultimas temperaturas: %.2f\n", t);	
		}				
	}

}


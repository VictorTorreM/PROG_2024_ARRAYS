package segundotri;

import java.util.Arrays;

public class Termometro {

	private float temp[];
	private int mes;

	public Termometro(int mes) {
		this.mes = mes;
		temp = new float[diasMes(mes)];

		generarTemp(mes);
	}

	private void generarTemp(int mes) {

		for (int a = 0; a < temp.length; a++) {
			switch (mes) {

			case 12, 1, 2:
				temp[a] = (float) (Math.random() * 18 - 5);
				break; 
			case 3, 4, 5:
				temp[a] = (float) (Math.random() * 16 + 2);
				break;
			case 6, 7, 8:
				temp[a] = (float) (Math.random() * 14 + 15);
				break;
			case 9, 10, 11:
				temp[a] = (float) (Math.random() * 15 + 8);
				break;
			}

		}
	}

	private int diasMes(int mes) {

		switch (mes) {

		case 1, 3, 5, 7, 8, 10, 12:

			return 31;

		case 2:

			return 28;

		case 4, 6, 9, 11:

			return 30;

		default:
			this.mes = 1;
			return 31;
		}

	}

	public String toString() {

		for (int a = 1; a <= diasMes(mes); a++) {

			System.out.println("Día " + a + " / " + temp[a - 1]);

		}
		return "";

	}

	public float getMaxima() {
		float mayor = -99.99f;
		for (float dia : temp) {

			if (dia > mayor) {
				mayor = dia;
			}
		}
		return mayor;

	}

	public float getMinima() {
		float min = 99.99f;

		for (float dia : temp) {
			if (dia < min) {
				min = dia;
			}
		}
		return min;
	}

	public float getMedia() {

		float media = 0;

		for (float dia : temp) {
			media += dia;
		}
		return media / diasMes(mes);

	}

	public float getMediaImpares() {

		float media = 0;
		int ndia = 0;
		for (int a = 0; a < temp.length; a++) {

			if (a % 2 != 0) {
				media += temp[a];
				ndia++;

			}

		}
		return media / ndia;

	}

	public float getMaximaPares() {

		float maxpar = -99.99f;

		for (int a = 0; a < temp.length; a++) {
			if ((a + 1) % 2 == 0 && temp[a] > maxpar) {
				maxpar = temp[a];
			}

		}

		return maxpar;
	}

	public float getMinQuincena(int opcion) {
		float min = 9999.99f;
		switch (opcion) {

		case 1:
			for (int a = 0; a < 15; a++) {
				if ((a + 1) % 2 == 0 && temp[a] < min) {
					min = temp[a];
				}
				
			}
			break;

		case 2:
			for (int a = 15; a < temp.length ; a++) {
				if ((a + 1) % 2 == 0 && temp[a] < min) {
					min = temp[a];
				}
				
			}
			break;
		}
		return min;
 
	}
}

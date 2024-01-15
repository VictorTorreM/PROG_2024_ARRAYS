package clase;

import java.util.Arrays;

public class Clase {
	private Alumno alumnos[];
	private int cuantosHay;

	public Clase(int numeroAlumnos) {

		alumnos = new Alumno[numeroAlumnos];
		cuantosHay = 0;

	}

	public void addAlumno(Alumno alumn) {

		if (cuantosHay < alumnos.length) {

			alumnos[cuantosHay] = alumn;

			cuantosHay++;
		}

	}

	public String toString() {

		return Arrays.toString(alumnos);
	}

}

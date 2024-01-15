package clase;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("Victor Torre");
		Alumno a2 = new Alumno("Yeray González");
		Alumno a3 = new Alumno("Dario Torre");
		Alumno a4 = new Alumno("Ruben Seminario");

		Clase clase1 = new Clase(3);

		clase1.addAlumno(a1);
		clase1.addAlumno(a2);
		clase1.addAlumno(a3);
		clase1.addAlumno(a4);
		System.out.println(clase1);
	}

}

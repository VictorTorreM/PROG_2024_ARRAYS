package segundotri;

import java.util.Arrays;

import clase.Alumno;
import clase.Clase;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// COSO EXPLICATORIO
//
//	Termometro t1 = new Termometro(7);
//	
//
//	System.err.println("Yearay maricon");
//	
//	
//	System.out.println(t1);
//	System.out.println(t1.getMaxima());
//	System.out.println(t1.getMinima());
//	System.out.println(t1.getMedia());
//	System.out.println(t1.getMediaImpares());
//	System.out.println(t1.getMaximaPares());
//	System.out.println(t1.getMinQuincena(2));
//	
//	
		
		Alumno a1= new Alumno("Victor Torre");
		Alumno a2= new Alumno("Yeray González");
		Alumno a3= new Alumno("Dario Torre");
		Alumno a4= new Alumno("Ruben Seminario");
		
		Clase clase1 = new Clase(3);
		
		
		
		clase1.addAlumno(a1);
		clase1.addAlumno(a2);
		clase1.addAlumno(a3);
		clase1.addAlumno(a4);
		System.out.println(clase1);
		
		
	}
}

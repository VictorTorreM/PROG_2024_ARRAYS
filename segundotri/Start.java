package segundotri;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//COSO EXPLICATORIO
		char frase[] = new char[13];
		
		
		frase[0]= 'Y';
		frase[1]= 'E';
		frase[2]= 'R';
		
		
		// COSO QUE XPLOICA COSAS
		
		
		for(int a = frase.length-1; a>=0;a--) {
			
			System.out.print(frase[a]);
			
			
		}
		
		System.out.println();
		for(char letra:frase) {
			
			System.out.print(letra);
		}
		
		
	}

}

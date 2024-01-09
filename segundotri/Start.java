package segundotri;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char frase[] = new char[13];
		
		
		frase[0]= 'Y';
		frase[1]= 'E';
		frase[2]= 'R';
		frase[3]= 'A';
		frase[4]= 'Y';
		frase[5]= ',';
		frase[6]= 'M';
		frase[7]= 'A';
		frase[8]= 'R';
		frase[9]= 'I';
		frase[10]= 'C';
		frase[11]= 'O';
		frase[12]= 'N';
		
		
		for(int a = frase.length-1; a>=0;a--) {
			
			System.out.print(frase[a]);
			
			
		}
		System.out.println();
		for(char letra:frase) {
			
			System.out.print(letra);
		}
		
		
	}

}

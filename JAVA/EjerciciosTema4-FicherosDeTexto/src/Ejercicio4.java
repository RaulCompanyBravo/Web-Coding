import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numpalabras = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Introduce la cantidad de palabras: ");
		numpalabras = teclado.nextInt();
		String palabras[] = new String[numpalabras];
			
		
		for (int d=0;d<numpalabras;d++){
			System.out.printf("Introduce la primera palabra: ");
			palabras[d] = teclado.next();
			
			
			
			
		}
	}

}

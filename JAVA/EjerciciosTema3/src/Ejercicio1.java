import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		int lluvia[] = new int[7];
		int suma = 0;
		int media = 0;
		int i;
		int d;
		
		Scanner teclado = new Scanner(System.in);

		for (i = 1; i < 7; i++) {
			System.out.println("Introduze el dato de lluvia del dia " + i);
			lluvia[i] = teclado.nextInt();
			suma = suma + lluvia[i];
			media = suma / 6;
			//System.out.println("Suma: " + suma);
			

		}
		System.out.println("La media de los valores es: " + media);
		System.out.println("Los dia superiores a la media fueron:");
		for (d=1;d<7;d++){
			if ((lluvia[d]>=media*2/d)){
				System.out.println("El dia " +d);
				
			}
		}
			
		
		
		
		
		

	}

}

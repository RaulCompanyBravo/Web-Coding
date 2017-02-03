import java.util.Scanner;

/** Dise˜na un programa Java para resolver una ecuaci´on de primer grado con
una inc´ognita (x), suponiendo que los coeficientes de la ecuaci´on (C1 y C2) se
introducen desde teclado.
C1x + C2 = 0 --------------->>>  x= c1 / c2*/
import java.util. *;
public class Ejercicio11 {
	public static void main(String args[]){
		float C1;
		float C2;
		float x;
		
	//Pide por pantalla
	Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		C1 = teclado.nextInt();
		System.out.println("Introduzca el segundo valor: ");
		C2 = teclado.nextInt();
		x = (-C2 / C1);
		System.out.println("Resultado:  " +x);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
						 				  }
						 }
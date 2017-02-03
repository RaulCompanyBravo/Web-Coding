/**Escribir un programa en Java que transforme una temperatura dada en
grados Fahrenheit a grados Celsius, siendo 1ºC=33.80F
 										   x=gradosf*/
import java.util. *;
public class Ejercicio10 {
	public static void main(String args[]){
		float celsius;
		float faren;

	//Pide por pantalla
	Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la temperatura en grados Fahrenheit: ");
        faren = teclado.nextInt();
        celsius = (faren - 32 )/1.800f;
    System.out.println("El resulta do es: " +celsius);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

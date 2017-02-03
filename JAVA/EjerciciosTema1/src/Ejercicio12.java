/** EJERCICIO12 
 * //(float)math.pow(x,y)
//(float)math.sqrt
12. Dise~na un programa Java que calcule la suma, resta, multiplicacion y divisi
on de dos numeros introducidos por teclado. Incorpora tambien las funciones
que permitan realizar la potencia de un numero y la raz cuadrada del otro.
Ejemplo de salida del programa para x=9, y=3:
Introducir primer numero: 9
Introducir segundo numero: 3
3
x = 9.0 y = 3.0
x + y = 12.0
x - y = 6.0 x * y = 27.0 x / y = 3.0 x ^2 = 81.0
2_/-x = 3.0
*/
import java.util.*;
public class Ejercicio12 {
	public static void main(String args[]){
		
		float x;
		float y;
		
	Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		x = teclado.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		y = teclado.nextInt();
		System.out.printf("x = %s y = %s\n", x, y);
		System.out.println("x + y = " +(x + y));
		System.out.printf("x - y = %s x * y = %s x / y = %s x ^2 = %s\n ", x-y, x*y,x/y, (float)Math.pow(x, 2));
		System.out.println("Resultado de la raiz quadrada:" +Math.sqrt(2));
		
		
		
		
	

		
		
		
		
}
}
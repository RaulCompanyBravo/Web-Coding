import java.util.Scanner;

/**Escribir un programa en Java que detecte si un numero es par o impar.
En el caso caso que el n´umero sea par, se imprimir´a por pantalla un 1 y en caso
contrario se imprimir´a un 0. */

public class Ejercicio21 {
	public static void main(String args[]){
		 int num;
		 
		 Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca un numero: ");
			num = teclado.nextInt();
			
			if  (num%2==0)
				System.out.println("El numero "+num +" es par");
					else
				System.out.println("El numero "+num +" es impar");
			
			
			
			
			
			
			
			
			

	
		 
		
		
		
		
		
		
		
		
		
		
		
}
}
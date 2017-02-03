import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String args[]){
		double edad;
		double minutos;
		double segundos;
		
		Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca su edad: ");
			edad = teclado.nextInt();
	
	
	minutos = (((edad*365)/24)*3600)*60;
	segundos = minutos*60;
	
	 System.out.println("El total de minutos es:" +minutos);
	 System.out.println("El total de segundos es:" +segundos);
	
		
	}
}

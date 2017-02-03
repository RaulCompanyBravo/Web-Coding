import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String args[]){
			int totalHoras;
			int semanas;
			int dias;
			int horas;
			
		Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca las horas totales: ");
			totalHoras = teclado.nextInt();
		
	semanas= totalHoras/(24*7); 
	dias = totalHoras % (24*7)/24;
	horas = totalHoras % 24;
	 System.out.println("El total de horas es:" +totalHoras);
	 System.out.println("se convierte a:");
	 System.out.println(semanas + " semanas");
	 System.out.println(dias + " dias");
	 System.out.println(horas + " horas");
		
		
		
		
		
		
		
		
		
		
		
		
}
}
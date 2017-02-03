import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[ ] args){
		
		int horallegada;
		int horasalida;
		int horadesalidac;
		int horadeentradac = 0;
		int calchoras = 0;
		float calcmin;
		int horasint = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la hora de salida  (Ex. 1245): ");
		horasalida = teclado.nextInt();
		horadesalidac = (horasalida/100)*60;
	
		System.out.println("Introduzca la hora de entrada (Ex. 1245):");
        int horaentrada = teclado.nextInt();
        horadeentradac = (horadeentradac/100)*60;
        
        System.out.println("La duración han sido" +calchoras +"horas y ");
		
		
	}
}

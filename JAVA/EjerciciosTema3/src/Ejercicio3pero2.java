import java.util.Scanner;


public class Ejercicio3pero2 {

	public static void main(String[] args) {
		
		String nombre;
		int contador = 0;
		String nombreA[] = new String[6];
		int edad;
		
		
		Scanner teclado = new Scanner(System.in);
		
		
	
		for (int l=1;l<6;l++){
			System.out.println("Introduce un nombre:");
			nombre = teclado.nextLine();
			System.out.println("Introduce la edad de " +nombre);
			edad = teclado.nextInt();
			if (edad >=18){
				nombre = nombreA[l];
				System.out.println(nombreA[l]);
				System.out.println(nombreA[l] +" es mayor de 18 años");
			}
			//for (int f=1;f<6;f++)
			System.out.println(nombreA[l] +" es mayor de 18 años");
			
			}
			
			
		}
		
		

	}



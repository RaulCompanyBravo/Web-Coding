import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int turno;
		int numtrabaj;

		Scanner teclado = new Scanner(System.in);

		System.out.println("A que turno corresponden los trabajadores");
		System.out.println("1 --> Mañana");
		System.out.println("2 --> Tarde");
		System.out.println("-----------------------------------");
		turno = teclado.nextInt();
		if (turno !=1 && turno !=2){System.out.println("Introduce una opción valida");}
		if (turno == 1){
		System.out.println("Cuantos trabajadores se desea almacenar el sueldo:");
		numtrabaj = teclado.nextInt();
		numtrabaj = numtrabaj +1;
		float sueldom[] = new float[numtrabaj];
		
			for (int i = 1; i < sueldom.length; i++) {
				System.out.println("Introduce el sueldo del empleado numero " + i);
				sueldom[i] = teclado.nextInt();
			}
			
			System.out.println("Sueldos de los trabjadores del turno de mañana");
			for (int l=1;l<sueldom.length;l++){
			System.out.println("Trabajador " +l +":" +sueldom[l]);
			}
		}
		
		
		if (turno == 2){
		System.out.println("Cuantos trabajadores se desea almacenar el sueldo:");
		numtrabaj = teclado.nextInt();
		numtrabaj = numtrabaj +1;
		float sueldon[] = new float[numtrabaj];
		
			for (int j = 1; j <sueldon.length; j++) {
				System.out.println("Introduce el sueldo del empleado numero " + j);
				sueldon[j] = teclado.nextInt();
			}
			System.out.println("Sueldos de los trabjadores del turno de tarde");
			for (int g=1;g<sueldon.length;g++){
			System.out.println("Trabajador " +g +":" +sueldon[g]);
					
				} 

			}

		
			
		
		}
	}
	














































































	



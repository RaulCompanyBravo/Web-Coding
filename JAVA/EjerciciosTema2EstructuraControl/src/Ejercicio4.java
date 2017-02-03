import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int i;
		float suma = 0;
		int vecescoche;
		float preciocoche = 0;
		float max = 0;
		float min = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cunatos coches hay?");
		vecescoche = teclado.nextInt();
		for (i = 1; i <= vecescoche; i = i + 1) {
			System.out.println("Introduce el precio del coche:");
			preciocoche = teclado.nextInt();
			suma = suma + preciocoche;

			if (i==1){										//Para saber el minimo y el maximo en un for | HASTA ABAJO
				max=preciocoche;
				min=preciocoche;
			}
				
			if (preciocoche>max){
				max = preciocoche;
			}
			
		}	if (preciocoche<min){
				min = preciocoche;
		}													//Para saber el minimo y el maximo en un for | HASTA ARRIBA
		System.out.println("-------------");
		System.out.println("Maximo: " +max);
		System.out.println("Minimo: " +min);
		}
		

	
}



// }


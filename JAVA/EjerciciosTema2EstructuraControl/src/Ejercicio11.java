import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		float sueldo = 1;
		float suma = 1;
		float max = 0;
		float min = 0;
		float i = 1;
		int veces = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos suledos desea introduzir:");
		veces = teclado.nextInt();
		for (i = 1; i <= veces; i = i + 1) {
				System.out.println("Introduce un sueldo:");
				sueldo = teclado.nextFloat();
				suma = suma + sueldo;

				if (i == 1) {

					max = sueldo;
					min = sueldo;
				}

				if (sueldo > max) {
					max = sueldo;
				}

			}
			if (sueldo < min) {
				min = sueldo;
			}
			System.out.println("-------------");
			System.out.println("Maximo: " +max);
			System.out.println("Minimo: " +min);
		}

	}


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int valores[] = new int[11];
		int max = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		for (int j = 1; j < 11; j++) {
			System.out.println("Introduce el valor numero " + j);
			valores[j] = teclado.nextInt();
		}
		for (int g = 1; g < 11; g++) {
			if (valores[g] > max) {
				max = valores[g];
				contador = contador + 1;
				// System.out.println("Contador --> " + contador);
				// System.out.println("Max --> " + max);

			}

		}

		if (contador == 10) {
			System.out.println("Estan ordenador de menor a mayor");
		} else {
			System.out.println("No están ordenados de menor a mayor");
		}
	}

}

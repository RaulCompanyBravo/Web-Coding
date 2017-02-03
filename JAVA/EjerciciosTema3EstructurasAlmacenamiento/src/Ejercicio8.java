import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un valor");
			v[i] = teclado.nextInt();

		}// inicializacion vector
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (v[j] > v[j + 1]) {// si no estan de menor a mayor
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}

			}
		}
		System.out.println("Ordenados de menor a mayor: " +v[0] +"-" +v[1] +"-" +v[2] +"-" +v[3] +"-" +v[4]);
	
	}

}

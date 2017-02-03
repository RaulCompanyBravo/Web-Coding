import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numvalores;
		int min = 0;
		int i = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuantos valores desea intrducir:");
		numvalores = teclado.nextInt();
		// numvalores = numvalores +1;
		int v[] = new int[numvalores];

		for (int r = 0; r < numvalores; r++) {
			System.out.println("Introduce un valor:");
			v[r] = teclado.nextInt();
			
			if (r == 0){
				min = v[r];
			}
		
			if (v[r] < min) {
				min = v[r];
			}

		}
		System.out.println("El minimo es: " + min);
	}
}

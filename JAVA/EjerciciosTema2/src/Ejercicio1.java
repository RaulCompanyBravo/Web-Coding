import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		float a�o;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un a�o: ");
		a�o = teclado.nextInt();

		if (a�o == 2014) {
			System.out.println("Presente");
		} else {
			if (a�o > 2014) {
				System.out.println("Futuro");
			} else {
				System.out.println("Pasado");
			}
		}

	}

}

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		float año;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un año: ");
		año = teclado.nextInt();

		if (año == 2014) {
			System.out.println("Presente");
		} else {
			if (año > 2014) {
				System.out.println("Futuro");
			} else {
				System.out.println("Pasado");
			}
		}

	}

}

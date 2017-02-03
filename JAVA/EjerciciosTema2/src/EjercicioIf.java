import java.util.*;

public class EjercicioIf {
	public static void main(String args[]) {
		float nota;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una nota: ");
		nota = teclado.nextFloat();

		if (nota > 10) {
			System.out.println("Error, introduzca una nota valida");
		} else {
			if (nota >= 5) {
				System.out.println("Esta aprobado/a");
			} else {
				System.out.println("Esta suspendido/a ");
			}
		}

	}
}

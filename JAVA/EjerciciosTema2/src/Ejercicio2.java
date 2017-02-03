import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		float a;
		float b;
		float c;
		float p;
		float A;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la longitud de los lados del triangulo");
		System.out.println("Introduzca el primer lado : ");
		a = teclado.nextFloat();
		System.out.println("Introduzca el segundo lado : ");
		b = teclado.nextFloat();
		System.out.println("Introduzca el tercer lado : ");
		c = teclado.nextFloat();

		if (a == b && b == c) {
			System.out.println("Es un triángulo equilátero");
		} else {
			if (a == b || a == c || b == c) {
				System.out.println("Es un triángulo isoceles");
			} else {
				if (a != b || a != c || c != b) {
					System.out.println("Es un triángulo escaleno");
				}
			}

			p = (a + b + c) / 2;
			A = (float) Math.sqrt(((p * (p - a) * (p - b) * (p - c))));
			System.out.println("La area es : " + A);

		}
	}
}

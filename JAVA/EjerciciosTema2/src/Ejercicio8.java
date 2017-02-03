import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzaca el precio del primer producto: ");
		A = teclado.nextInt();
		System.out.println("Introduzaca el precio del segundo producto: ");
		B = teclado.nextInt();
		System.out.println("Introduzaca el precio del tercer producto: ");
		C = teclado.nextInt();

		if (A>B && A>C && B>C) { // A=1 B=2 C=3 --> 321
			System.out.println(": " + A + B + C);
		} else {
			if (B>A && B>C && C>A) { // A=1 B=9 C=7 -->  971
				System.out.println(": " + B + C + A);
			} else {
				if (C>A && C>B && B>A) { // A=2 B=3 C=4 --> 432
					System.out.println(": " + C + B + A);
					if (B>A && B>C && A>C) { // B=1 A=9 C=5 --> 951
						System.out.println(": " +A +C +B);
					} else {
						if (B>A && B>C && A>C){ // C=1 A=5 B=8 --> 851?
							System.out.println(": " +B +A +C);
						}
					}
				}
			}

		}

	}
}

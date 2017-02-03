import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int num;
		int contN = 0;
		int i = 1;

		Scanner teclado = new Scanner(System.in);

		for (i = 1; i <= 10; i = i + 1) {
			System.out.println("Introduzca un numero:");
			num = teclado.nextInt();
			if (num < 0) {
				contN = contN + 1;
			}
		}
		if (contN == 0){
			System.out.println("No hay numeros negativos");
		} else {
			System.out.println("Hay " +contN +" numeros negativos");
		}
	}

}
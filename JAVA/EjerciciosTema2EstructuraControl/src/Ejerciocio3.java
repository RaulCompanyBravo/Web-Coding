import java.util.Scanner;

public class Ejerciocio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		float media;
		int i;// variable control
		int n;// guardara num usuario
		for (i = 0; i <= 10; i++) {
			System.out.println("Introduce un numero");
			n = teclado.nextInt();
			System.out.println("Suma :" + suma);
			suma = suma + n;
		}
		media = suma / 10;
		System.out.println("Media :" + media);
	}

}

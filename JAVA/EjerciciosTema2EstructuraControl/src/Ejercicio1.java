import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		int i;
		int N;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hasta que nuemero deseas mostrar?");
		N = teclado.nextInt();
		for(i=1; i<=N; i++)
		System.out.println(i);

	}

}

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int x;
		int y;
		int opcion;
		int suma;
		int resta;
		int multi;
		int divi;
		int pot;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("-----------------");
		System.out.println("1: Suma");
		System.out.println("2: Resta  ");
		System.out.println("3: Multiplicaci�n");
		System.out.println("4: Diisi�n    ");
		System.out.println("5: Potencia    ");
		System.out.println("6: Salir    ");
		System.out.println("-----------------");
		System.out.println("Elija la opci�n deseada:");
		opcion = teclado.nextInt();
		
		System.out.println("Intriduzca el primer n�mero:");
		x = teclado.nextInt();
		System.out.println("Intriduzca el segundo n�mero:");
		y = teclado.nextInt();
		
		
		
		
		switch (opcion){
		case 1:
			suma = x+y;
			System.out.println("El resultado de la suma es: " +suma);
			

	}

}
}
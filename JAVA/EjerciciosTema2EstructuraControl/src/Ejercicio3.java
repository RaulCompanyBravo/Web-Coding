import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		int num = 1;
		int suma = 0;
		int contador = 0;
	
		Scanner teclado = new Scanner(System.in);
		
		while (contador<15){
			contador = contador + 1;
			System.out.println("Escribe un numero:");
			num = teclado.nextInt();
			suma = suma + num;
		}
		System.out.println("La suma total es: "+suma);
	}

}

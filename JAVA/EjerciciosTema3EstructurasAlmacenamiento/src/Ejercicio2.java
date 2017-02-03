import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		int vector1[] = new int [5];
		int vector2[] = new int [5];
		int vectorsuma[] = new int [5];
		int contador = 0;
		int sumavec = 0;
		Scanner teclado = new Scanner(System.in);

		
		//Vector1
		System.out.println("-------------------------------------------");
		System.out.println("Introduce los valores para el primer vector");
		System.out.println("-------------------------------------------");
		for (int s=1;s<5;s++){
			//contador = vector1[s] + 1;
			System.out.println("Introduce el valor " +s);
			vector1[s] = teclado.nextInt();
			}
		
		//vector2
		System.out.println("-------------------------------------------");
		System.out.println("Introduce los valores para el segundo vector");
		System.out.println("-------------------------------------------");
		for (int s=1;s<5;s++){
			//contador = vector1[s] + 1;
			System.out.println("Introduce el valor " +s);
			vector2[s] = teclado.nextInt();
			}
		//sumar valores 1 u valor 1 de los dos vectores
		System.out.println("-----------------------");
		for (int s=1;s<5;s++){
			vectorsuma[s] = vector1[s] + vector2[s];
			
			System.out.println("La suma de " +vector1[s] +" + " +vector2[s] +" = " +vectorsuma[s]);
			}
		
	}

}

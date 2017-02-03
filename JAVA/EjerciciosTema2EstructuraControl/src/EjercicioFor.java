/** Escribir un programa que solicite al usuario el cuantos números 
quiere leer. 
Posteriormente leerá y mostrará la suma de los números pares por 
pantalla. */
import java.util.Scanner;


public class EjercicioFor {

	public static void main(String[] args) {
		int i;
		int suma = 0;
		int vecesnum;
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cunatos números desea introducir?");
			vecesnum = teclado.nextInt();
			System.out.println("------------------------");
			for(i=1;i<=vecesnum;i=i+1){
				System.out.println("Introduce un numero:");
				num = teclado.nextInt();
				//if (num%2!=0)  //Para saber si es impar
				if (num%2==0) //Para saber si es par!!
					suma = suma + num;
				
			}
			System.out.println("La suma de los numeros pares es: " +suma);
			//System.out.println("La suma de los numeros impares es: " +suma);

	}

}

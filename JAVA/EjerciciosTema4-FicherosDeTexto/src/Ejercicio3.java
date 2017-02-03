import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException{
			
		int numero;
		int numnumeros = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos números desea introducir");
		numnumeros = teclado.nextInt();
		PrintWriter out1 = new PrintWriter("Ejercicio3SLineas.txt");
		PrintWriter out = new PrintWriter("Ejercicio3SBlancos.txt");
		for (int o=0;o<numnumeros;o++){
			System.out.printf("Introduce un número: ");
			numero = teclado.nextInt();
			out.print(numero +" ");
			out1.println(numero);
		}
		out.close();
		out1.close();
		System.out.println("--------------------------------------");
		
		//Por separado
		/** PrintWriter out1 = new PrintWriter("Ejercicio3SLineas.txt");
		for (int o=0;o<numnumeros;o++){
			System.out.printf("Introduce un número: ");
			numero = teclado.nextInt();
			out1.println(numero);
		}
		out1.close(); */ 
			
	
		
		
		
		

	}
}



import java.util.*;

public class Ejercicio4_PruebaClase {

	
	public static void main(String args[]){
	
		int v1;
		int v2;
		Scanner teclado = new Scanner(System.in);
				
		System.out.printf("Introduce el valor de x: ");
			v1 = teclado.nextInt();
		System.out.printf("Introduce el valor de y: ");
			v2 = teclado.nextInt();
		
		
		
	Ejercicio4_Clase p1 = new Ejercicio4_Clase(v1, v2);

	
	
	System.out.println(p1.obtenerx1());
	System.out.println(p1.obtenery1());
	
	p1.printPunto();
	
	}
}


import java.util.Scanner;
public class Ejercicio7_PruebaClase {
	public static void main(String args[]){
		
		 Scanner teclado = new Scanner(System.in);
		 
		 int ingresar1;
		 int retirar1;
		 
		 System.out.printf("Introduce el saldo a ingresar: ");
		 ingresar1=teclado.nextInt();
				 
		 
		 Ejercicio7_Clase c1 = new Ejercicio7_Clase();
		
		c1.ingresar(ingresar1);
		c1.mostrarvalores();
		
		
		
		System.out.printf("Introduce el saldo a retirar: ");
		retirar1=teclado.nextInt();
		
		c1.retirar(retirar1);
		c1.mostrarvalores();
		
	}

}

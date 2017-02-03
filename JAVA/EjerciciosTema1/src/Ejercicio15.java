import java.util.Scanner;
//Math.sqrt(2)
public class Ejercicio15 {
public static void main(String args[]){
		
		float L1;
		float L2;
		float L3;
		float SP = 0;
		float RES;
		
	Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		L1 = teclado.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		L2 = teclado.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		L3 = teclado.nextInt();
		
		System.out.printf("", SP=(L1+L2+L3)/2);
		
		System.out.printf("", RES=(float)Math.sqrt(SP*(SP-L1)*(SP-L2)*(SP-L3)));
		System.out.println("El area del tringulo es: " +RES);
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}

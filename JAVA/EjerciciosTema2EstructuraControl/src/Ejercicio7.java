import java.util.*;
public class Ejercicio7 {

	public static void main(String args[]) {
		int codigo;
		int contador = 0;
		int numdig;

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el codigo numeric�");
		codigo = teclado.nextInt();
		System.out.println("Cuantos digitos tiene el n�mero?");
		numdig = teclado.nextInt();
			
		while (codigo > 0){
			contador = contador + 1;
			codigo = codigo/10;
			
		}
		if (contador == numdig){
			System.out.println("El codigo introducido tiene " +contador +" digitos");
		} else {
			System.out.println("El codigo no tiene " +contador +"digitos");
		}
		
			
		
		

	}

}


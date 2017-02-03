// para  10 entre 20
import java.util.*;
public class EjercicioDoWhile {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Dame un valor en el rango de 10 entre 20 (incluidos ambos): ");
			num = teclado.nextInt();
			} while (num<10 || num>20);
		System.out.println("Correcto");
		
		
	}

}

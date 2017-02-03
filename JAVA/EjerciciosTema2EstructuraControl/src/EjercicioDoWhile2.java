import java.util.*;
public class EjercicioDoWhile2 {

	
	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("-----------------------");
			System.out.println("1. Extraer dinero");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Ultimos movimientoss");
			System.out.println("4. Salir");
			System.out.println("-----------------------");
			num = teclado.nextInt();
			} while (num !=4);
		System.out.println("Muchas gracias por usar nuerto cajero automatico");
		

	}

}

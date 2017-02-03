import java.util.*;


public class Ejercicio3_PruebaClase {

	public static void main(String[] args) {
		int precioTicket = 10;
		Ejercicio3_Clase miMaquina = new Ejercicio3_Clase(precioTicket);
		System.out.println("Es precio del ticket es: " +miMaquina.getPrice());
		System.out.println("Es balance del es: " +miMaquina.getBalance());
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Introduce una moneda: ");
		int moneda = teclado.nextInt();
		miMaquina.insertMoney(moneda);
		System.out.println("Es balance del es: " +miMaquina.getBalance());
		miMaquina.printTicket();
	}

}

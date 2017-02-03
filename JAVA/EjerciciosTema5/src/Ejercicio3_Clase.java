import java.util.Iterator;

public class Ejercicio3_Clase {

	// ATRIBUTOS
	private int price; // el precio del ticket de la maquina
	private int balance; // la cantidad de dinero que ha introducido el usuari
							// hasta el momento
	private int total;// la cantidad total de dinero acumulada por la maquin
						// con la venta de tickets

	// CONSTRUCTOR
	public Ejercicio3_Clase(int ticketCost) {
		price = ticketCost;
	}

	public int getPrice() {
		return price;
	}

	public int getBalance() {
		return balance;
	}

	public void insertMoney(int amount) {
		if (amount > 0) {
			balance = balance + 1;
		}
	}

	public void printTicket() {
		if (balance > price) {
			System.out.println("Se ha imprimido el ticket");
		} else {
			System.out.println("No se peude imprimir el ticket");
			int cantidadFalta = price - balance;
			System.out.println("La cantidad que le falta es: " + cantidadFalta);
		}
	}
}

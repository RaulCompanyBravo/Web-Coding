import java.util.Scanner;


public class Ejercicio8_PruebaClase {

	public static void main(String[] args) {
		
		Ejercicio8_Clase p1 = new Ejercicio8_Clase();
		
		System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
		System.out.println("Capacidad maxima de cafe: " +p1.capacidadMaxima);
	
		
		 Scanner teclado = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		p1.llenarCafetera();
		System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
		//System.out.println("Capacidad maxima de cafe: " +p1.capacidadMaxima);
		System.out.println("-------------------------------------------------------");

		System.out.println("PEDIR UNA TZA DE CAFÉ");
		System.out.printf("Introduce una cantidad de cafe:");
		p1.taza = teclado.nextInt();
	if (p1.taza<=p1.cantidadActual){
		p1.cantidadActual = p1.cantidadActual - p1.taza;
		
		} else {
			System.out.println("No hay suficiente cafe, se retirará el maximo posible");
			p1.taza = p1.cantidadActual;
			p1.cantidadActual = 0;
		}
	System.out.println("Valor de la taza de café: " +p1.taza);
	System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
	System.out.println("Capacidad maxima de cafe: " +p1.capacidadMaxima);
	
	System.out.println("-------------------------------------------------------");
	p1.vaciarCafetera();
	System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
	
	System.out.println("-------------------------------------------------------");
	
	System.out.printf("Cantidad que desea añadir de cafá a la cafetera: ");
	System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
int cantidadAgregar = teclado.nextInt();	
	p1.agregarCafe(cantidadAgregar);
	if (p1.cantidadActual>p1.capacidadMaxima){
	int resto;
	resto = p1.cantidadActual-p1.capacidadMaxima;
	System.out.println("Sobran " +resto +" de café");
		p1.cantidadActual = p1.capacidadMaxima;
		System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);
	} else {
		System.out.println("Cantidad actual de cafe: " +p1.cantidadActual);

	}
	
	
	}
	
	}



import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		int opcion;
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("1: Cafe solo");
		System.out.println("2: Cortado  ");
		System.out.println("3: Chocolate");
		System.out.println("4: Leche    ");
		System.out.println("-------------");
        
		System.out.println("Introduzaca la opción deseada: ");
		opcion = teclado.nextInt();
		
		
		switch (opcion){
		case 1:
			System.out.println("El cafe solo cuesta 35 centimos");
			break;
		case 2:
			System.out.println("El cafe cortado cuesta 40 centimos");
			break;
		case 3:
			System.out.println("El chocolate cuesta 30 centimos");
			break;
		case 4:
			System.out.println("La leche cuesta 35 centimos");
			break;
			
		}

	}

}

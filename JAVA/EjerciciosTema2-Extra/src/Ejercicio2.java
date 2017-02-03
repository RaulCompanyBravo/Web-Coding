import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		int nota;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzaca la nota a evaluar: ");
		nota = teclado.nextInt();
		
		if (nota>=0 && nota<=4){
			System.out.println("Suspendido");
		} else {
			if (nota>=5 && nota <=6){
				System.out.println("Aprobado");
			} else {
				if (nota>=7 && nota<=8){
					System.out.println("Notable");
				} else {
					if (nota==9){
						System.out.println("Sobresaliente");
					} else {
						System.out.println("MATRICULA DE HONOR");
					}
				}
			}
			
			
		}

	}

}

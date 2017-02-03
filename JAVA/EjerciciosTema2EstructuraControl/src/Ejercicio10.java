import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String[] args) {
		float nota = 1;
		float aprobC = 0;
		float suspC = 0;
		float condC = 0;
		float contador = 0;
		while (nota >=0){
			if (contador == 6){
				break;
			} else {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce una nota:");
			nota = teclado.nextFloat();
			contador = contador + 1;
			if (nota <=3){
				suspC = suspC +1;
			} else {
				if (nota ==4){
				condC = condC + 1;	
				} else {
					if (nota >=5){
						aprobC = aprobC + 1;
						
					}
				}
				}
			}
			
		}
		System.out.println("Numero de suspendidos: " +suspC);
		System.out.println("Numero de condicionados: " +condC);
		System.out.println("Numero de aprobados: " +aprobC);
	}
	
}





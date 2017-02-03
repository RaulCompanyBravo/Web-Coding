import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		String nombres[] = new String[8];
		int sueldo[] = new int[8];
		Scanner teclado = new Scanner(System.in);
		int max = 0;
		int num = 0;
		int p;
		for (int j = 0; j < 5; j++) {

			System.out.println("Introduce nombre del trabajador");
			nombres[j] = teclado.next();

			System.out.println("Introduce el sueldo del trabajdor "+nombres[j]);
			sueldo[j] = teclado.nextInt(); 
			
			
			if (sueldo[j] > max){
				max = sueldo[j];
				num = j;
			}
			
		}
		System.out.println("El sueldo maximo es de "+nombres[num] +" que es: " +max);
		
	}
}

import java.util.*;
public class EjercicioWhile2 {

	public static void main(String[] args) {
		int num = 1;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		while (num >=0){
			System.out.println("Introduce un numero:");
			num = teclado.nextInt();
			if (num >=0){
				suma = suma + num;
			} else {
			}
		}
		
		System.out.println("La suma total es: " +suma);

	}

}

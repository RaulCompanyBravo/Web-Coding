import java.util.*;
public class EjercicioWhile {

	public static void main(String[] args) {
		
		int num = 1;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		while (num !=0){
			System.out.println("Introduce un numero:");
			num = teclado.nextInt();
			suma = suma + num;
		}
		
		System.out.println("La suma total es: " +suma);

		}

			
		}




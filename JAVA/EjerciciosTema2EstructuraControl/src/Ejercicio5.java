import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		float edad = 1;
		int i;
		float media = 0;
		float suma = 0;
		float contador = 0;
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("------------------------");
			while (edad>0){
				System.out.println("Introduce un numero:");
				edad = teclado.nextFloat();
				if (edad !=0){
				suma = suma + edad;
				contador = contador + 1;
				media = suma/contador;
				} else {
					
				}
			
			}
			//System.out.println("Suma:" +suma);
			System.out.println("La media es: " +media);
	
			}
	

}

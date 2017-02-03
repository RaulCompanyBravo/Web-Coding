/** Solicitar al usuario el número de valores enteros que va a introducir. 
A continuación leer cada uno de esos valores. 
Calcular el valor máximo y mínimo.  */
import java.util.*;
public class EjercicioForMaxMin {

	public static void main(String[] args) {
		int numvalores; 
		int valoruser = 0; 
		int i;
		int max = 0;
		int min = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos valores desea introducir?");
		numvalores = teclado.nextInt();
		
		System.out.println("----------------");
		for (i=1;i<=numvalores;i=i+1){
			System.out.println("Introduce un numero:");
			valoruser = teclado.nextInt();
			
			if (i==1){										//Para saber el minimo y el maximo en un for | HASTA ABAJO
				max=valoruser;
				min=valoruser;
			}
				
			if (valoruser>max){
				max = valoruser;
			}
			
		}	if (valoruser<min){
				min = valoruser;
		}													//Para saber el minimo y el maximo en un for | HASTA ARRIBA
		System.out.println("-------------");
		System.out.println("Maximo: " +max);
		System.out.println("Minimo: " +min);
		
	}

}

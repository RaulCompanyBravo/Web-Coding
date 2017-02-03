import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		float edad = 1;
		float suma = 0;
		float media = 0;
		float contador = 0;
		float max = 0;
		float min = 0;
		int contadormayor = 0;

		Scanner teclado = new Scanner(System.in);{
			while (edad>0) {
				System.out.println("Introduce una edad:");
				edad = teclado.nextFloat();
					suma = suma + edad;
					contador = contador + 1;
					media = suma / contador;
					if (edad >= 65){
						contadormayor = contadormayor +1;
					} 
					  
					if (edad==0){										
						max=edad;
						min=edad;
					}
						
					if (edad>max){
						max = edad;
					}
					
				}	if (edad<min){
						min = edad;
				}					
					
					
									

				}
			
		
			
			
		System.out.println("Maximo: " + max);
		System.out.println("Minimo: " + min);
		System.out.println("Media: " + media);
		System.out.println("Mayores de 65: " +contadormayor +" personas");
	}

}

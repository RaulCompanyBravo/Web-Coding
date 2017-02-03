import java.util.*;


public class Ejercicio1 {

	public static void main(String[] args) {
		int valores[] = new int [9];
		int suma = 0;
		int mayor = 0;
		int mayor2 = 0;
		
		Scanner teclado = new Scanner(System.in);

		for (int s=1;s<9;s++){
			System.out.println("Introduce el valor número " +s);
			valores[s] = teclado.nextInt();
			}
			
		//SUMA
		for (int j=1;j<9;j++){
			suma += valores[j]; 
		}
			//System.out.println(suma);
			System.out.println("-----------------------------------------------------");
		
			//MAYORES QUE 36
		for (int b=1;b<9;b++){
			
			if (valores[b] >= 36 && valores[b] <50){
				mayor = mayor + 1;
			}
		}
		System.out.println("Hay " +mayor +" persona/s mayor/es de 36 pero menor de 50");
		
		//MAYORES QUE 50
				for (int b=1;b<9;b++){
					if (valores[b] >= 50){
						mayor2 = mayor2 + 1;
					}
				}
				System.out.println("Hay " +mayor2 +" persona/s mayor/es de 50");
		
		

	
	
	
	
	
	
	
	
	
	
	}
		
	}



import java.util.*;


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad [] = new int[6];
		String nombre[] = new String[6];
		int numnombres[] = new int[6];
		
		
		
		for (int i=1;i<nombre.length;i++){
			System.out.println("Introduce un nombre:");
			nombre[i] = teclado.nextLine();
		}
			
		
		for (int k=1;k<edad.length;k++){
			System.out.println("Introduce la edad de " +nombre[k] +":");
			edad[k] = teclado.nextInt();
			}
			
		for (int g=1;g<6;g++){
			
			if (edad[g]>=18){
				System.out.println(nombre[g] +" es mayor de 18 años");
		}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

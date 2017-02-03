import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		int i = 1;
		int u = 0;
		int CI = 0;
		int numfamilia;
		int numhijos;
		int contfamilia = 0;
		int contadorfamilia = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de familias");
		numfamilia = teclado.nextInt();
		
		for (i=1;inumfamilia;i++){
			contadorfamilia = contadorfamilia + 1;
			
				System.out.println("Familia "+contadorfamilia);
				System.out.println("-------------------------------");
			
				System.out.println("Introduce la cantidad de hijos:");
				numhijos = teclado.nextInt();
				
			for (u=0;u==numhijos;u++ ){
				System.out.println("Introduce el CI:");
				CI = teclado.nextInt();
			}
				
				//calulomazmin
				
				
			
		}
		
		
		
		
		
		
		
	}

}

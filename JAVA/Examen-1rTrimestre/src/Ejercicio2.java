import java.util.*;


public class Ejercicio2 {

	public static void main(String[] args) {
		int vector[] = new int[6];
		int min = 10000000;
		int cont = 0;
		boolean rep = false;
	
		Scanner teclado = new Scanner (System.in);
		for (int b=0;b<5;b++){
			System.out.println("Introduzca un número:");
			vector[b] = teclado.nextInt();
			
			
			if( vector[b]==0){
				min = vector[b];
			}
			
			if (vector[b] < min){
				min = vector[b];
			}
			
			//System.out.println("El vector contiene estos valores" +vector[b] +" ");
		}
		System.out.println("El vector contiene los siguentes elementos:");
		for (int b=0;b<5;b++){
			System.out.print(vector[b] +" ");
			
			if (vector[b] == min){
				cont = cont + 1;
			}
			
			if (vector[b] == vector[b+1]){
				rep = true;
			}
		
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		if(cont == 1){
			System.out.println("El valor mínimo del vector eno se repite");
		} else {
			System.out.println("El valor mínimo del vector es " +min +" y se repite " +cont);
		}
		
		System.out.println("¿Existen dos valores en posiciones consecutivas iguales?: " +rep );
		
	}

}

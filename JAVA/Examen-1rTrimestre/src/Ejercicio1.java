import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		int trabajdep = 0;
		float numventastrabaj = 0;
		int numdepar = 0;
		float sumanumventastrabaj = 0;
		float medianumventastrabaj = 0;
		float maxmedianumventastrabaj = 0;
		float minmedianumventastrabaj = 100000;
		float numdeparmaxmedia = 0;
		float numdeparminmedia = 0;
		int j;
		int u;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el numero de departamentos:");
		numdepar = teclado.nextInt();
		
		for (j=0;j<numdepar;j++){
			sumanumventastrabaj = 0;
			System.out.println("------------------------------------------------");
			System.out.println("Introduzca información sobre el departamento " +j);
			System.out.println("------------------------------------------------");
			System.out.println("Introduzaca el número de trabajadores");
			trabajdep = teclado.nextInt();
			
			
			for (u=0;u<trabajdep;u++){
				System.out.println("Ventas del trabajador " +u);
				numventastrabaj = teclado.nextInt();
				
				sumanumventastrabaj = sumanumventastrabaj + numventastrabaj;
				medianumventastrabaj = sumanumventastrabaj/trabajdep;
				
				
				//System.out.println("Departamento mejor media, mas alta: " +maxmedianumventastrabaj);
				
				
			}
			if (medianumventastrabaj == 0){
				minmedianumventastrabaj = medianumventastrabaj;
				
				
			}
			
			if (medianumventastrabaj < minmedianumventastrabaj){
				minmedianumventastrabaj = medianumventastrabaj;
				numdeparminmedia = j;
				
			}
			
			if (medianumventastrabaj > maxmedianumventastrabaj){
				maxmedianumventastrabaj = medianumventastrabaj;
				numdeparmaxmedia = j;
				
			} 
			
			
		
				
			System.out.println("La media de ventas del departamento " +j +" entre los " +trabajdep +" trabajadores es: " +medianumventastrabaj);
		}
		System.out.println("Resultados generales:");
		System.out.println("---------------------");
		System.out.println("El departamento con menor número medio  de ventas por trabajadores es: " +(int)numdeparminmedia +" con " +minmedianumventastrabaj);
		System.out.println("El departamento con mayor número medio  de ventas por trabajadores es: " +(int)numdeparmaxmedia +" con " +maxmedianumventastrabaj);
	}

}

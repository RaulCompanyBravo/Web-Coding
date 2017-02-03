import java.util.Scanner;

public class CopyOfEjercicioCircoDuSolei2nParte {

	public static void main(String[] args) {
		int numciudades;
		int opcion;
		int max = 0;
		int suma = 0;
		int media =0;
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Cuantas ciudades deseas introducir?");
	numciudades = teclado.nextInt();
	//String ciudad[] = new String [numciudades];
	String nombreCiudad[] = new String [numciudades];
	int numActuaciones[] = new int [11];
	int numIngresos[] = new int [numciudades];
	String nombreCiudad1 = null;
	int contador[] = new int[11];
	int min = 10000;
	int ciudadinIngresos = 0;
	
	
	
	for (int i=0;i<numciudades;i++){
		for (int f=0;f<numciudades;f++){
			System.out.println("-----------------------------------------------");
			System.out.println("Introduce nombre de la ciudad");
				nombreCiudad[f] = teclado.next();
			
			do{	
			System.out.println("Introduce el número de actuaciones en esa ciudad (Maximo = 10)");
				numActuaciones[f] = teclado.nextInt();
			} while (numActuaciones[f]>10);
			System.out.println("Introduce los ingresos obtenidos");
				numIngresos[f] = teclado.nextInt();
			}
	
	
	
	do{
		System.out.println("------------------------------------");
		System.out.println("Selecciona una opción para continuar");
		System.out.println("1) Mostrar actualizaciones");
		System.out.println("2) Recaudación máxima");
		System.out.println("3) Recaudación mínima");
		System.out.println("4) Historiograma de actuaciones");
		System.out.println("5) Ingresos medios");
		System.out.println("6) Salir");
		opcion = teclado.nextInt();
		System.out.println("------------------------------------");
		
		switch (opcion){
		case 1:
			System.out.println("Actualizaciones");
			System.out.println("---------------");
			System.out.println("Introduce nombre de la ciudad");
			//System.out.println(nombreCiudad[0] +" - Para comprobar"); //Comprobar
			//System.out.println(nombreCiudad[1] +" - Para comprobar"); //Comprobar
			nombreCiudad1 = teclado.next();
		
			
			boolean encontrado = false;
			while (!encontrado){
				
					if (nombreCiudad1.equals(nombreCiudad[i])){
						encontrado = true;
						System.out.println("El numero de actuaciones de " +nombreCiudad[i] +" es " +numActuaciones[i] + " y se a obtenido unos ingresos de " +numIngresos[i]);
					} else {
						i++;
					}
				
			}
			System.out.println();
			System.out.println();
			break;
		case 2:
			System.out.println("Recaudación máxima"); // 
			System.out.println("------------------");
			
			for (int b=0;b<numciudades;b++){
				if (numIngresos[b] > max){
					max = numIngresos[b];
					ciudadinIngresos = b;
				}
			}
			
			System.out.println("La ciedad con mayor recaudación es: " +nombreCiudad[ciudadinIngresos] +" con " +numIngresos[ciudadinIngresos]);
			System.out.println();
			System.out.println();
			break;
			
			
		case 3:
			System.out.println("Recaudación mínima");
			System.out.println("------------------");
			for (int w=0;w<numciudades;w++){
				if (numIngresos[w] == 0){
				min = w;
				}
				if (numIngresos[w]<min){
					min = numIngresos[w];
				    ciudadinIngresos = w; 
				}
			}
			
		System.out.println("La ciedad con menor recaudación es: " +nombreCiudad[ciudadinIngresos] +" con " +numIngresos[ciudadinIngresos]);
		System.out.println();
		System.out.println();	
		break;
			
		case 4: 
			System.out.println("Historiograma de actuaciones");
			System.out.println("----------------------------");
			
			for (int c=1;c<11;c++){
				int v = 0;
				v = v + 1;
					for (int x=0;x<11;x++){
						if (numActuaciones[c+x] == v){
						contador[c] = contador[c] +1;
						}
					}
				}
			
			System.out.println();
			System.out.println();
			break;
		case 5:
			System.out.println("Ingresos medios");
			System.out.println("---------------");
			System.out.println();
			
			 for (int s=0;s<numciudades;s++){
				 suma+= numIngresos[s];
				 System.out.println(suma +" - Para comprobar"); //Comprobar
				 media = suma/numciudades;
				 
			 }
			 System.out.println("La media de ingresos entre las " +numciudades +" es " +media);
			 System.out.println("Ciudades con ingresos mayores que la media:");
			 for (int m=0;m<numciudades;m++) {
				 if (numIngresos[m]>media){
					 System.out.println(nombreCiudad[m] +" con unos ingresos de " +numIngresos[m]);
				 }
			 }
			 System.out.println();
			 System.out.println();
			break;
			
		case 6:
			opcion = 6;
			break;
		
		} 
		
		
		
	} while (opcion!=6);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	}
}

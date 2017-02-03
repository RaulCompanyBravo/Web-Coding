import java.util.*;


public class Ejercicio3 {

	public static void main(String[] args) {
		int cursoA[] = new int [7];
		int cursoB[] = new int [7];
		float sumaA = 0;
		float sumaB = 0;
		float mediaA = 0;
		float mediaB = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		//Vector1
				System.out.println("Introduce las notas del el curso A");
				System.out.println("-------------------------------------------");
				for (int s=1;s<6;s++){
					System.out.println("Introduce la nota del alumno número " +s);
					cursoA[s] = teclado.nextInt();
					sumaA += cursoA[s];
					mediaA = sumaA/5; 
					}
				//System.out.println("Suma curso A: " +sumaA);
							System.out.println("Media curso A: " +mediaA);
				
				System.out.println("-------------------------------------------");
				//Vector2
				System.out.println("Introduce las notas del el curso B");
				System.out.println("-------------------------------------------");
				for (int s=1;s<6;s++){
					System.out.println("Introduce la nota del alumno número " +s);
					cursoB[s] = teclado.nextInt();
					sumaB += cursoB[s];
					mediaB = sumaB/5;
					}
							System.out.println("Media curso B: " +mediaB);		
				
				System.out.println("-------------------------------------------");
				
				
				//Mostrar mejor promedio de los dos cursos
				if (mediaA == mediaB){
					System.out.println("El promedio de los dos cursos son iguales");
				} else {
					if (mediaA > mediaB){
						System.out.println("El promedio del curso A es superior al del curso B");
					} else {
						if (mediaB > mediaA){
						System.out.println("El promedio del curso B es superior al del curso A");
						}
					}
				}
	
	}

}

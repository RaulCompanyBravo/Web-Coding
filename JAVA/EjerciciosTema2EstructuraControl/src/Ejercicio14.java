import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int edad = 0;
		float estatura = 0;
		int i = 1;
		int sumaedad = 0;
		float sumaestatura = 0;
		float mediaedad = 0;
		float mediaestatura = 0;
		int mayoredadcont = 0;
		int mayoralturacont = 0;

		Scanner teclado = new Scanner(System.in);

		for (i = 1; i < 6; i = i + 1) {
			System.out.println("------------------------------");
			System.out.println("Introduzca la edad del alumno:");
			edad = teclado.nextInt();
			if (edad >=18) { mayoredadcont = mayoredadcont + 1;}
			sumaedad = sumaedad + edad;
			mediaedad = sumaedad/5;
			
			
			System.out.println("Introduzca la estaura del alumno:");
			estatura = teclado.nextFloat();
			if (estatura >=1.75){mayoralturacont = mayoralturacont + 1;}
			sumaestatura = sumaestatura + estatura;
			mediaestatura = sumaestatura/5;
			

		}
		System.out.println("Media de las edades de los alumnos: " +mediaedad);
		System.out.println("Media de la estaura de los alumnos: " +mediaestatura);
		System.out.println("Alumnos mayores de edad: " +mayoredadcont);
		System.out.println("Alumnos que miden mas de 1.75: " +mayoralturacont);
	}

}

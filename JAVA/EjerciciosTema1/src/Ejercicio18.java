import java.util.Scanner;


public class Ejercicio18 {
	public static void main(String[] args) {
		double a = 7;
		double b = 3; 
		double c = -5;
		double x1;
		double x2;
		double raiz;
		double equacion;
		double equacion2;
		
		raiz =(Math.pow(b, 2)-4*(a*c));
		
		x1 =-b+ Math.sqrt(+ raiz)/(2*a);
		equacion = a*Math.pow(x1, 2) + b*x1 + c;
			System.out.println("El valor de la equación es: " +equacion);
		
		x2 =-b- Math.sqrt(+ raiz)/(2*a);
		equacion2 = a*Math.pow(x1, 2) + b*x1 + c;
			System.out.println("El valor de la segunda equacion es: " +equacion);
		
		
		

		
		
		
	//x1 = -b + Math.sqrt(Math.pow(b, 2)-4*(a*c))/(2*a);
	//x2 = -b - Math.sqrt(Math.pow(b, 2)-4*(a*c))/(2*a);
	
	//System.out.println("El resultado de x1:" +x1);
	//System.out.println("El resulatado de x2:" +x2);

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

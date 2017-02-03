import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String args[]){
	double pi = 3.14;
	float radio;
	float superficie;
	float volumen;
	
		Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca el valor del radio: ");
			radio = teclado.nextInt();
	
	System.out.printf("", superficie=(float)(4*pi*Math.pow(radio, 2)) );
	System.out.println("La supericie de la esfera es: " +superficie);
	
	System.out.printf("", volumen=(float)((4/3)*pi*Math.pow(radio, 3)));
	System.out.println("El volumen de la esfera es: " +volumen);
	
}
}
import java.util.*;
public class testcodigoprotegido {

	public static void main(String[] args) {
		
		try{
	 	 	 int a =2;
	 	 	 int b;
	 	 	 Scanner teclado = new Scanner(System.in);
	 	 	 b = teclado.nextInt();
	 	 	 System.out.println("El resultado de la división es:");
	 	 	 System.out.println(a/b);
	 	 }catch(ArithmeticException e){
	 	 	 System.out.println("La excepción es :" + e);
	 	 	System.out.println("Continua con el programa despues de la excepción");
	 	 }



	}

}

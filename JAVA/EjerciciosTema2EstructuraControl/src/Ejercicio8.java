import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		char letra;
		int mayus1;
		int mayus2;
		char r;
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduze el texto");
		letra = teclado.next().charAt(0);
			
			if (letra >='a' && letra<='z'){
			} else {
				if (letra >='A' && letra<='Z'){
					
				}
			}

				mayus1 = letra - 'a';
				mayus2 = mayus1 + 'A';
				r = (char)mayus2;
				System.out.println("Mayuscula: " +r);
	}
			
}









//System.out.println(miCadena.toUpperCase()); //Tambien con un alinaehruodsgfdsjk
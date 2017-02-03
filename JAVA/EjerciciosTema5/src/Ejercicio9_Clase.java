import java.util.Scanner;


public class Ejercicio9_Clase {

	long  DNI;
	String letraDNI;

	//28115776R   ||8 num||
	
	
	
	public Ejercicio9_Clase(){
		DNI = 00000000;
		letraDNI =" ";
	}
	
	public Ejercicio9_Clase(String numDNI){
		String DNI = numDNI;

		
		
	}

		//METODOS

	public void leer(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número del DNI");
		DNI = teclado.nextLong();
		
	}
	
	
	
	
}



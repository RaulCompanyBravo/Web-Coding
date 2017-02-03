import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Ejercicio1 {



	public static void main(String[] args) {
		
/**Realizar un programa que lea un chero de texto palabra
  a palabra separadas por una coma y convierta cada 
  palabra a minusculas. */
		
		Scanner in = null;
		String palabra;
		try {
		in =  new Scanner(new FileReader("Ejercicio2.txt")); 			
		in.useLocale(Locale.ENGLISH);
			while (in.hasNext()){
				 palabra = in.next();
				System.out.printf(palabra.toUpperCase()+" ");
			}
		} catch (FileNotFoundException e){
			System.out.println("Error abriendo el fichero "); 
		} finally {
			if (in != null){
				in.close();
			}
		}
	}
}

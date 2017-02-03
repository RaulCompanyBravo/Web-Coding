import java.io.*;
import java.util.*;



public class Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(new FileReader("Ejercicio2.txt"));
		in.useDelimiter(",");
		String palabra;
		try {
		  			
		in.useLocale(Locale.ENGLISH);
			while (in.hasNext()){
				 palabra = in.next();
				System.out.printf(palabra.toLowerCase()+" ");
			}
		} catch (NoSuchElementException e){
			System.out.println("Error abriendo el fichero "); 
		} finally {
			if (in != null){
				in.close();
			}
		}
	}

	}



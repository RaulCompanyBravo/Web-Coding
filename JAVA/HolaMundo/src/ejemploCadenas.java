public class ejemploCadenas{
public static void main(String[] args)
{
	 	 String cad1 = "Ciclo DAW";
	 	 String cad2 = "Programaci�n";
	 	 System.out.printf("La cadena cad1 es: %s y cad2 es: %s", cad1, cad2);
	 	 System.out.printf("\nLa longitud de cad1: %d", cad1.length());
	 	 //concatenaci�n de cadenas (concat o bien operador +)
	 	 System.out.printf("\nConcatenaci�n: %s", cad1.concat(cad2));
	 	 //comparaci�n de cadenas
	 	 System.out.printf("\ncad1.equals(cad2) es %b", cad1.equals(cad2));
	 	 System.out.printf("\ncad1.equalsIgnoreCase(cad2) es %b", 
cad1.equalsIgnoreCase(cad2));
System.out.printf("\ncad1.compareTo(cad2) es %d", cad1.compareTo(cad2));
	 	 //obtenci�n de subcadenas
	 	 System.out.printf("\ncad1.substring(0,5) es %s", cad1. substring(0,5));
	 	 //pasar a min�sculas
	 	 System.out.printf("\ncad1.toLowerCase() es %s", cad1.toLowerCase());
	 	 System.out.println();
}
}
import java.util.*;
public class EjemploIfString {
	public void main (String args[]){
		
		Scanner reader = new Scanner(System.in); 
			System.out.println("Introduce un mes: "); 
		int mes = reader.nextInt(); 
		String estacion = null; 
		if (mes == 12 || mes == 1 || mes == 2) 
		estacion = "Invierno"; 
		else if (mes == 3 || mes == 4 || mes == 5) 
		estacion = "Primavera"; 
		else if (mes == 6 || mes == 7 || mes == 8) 
		estacion = "Verano"; 
		else if (mes == 9 || mes == 10 || mes == 11) 
		estacion = "Otoño"; 
		System.out.println("La estación es: "+estacion);
}
}
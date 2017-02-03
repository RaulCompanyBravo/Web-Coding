/**Escribir un programa en Java que pregunte un nombre, direcci´on y tel´efono 
 * y escriba en pantalla una ficha con dicha información. */
import java.util.*;
public class Ejercicio9 {
	 public static void main(String args[]){
		 String nombre;
		 String direccion;
		 int  telefono;
//Pide por pantalla
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Introduzca los siguientes valores: ");
		 System.out.println("Nombre: ");
         nombre = teclado.nextLine();
    	 System.out.println("Direción: ");
         direccion = teclado.nextLine();
         System.out.println("Edad: ");
         telefono = teclado.nextInt();
         //Muestra por pantalla los datos obtenidos anteriormente
         System.out.println("---------------------------------");
         System.out.println("Nombre:    "+ nombre);
         System.out.println("Dirección: "+ direccion);
         System.out.println("Teléfono:  "+ telefono);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}

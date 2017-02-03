import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		float gcent;
		
		  Scanner teclado = new Scanner(System.in);
		  System.out.println("Intriduzca la temperatura en grados celcius: ");
          gcent = teclado.nextFloat();
          
          if (gcent<0){
        	  System.out.println("Estado Solido");
          } else {
        	  if (gcent>100){
        		  System.out.println("Estado Gaseoso");
        	  } else {
        		  System.out.println("Estado Liquido");
        	  }
          }

	}

}

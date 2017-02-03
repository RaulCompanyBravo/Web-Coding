import java.util.*;
public class Ejercicio5 {
	public static void main(String args[]) {
		float A;
		float B;
		float C;
		float raizc = 0;
		float x1 = 0;
		float x2 = 0;
		float x;
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Intrduzca la incognita A: ");
    A = teclado.nextFloat();
    System.out.println("Intrduzca la incognita B: ");
    B = teclado.nextFloat();
    System.out.println("Intrduzca la incognita C: ");
    C = teclado.nextFloat();	
    
    
    raizc =(float)Math.sqrt((float)Math.pow(B,2)) -4*(A*C);
	x1 = ((-B - raizc))/2;
	x2 = ((-B + raizc))/2;
	System.out.println("Las raizes de la equación: " +x1 +" y " +x2);
    
    
   /** if (A==0){
    	x = -C/2;
    } else {
    	if (raizc==0){
    		x = -B/(2*A);
    	} else {
    		if (raizc>0){
    			x1 = ((-B - raizc))/2*A;
    			x2 = ((-B + raizc))/2*A;
    		} else {
    			System.out.println("MuerteSatanicaaa: ");
    			
    		}
    	}
    }
    */
   	
    
    
    
    
    
    
    
    
    
    
    
    
	// System.out.println("Las raizes de la equación:" +x1 +"y" +x2);
	//x1 = ((-B - raizc))/2;
	//x2 = ((-B + raizc))/2;
	//System.out.println("Las raizes de la equación:" +x1 +"y" +x2);
		
		
		
		
		
		
		
		
	}
}

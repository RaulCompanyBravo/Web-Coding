import java.util.*;

public class Ejercicio9 {
	
	 public static void main(String args[]){
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 String v[] = new String[5];
			for(int i=0;i<5;i++){
			
				System.out.printf("Introduce un país: ");
				v[i] = teclado.next();
				
			}

			for(int i=0;i<5;i++){
				for(int j=0;j<4/*j<4-i*/;j++){
					if(v[j].compareTo(v[j+1])>0){
						String aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		 for(int i=0;i<5;i++){
			System.out.println(""+v[i]);
		 }
		 
	 }

}

import java.util.*;
public class Ejercicio3 {
	public static void main(String args[]){
		int C1;
		int C2;
		
		Scanner teclado = new Scanner(System.in);
				System.out.println("Introduzca las cordenadas ");
				System.out.println("Introduzca la primera coordenada: ");
						C1 = teclado.nextInt();
				System.out.println("Introduzca las segunda coordenada: ");
						C2 = teclado.nextInt();
						

			if (C1 < 0 && C2 >0){
				System.out.println("Se encuantra en el cuadrante superior izquerda ");
			} else {
				if (C1 > 0 && C2 > 0){
					System.out.println("Se encuantra en el cuadrante superior derecha ");
				} else {
					if (C1 < 0 && C2 < 0){
						System.out.println("Se encuantra en el cuadrante inferior izquierda ");
					} else {
						if  (C1 > 0 && C2 < 0 ){
							System.out.println("Se encuantra en el cuadrante inferior derecha ");
						} else {
							if (C1 == 0 && C2 !=0){
								System.out.println("Se encuantra en el eje Y ");
							} else { 
								if (C1 != 0 && C2 ==0){
									System.out.println("Se encuantra en el eje X ");
							} else { 
								System.out.println("Es el origen de coordenadas ");
								}
							}
						}
					}
				}
			}
		
		
		
	}
}

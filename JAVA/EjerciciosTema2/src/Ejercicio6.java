import java.util.*;
public class Ejercicio6 {
	public static void main(String[] args) {
		float E1;
		float E2;
		float E3;
		float E4;
		//double min;
		//double minf;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la edad del primer sujeto: ");
		 E1 = teclado.nextInt();
		System.out.println("Introduzca la edad del segundo sujeto: ");
		E2 = teclado.nextInt();
		System.out.println("Introduzca la edad del tercer sujeto: ");
		E3 = teclado.nextInt();
		System.out.println("Introduzca la edad del quarto sujeto: ");
		E4 = teclado.nextInt();
		
		if (E1<E2 && E1<E3 && E1<E4){
			System.out.println("La edad del primer sejeto es menor");
		} else {
			if (E2<E1 && E2<E3 && E2<E4){
				System.out.println("La edad del segundo sejeto es menor");
			} else {
				if (E3<E1 && E3<E2 && E3<E4){
				System.out.println("La edad del tercer sejeto es menor");
				} else {
					System.out.println("La edad del quarto sejeto es menor");
				}
			}
		}
		

		
		
		
	
		
		//Solición sin "if"
		//min = Math.min(E1,E2);
		//minf = Math.min(min, E3);
		//System.out.println("La edad mas baja es" +minf);
		
		
		

	}

}

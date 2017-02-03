import java.util.Scanner;


public class EjercicioForTablaMultiplicar {

	public static void main(String[] args) {
		int numerouser;
		int i;
		int calc;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("De que número quieres mostrar la tabla de multiplicar?");
			numerouser = teclado.nextInt();
			System.out.println("----------------");
			for (i=1;i<=10;i=i+1){
				
				calc = numerouser*i;
				System.out.println( +numerouser +" x " +i +" = " +calc );
			}

	}

}

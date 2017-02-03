import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numfactura = 0;
		int i = 1;
		float sumafacturtotal = 0;
		float sumatotallitrosvend = 0;
		float facturtotal = 0;
		float totallitrosvend = 0;
		int cont600 = 0;
		Scanner teclado = new Scanner(System.in);

		for (i = 1; i < 6; i = i + 1) {
			numfactura = numfactura + 1;
			System.out.println("--------------------");
			System.out.println("Factura " + numfactura);
			System.out.println("--------------------");
			
			System.out.println("Introduzca la facturacion:");
			facturtotal = teclado.nextInt();
			sumafacturtotal = sumafacturtotal + facturtotal;
			
			System.out.println("Introduzca la cantidad de litros vendidos:");
			totallitrosvend = teclado.nextInt();
			sumatotallitrosvend = sumatotallitrosvend + totallitrosvend;
			
			if (facturtotal > 600){
				cont600 = cont600 + 1;
			}
			
			
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("La facturacion total es: " +sumafacturtotal);
		System.out.println("La cantidad total de litros vendidos es: " +sumatotallitrosvend);
		System.out.println("El numero de facturas que emitieron mas de 600 euros es: " +cont600);
	}

}
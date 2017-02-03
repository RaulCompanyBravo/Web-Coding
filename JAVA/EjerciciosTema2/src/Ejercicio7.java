import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// String PatínPeldales;
		// String PatínMotor;
		// String TablaWindsurf;
		// String MotoAcuática;
		// int OP1;
		// int OP2;
		// int OP3;
		// int OP4;
		int usuario;
		float tiempo;
		float dinero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que tipo de vehiculo desea alquilar: ");
		System.out.println("Opción 1: Patín a peldales  |--> 2 euros/hora ");
		System.out.println("Opción 2: Patín a motor     |--> 6 euros/hora ");
		System.out.println("Opción 3: Tabla de windsurf |--> 4 euros/hora ");
		System.out.println("Opción 4: Mato acuática     |-->  7 euros/hora");
		System.out
				.println("---------------------------------------------------------");
		System.out.println("Introduzca el número de opción:");
		usuario = teclado.nextInt();
		if (usuario == 1) {
			System.out
					.println("Cuantos tiempo desea tener, introduzaca de la siguente manera: 1hora=1, 30Minutos=0,5: ");
			tiempo = teclado.nextFloat();
			dinero = tiempo * 2;
			System.out.println("Usted debe pagar: " + dinero + "€");
		} else {
			if (usuario == 2) {
				System.out
						.println("Cuantos tiempo desea tener, introduzaca de la siguente manera: 1hora=1, 30Minutos=0,5: ");
				tiempo = teclado.nextFloat();
				dinero = tiempo * 6;
				System.out.println("Usted debe pagar: " + dinero + "€");
			} else {
				if (usuario == 3) {
					System.out
							.println("Cuantos tiempo desea tener, introduzaca de la siguente manera: 1hora=1, 30Minutos=0,5: ");
					tiempo = teclado.nextFloat();
					dinero = tiempo * 4;
					System.out.println("Usted debe pagar: " + dinero + "€");
				} else {
					if (usuario == 4) {
						System.out
								.println("Cuantos tiempo desea tener, introduzaca de la siguente manera: 1hora=1, 30Minutos=0,5: ");
						tiempo = teclado.nextFloat();
						dinero = tiempo * 7;
						System.out.println("Usted debe pagar: " + dinero + "€");
					} else {
						System.out.println("Introduzaca una opción valida");

					}
				}

			}
		}

	}

}

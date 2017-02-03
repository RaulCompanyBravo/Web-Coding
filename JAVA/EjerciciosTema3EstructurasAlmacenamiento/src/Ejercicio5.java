import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int facultad;
		int sexo = 0; // cambiar
		int trabaja = 0;
		int sueldo;
		// ///////////////////////////////////////
		int hombres = 0;
		int hombrespor = 0;
		int hombrestrabajpor = 0;
		int hombrestrabajcont = 0;
		//int hombressueldo = 0;
		// ///////////////////////////////////////
		int mujeres = 0;
		int mujerespor = 0;
		int mujerestrabajpor = 0;
		int mujerestrabajcont = 0;
		//int mujeressueldo = 0;
		// ///////////////////////////////////////
		int totalpersonas = 4;
		int paso = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el sexo (1=Hombre 2=Mujer 3=Salir)");
		sexo = teclado.nextInt();

		switch (sexo) {

		case 1:
			// Hombres
			for (int y = 0; y < 4; y++) {
				totalpersonas = mujeres + hombres;
				hombres = totalpersonas - mujeres;
				hombrespor = hombres * 100 / totalpersonas;
				System.out.println("Trabaja (1=Si 2=No)");
				trabaja = teclado.nextInt();
				if (trabaja == 1) {
					hombrestrabajcont = hombrestrabajcont + 1;
					hombrestrabajpor = hombrestrabajcont * 100 / hombres;
				}
			}

			// Mujeres
		case 2:
			for (int m = 0; m < 4; m++) {
				mujeres = totalpersonas - hombres;
				mujerespor = mujeres * 100 / totalpersonas;
				System.out.println("Trabaja (1=Si 2=No)");
				trabaja = teclado.nextInt();
				if (trabaja == 1) {
					mujerestrabajcont = mujerestrabajcont + 1;
					mujerestrabajpor = mujerestrabajcont * 100 / mujeres;
				}
			}
		}
		// salir

		System.out.println("El porcentaje de hombres en la universidad es del "
				+ hombrespor + "%");
		System.out.println("El porcentaje de hombres que trabajan es "
				+ mujerestrabajpor + "%");
		System.out.println("El porcentaje de mujeres en la universidad es del "
				+ mujerespor + "%");
		System.out.println("El porcentaje de mujeres que trabajan es "
				+ mujerestrabajpor + "%");
	}

}

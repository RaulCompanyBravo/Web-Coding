import java.util.*;

public class Ejercicio4_Clase {

	// atributos

	private int x;

	private int y;

	public int x1;

	public int y1;

	// constructor
	public Ejercicio4_Clase(int valorx1, int valory1) {
		x = 0;
		y = 0;
		x1 = valorx1;
		y1 = valory1;
	}

	// metodos

	public int obtenery1() {
		return y1;

	}

	public int obtenerx1() {
		return x1;

	}

	public void printPunto() {
		System.out.print("(" + x1 + "," + y1 + ")");
	}

}

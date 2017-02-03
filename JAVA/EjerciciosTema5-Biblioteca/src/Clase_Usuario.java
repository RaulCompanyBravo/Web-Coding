public class Clase_Usuario {

	private String nombre;
	private String dni;
	private String direccion;
	private int num_prestamos;
	private Clase_Prestamo[] prestamos;

	// CONSTRUCTORES
	Clase_Usuario(String nombre_, String dni_, String direccion_) {
		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;
		num_prestamos = 0;
	}

	Clase_Usuario(String nombre_, String dni_, String direccion_,
			Clase_Prestamo[] prestamos_) {
		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;
		prestamos = prestamos_;

		for (int j = 0; j < prestamos.length; j++) {
			if (prestamos[j] != null) {
				num_prestamos++;
			}
		}

	}

	// METODOS
	String getNombre() {
		return nombre;
	}

	String getDNI() {
		return dni;
	}

	String getDireccion() {
		return direccion;
	}

	//String getNumPrestamos() {
		//return (int)num_prestamos;
	//}

	Clase_Prestamo[] getPrestamosActivos() {
		Clase_Prestamo[] prestamosActivos = new Clase_Prestamo[10];
		int j = 0;
		for (int r = 0; r < prestamos.length; r++) {
			if (prestamos[r] != null
					&& prestamos[r].getEstado().equals("activo")) {
				prestamosActivos[j] = prestamos[r];
				j++;
			}
		}
		return prestamosActivos;

	}

	Clase_Prestamo[] getPrestamosSancionados() {

		Clase_Prestamo[] prestamosSancionados = new Clase_Prestamo[10];
		int n = 0;
		for (int c = 0; c < prestamos.length; c++) {
			if (prestamos[c] != null && prestamos[c].getSancion() == true) {
				prestamosSancionados[n] = prestamos[c];
				n++;
			}
		}
		return prestamosSancionados;
	}

	void addPrestamo(Clase_Prestamo prestamo_) { // Falta algo
		boolean insertado = false;
		for (int k = 0; k < prestamos.length; k++) {
			if (existePrestamo(prestamos[k].getId()) == true){
				if (prestamos[k] == null) {
					prestamos[k] = prestamo_;
					// prestamos[k]=prestamo_;
				}
			}
		}
	}

	boolean existePrestamo(int id_prestamo) {
		boolean existe = false;
		for (int y = 0; y < prestamos.length; y++) {
			if (prestamos[y] != null && prestamos[y].getId() == (id_prestamo)) {
				existe = true;
				return existe;
			}
		}
		return existe;
	}

	void cancelarPrestamo(int id_prestamo) {
		boolean añadido = false;
		for (int i = 0; i < prestamos.length && añadido == false; i++) {
			if (existePrestamo(id_prestamo) == true) {
				prestamos[i] = null;
				añadido = true;
				System.out.println("Prestamo añadido correctamente");
			} else {
				System.out.println("No existe un prestamo con ese id");
			}
		}

	}

	public String toString() {
		String info_usuario = nombre + " " + dni + " " + direccion;
		return info_usuario;
	}

}

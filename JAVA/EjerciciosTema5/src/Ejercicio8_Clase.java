
public class Ejercicio8_Clase {

	 int capacidadMaxima;
	 int cantidadActual;
	 int taza;
	
	
		//CONSTRUCTOR
	public Ejercicio8_Clase(){
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}
	 public Ejercicio8_Clase(int valorac){
		 cantidadActual = capacidadMaxima;
	 }
	 public Ejercicio8_Clase(int valorc1, int valorm1){
		 if (cantidadActual>capacidadMaxima){
			 cantidadActual = capacidadMaxima;
		 }
	 }
	 
	 	//METODOS
	 public void llenarCafetera(){
		 cantidadActual = capacidadMaxima;
	 }
	 public void servirTaza(int taza){
		 cantidadActual = cantidadActual - taza;
	 }
	 public void vaciarCafetera(){
		 cantidadActual= 0;
	 }
	 public void agregarCafe(int cagregar){
		 cantidadActual = cantidadActual + cagregar;
	 }
	
}

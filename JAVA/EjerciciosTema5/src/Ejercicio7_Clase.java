
public class Ejercicio7_Clase {

		//ATRIBUTOS
	
	private long numTarjeta;
	private long DNI;
	private int saldo;
	private int interes;
	
	//CONSTRUCTOR
	public Ejercicio7_Clase(){
		numTarjeta = 54665445;
		DNI = 654456;
		saldo = 5433;
		
		
	}
	//METODOS
	public void ingresar(int valorx){
		saldo=saldo+valorx;
	}
	
	

	
public void retirar(int valorx){
	saldo=saldo-valorx;
	
}

public void mostrarvalores(){
	System.out.println("numero cuenta: "+numTarjeta);
	System.out.println("dni: "+DNI);
	System.out.println("saldo: "+saldo);
}

}
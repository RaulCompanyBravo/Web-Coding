
public class Ejercicio2_Plantilla {
		//ATRIBUTO
	public double radio;
		
		//METODO
	public void asignaRadio(double valor){
		radio = valor;
	}
		
	public double daRadio(){
		return radio;
	}
	
	
	public double longitud(){
		double longitud = 2*3.14*radio;
		return (longitud);
	}
	
	public double area(){
		double area = 3.14*radio*radio;
		return (area);
	}
	
	
	public boolean mayorque(Ejercicio2_Plantilla otrocirculo){
		boolean mayor = false;
		if(this.area() > otrocirculo.area()){
			mayor = true;
		}
		return (mayor);
	}
	
	
	
}

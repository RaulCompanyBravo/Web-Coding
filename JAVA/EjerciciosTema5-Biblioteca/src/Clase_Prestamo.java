import java.util.*;
import java.text.*;
public class Clase_Prestamo {

	private static int num_prestamos;
	private int id;
	private Clase_Libro libro;
	private String fecha_inicio;
	private String fecha_fin;
	private boolean sanction;
	private String estado;
	private String titulo;
	
		//CONSTRUCTOR
	
	Clase_Prestamo(int id_,String titulo_, String fecha_inicio_, String fecha_fin_, String estado_ ){
		id=id_;
		titulo = titulo_;
		fecha_inicio = fecha_inicio_;
		fecha_fin = fecha_fin_;
		estado = estado_;
	}
	
	Clase_Prestamo(Clase_Libro Libro_){///int num_prestamos_,int id_,String libro_, String fecha_inicio_, String fecha_fin_,boolean sanction_, String estado_ ){

		num_prestamos++;
		id = num_prestamos;
		libro = Libro_;
	
			Calendar calendar = new GregorianCalendar();
			Date date_inicio = calendar.getTime();
			//Dar fromato 
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			fecha_inicio = formatoFecha.format(date_inicio);
			
			calendar.add(Calendar.DATE, 30);
			Date date_fin = calendar.getTime();
			//Formateo y convertir date a String
			fecha_fin = formatoFecha.format(date_fin);
			
			sanction = false;
			estado = "activo";
	}
	
		//METODOS
	
	void ampliarPrestamo (int dias) throws ParseException{
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		Date date_fin = formatoFecha.parse(fecha_fin);
		//Incremetar dias
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date_fin);
		calendar.add(Calendar.DATE, dias);
		//pasar de date a string
		date_fin = calendar.getTime();
		fecha_fin = formatoFecha.format(date_fin);
		
		
	}
	
	
	int getId(){
		return id;
	}
	Clase_Libro getLibro(){
		return libro;
	}
	String getFechaInicio(){
		return fecha_inicio;
	}
	String getFechaFin(){
		return fecha_fin;
	}
	boolean getSancion(){
		return sanction;
	}
	String getEstado(){
		return estado;
	}
	public String toString(){
		String info_prestamo = +id+ " "+libro+" "+fecha_inicio+" "+fecha_fin+" "+sanction+" "+estado+ " ";
		return info_prestamo;
		
	}
	
	void setEstado(){
		estado = "cerrado";
	}
	
	
	void setSancion(){
		sanction = true;
	}
	
	
	
	
	
	
	
	
	
}
import java.io.*;
import java.util.*;
public class Ejercicio_GestiónEmpleados_ClaseEmpresa {
	
	private String nombre;
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Ejercicio_GestiónEmpleados_ClaseTrabajador[] trabajadores;
	
	public Ejercicio_GestiónEmpleados_ClaseEmpresa(String vnombre,int vantiguedadEmpresa) {
		nombre = vnombre;
		antiguedadEmpresa = vantiguedadEmpresa; 
		
		try {
			Scanner in = new Scanner (new FileReader("Trabajadores.txt"));
			maxTrabajadores = in.nextInt();
			
			trabajadores = new Ejercicio_GestiónEmpleados_ClaseTrabajador[maxTrabajadores];
			
			int i = 0;
			while(in.hasNext()){
				String nombre = in.next();
				String dni = in.next();
				int antiguedad = in.nextInt();
				int salario = in.nextInt();
				String departamento = in.next();
				
				Ejercicio_GestiónEmpleados_ClaseTrabajador t = new Ejercicio_GestiónEmpleados_ClaseTrabajador(nombre, dni, antiguedad, salario, departamento);  
				trabajadores[i] = t;
				i++;
			}
			numTrabajadores = i;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} 
	
			//METODOS
	public int getNumMáximoTrabajadores(){
		return maxTrabajadores;
	}

	public int getnumTrabajadores(){
		return numTrabajadores;
	}

	public String getNombreEmpresa(){
		return nombre;
	}

	public Boolean existeEmpleado(int numDni){
		String cadenaDni = String.valueOf(numDni);
		boolean encontrado = false;
		//int numerodni = Integer.parseInt(Trabajadores[i].getDNI()); 
		for (int i=0;i<trabajadores.length && encontrado==false;i++){
			if (trabajadores[i]!=null){
				if(trabajadores[i].getDNI().equals(cadenaDni)){
					encontrado = true;
				} 
			}
		}
		return encontrado;
	}

	public void anyadirEmpleado(Ejercicio_GestiónEmpleados_ClaseTrabajador e){
		boolean existe = existeEmpleado(Integer.parseInt((e.getDNI())));
		boolean insertado = false; 
		if (existe == false && numTrabajadores!=maxTrabajadores && insertado == false){
				for (int j=0;j<maxTrabajadores;j++){
					if (trabajadores[j]==null){
						trabajadores[j] = e;
						numTrabajadores++;
						insertado = true;
					}
				}
		}
	}

	public String cancelarEmpleado(int numDni){
		boolean borrado = false;
		String mensaje = " ";
		boolean existe = existeEmpleado(numDni);
		if (existe == true){
			for (int w=0;w<trabajadores.length;w++){
				if(trabajadores[w].getDNI().equals(String.valueOf(numDni))){
					trabajadores[w] = null;
					numTrabajadores--;
					mensaje = "Empleado borrado del sistema";
					borrado = true;
				}
			}
		} else {
			mensaje = "Imposible realizar la cancelación, el DNI numDni no existe"; 
			return (mensaje);
		}
		return (mensaje);
	}

	public int getIdEmpleado(int numDni){
		boolean encontrado = false;
		int posicion = -1;
		String cadenaDni = String.valueOf(numDni);
		for (int h=0;h<trabajadores.length && !encontrado;h++){
			if (cadenaDni.equals(trabajadores[h].getDNI())){
				posicion = h;
				encontrado = true;
			}
			
		}
		return posicion;
	}
	
	public String getInfoEmpleado(int numDni){
		int posicion = getIdEmpleado(numDni); 
		return trabajadores[posicion].toString();
		
		//String cadenaInfo = trabajadores[posicion].toString();
		//return cadenaInfo;
		
		//return trabajadores[getIdEmpleado(numDni)].toString();
		
	}
	
	public String listarEmpleados(){
		//String cadenaDni = String.valueOf(numDni); -- Ayuda, solo para verlo
		String lista = " ";
			for (int p=0;p<trabajadores.length;p++){
				if(trabajadores[p]!=null){
					lista = lista + trabajadores[p].toString()+"\n";
			}
		}
		return lista;
	}
	public void guardar(PrintWriter fich){
		try {
			fich = new PrintWriter("TrabajadoresEmpresa");
			fich.print(listarEmpleados());
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			fich.close();
		}
	}
	public String toHistograma(){
		String cadenaHistograma = " ";
		int [] histograma = new int [antiguedadEmpresa+1];
		for(int i=0;i<trabajadores.length;i++){
			 histograma[trabajadores[i].getAntiguedad()]++;
		}
		for(int i=0;i<trabajadores.length;i++){
			cadenaHistograma = cadenaHistograma+i+"anyos: ";
			for (int j=0;j<histograma[i];j++){
			cadenaHistograma = cadenaHistograma+" *"; 
			}
			cadenaHistograma = cadenaHistograma+"\n";
		}
		return cadenaHistograma;
	}
	
}

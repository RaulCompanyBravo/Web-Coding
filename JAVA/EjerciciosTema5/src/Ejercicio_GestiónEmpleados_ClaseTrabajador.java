
public class Ejercicio_GestiónEmpleados_ClaseTrabajador { //
	private String Nombre;
	private String DNI;
	private int Antiguedad;
	private int Salario;
	private String Departamento;	
	
		//CONSTRUCTOR

	public Ejercicio_GestiónEmpleados_ClaseTrabajador(String vNombre, String vDNI, int vAntiguedad, int vSalario, String vDepartamento){
		vNombre = Nombre;
		vDNI = DNI;
		vAntiguedad = Antiguedad;
		vSalario = Salario;
		vDepartamento = Departamento;
	}

	//METODOS
	public String getNombre(){
		return Nombre;
	}
	public String getDNI(){
		return DNI;
	}
	public int getAntiguedad(){
		return Antiguedad;
	}
	public int getSalario(){
		return Salario;
	}
	public String getDepartamento(){
		return Departamento;
	}
	public String toString(){
		String dTrabajador = Nombre+" "+DNI+" "+Antiguedad +" "+Salario+" "+Departamento;
		return dTrabajador;
		
	}
	
}

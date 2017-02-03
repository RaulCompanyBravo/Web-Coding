import java.util.*;


public class Ejercicio_GestiónEmpleados_ClaseGestor {

	public static int menu(Scanner tec){
		System.out.println("*****MENU PRINCIPAL********");
		System.out.println("1 - Numero de trabajadores");
		System.out.println("2 - Buscar datos de un empleado");
		System.out.println("3 - Añadir un trabajador");
		System.out.println("4 - Borrar un trabajador");
		System.out.println("5 - Listar trabajadores");
		System.out.println("6 - Histograma");
		System.out.println("0 - Terminar");
		System.out.println("*******************************");
		System.out.println("Elige una opcion");
		int opcion = tec.nextInt();
		return opcion; 
	}
	public static void main(String[] args){
		Ejercicio_GestiónEmpleados_ClaseEmpresa e1 = new Ejercicio_GestiónEmpleados_ClaseEmpresa("Empresa1", 5);
		Scanner teclado = new Scanner(System.in);
		int opcionUsuario= menu(teclado);
	do{
		switch (opcionUsuario){
		case 1:
			System.out.println("1 - Numero de trabajadores");
			System.out.println("Numero de trabajadores: "+e1.getnumTrabajadores());
			
		case 2:
			System.out.println("2 - Buscar datos de un empleado");
			 System.out.printf("Introduce el DNI del trabajador");
			 int dni = teclado.nextInt();
				//String cadenaDni = String.valueOf(dni);
				 if(e1.existeEmpleado(dni)){
					 
					 System.out.println("El empleado SI existe");
				 }else{
					 System.out.println("El empleado NO existe");
				 }
				 
		case 3:
			System.out.println("3 - Añadir un trabajador");
			System.out.printf("Añade el DNI del trabajador a añadir: ");
			String e = teclado.next();
			int dniayadir = teclado.nextInt();
			//e1.anyadirEmpleado(dniayadir);

		case 4:
			System.out.println("4 - Borrar un trabajador");
			System.out.printf("Añade el DNI del trabajador a eliminar: ");
			int eliminarEmpleado = teclado.nextInt();
			//if(e1.cancelarEmpleado(eliminarEmpleado)){
				
			//}
			
			
			
			
			
			
		case 5:
			System.out.println("5 - Listar trabajadores");
			System.out.println(e1.listarEmpleados());
			
		case 6:
			System.out.println("6 - Histograma");
			System.out.println(e1.toHistograma());
			
			 
			 
		}
		
		
		
		
	}while (opcionUsuario!=0);
	
	}
	
}

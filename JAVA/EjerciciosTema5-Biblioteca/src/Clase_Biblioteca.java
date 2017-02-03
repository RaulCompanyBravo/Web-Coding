import java.io.*;
import java.util.*;


public class Clase_Biblioteca {

	private Clase_Usuario[] usuarios;
	private Clase_Libro[] libros;
	
	
		//CONSTRUCTOR
	
	Clase_Biblioteca(){
		try {
			Scanner in = new Scanner (new FileReader("infoBiblioteca.txt"));
			
				//1 parte --> cantidad usuarios y libros
						in.nextLine();
						in.next();
				int max_libros = in.nextInt();
						in.next();
				int max_usuarios = in.nextInt();
				usuarios = new Clase_Usuario[max_usuarios];
				libros = new Clase_Libro[max_libros];
						in.nextLine();
						in.nextLine();
			
				//2 parte --> libros
						
			in.useDelimiter(";");	
			int i = 0;
				String titulo = in.next();
				while(titulo.contains("Prestamo")==false){
				String autor = in.next();
				int anyo = in.nextInt();
				String editorial = in.next();
				String isbn = in.next();
				
			Clase_Libro libro = new Clase_Libro (titulo, autor, anyo, editorial,isbn);		
				libros[i] = libro;
					i++;	
				}
				in.nextLine();
				in.nextLine();
				
				//3 parte --> prestamos
			int o = 0;
			while (in.next()==null){
				String nombre = in.next();
				String dni = in.next();
				String direccion = in.next();
				int cant_prestamos = in.nextInt();
				in.nextLine();
					for (int t=0;t<cant_prestamos;t++){
						int id = in.nextInt();
						String nombre_libro = in.next();
						String fecha_inicio = in.next();
						String fecha_fin = in.next();
						in.next();
						String estado = in.next();
						in.nextLine();
						Clase_Prestamo prestamos = new Clase_Prestamo(id,nombre_libro,fecha_inicio,fecha_fin, estado);
						o++;
					
					
					}
			}	
							
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//METODOS
	
	void altaUsuario(Clase_Usuario usuario_){
		
		
		
	}
	void bajaUsuario(int dni_){
		
		
		
	}
	void altaLibro(Clase_Libro libro_){
		
		
		
	}
	void getNumPrestamosActivos(){
		
		
		
	}
	void getNumPrestamosSanciones(){
		
		
		
	}
	String histograma(){
		
		
	}
	
	
	
	
	
	
	
	
}

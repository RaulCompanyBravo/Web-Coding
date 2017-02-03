
public class Clase_Libro {
	
	private String titulo;
	private String autor;
	private int anyo;
	private String editorial;
	private String isbn;
	
		//CONSTRUCTORES
	
Clase_Libro(String visbn){
	isbn = visbn;
}
	
Clase_Libro(String titulo_, String autor_, int anyo_, String editorial_, String isbn_){		
	titulo = titulo_;
	autor = autor_;
	anyo = anyo_;
	editorial = editorial_;
	isbn = isbn_;
}

	//METODOS




String getTitulo(){	
	return titulo;
}

void setTitulo(String titulo){
	
}


String getAutor(){
	return autor;
}

void setAutor(String autor){
	
}

int getAnyo(){
	return anyo;
}

void setAnyo(int anyo){
	 
}

String getEditorial(){
	return editorial;
}

void getEditorial(String editorial_){
	
}

String getIsbn(){
	return isbn;
}

String toString(){
	
}

	
	
	
	
	
	
	
	
	
	
	
}

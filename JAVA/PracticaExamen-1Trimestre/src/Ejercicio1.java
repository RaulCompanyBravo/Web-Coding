import java.util.*;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		int grupo = 0;
		int alumnos = 0;
		int asistencias = 0;
		float media = 0;
		int sumaasistencias = 0;
		int min = 100;
		float mediagrupo = 100;
		float mediagrupoomin = 0;
		float numgrupomedia  = 0;
		int asismingrupo = 0;
		float mediagrupomindef = 0;
		//int practicas[][] = new int [grupo][alumnos];
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int h=1;h<4;h++){
			
			System.out.println("------------------------------------");
			System.out.println("Grupo: " +h);
			System.out.println("Introduce el número de matriculados:");
			alumnos = teclado.nextInt();
			asismingrupo = 0;
			asistencias = 0;
			min = 100;
			mediagrupo = 100;
			sumaasistencias = 0;
				for(int k=1;k<16;k++){
					System.out.println("Introduce el numero de asistencias a la sesion " +k);
					asistencias = teclado.nextInt();
					
					if (asistencias == 0){
						min = 0;
					}
					
					if (asistencias < min) {
						min = asistencias;
						asismingrupo = k;
					}
					
					
					sumaasistencias = sumaasistencias + asistencias;
					if (k==10 && asistencias<alumnos/10){
						System.out.println("El grupo a sido desestimano por falta de asistencias suficientes");
						break;
					} 
					if (k==15){
						media = sumaasistencias/15;
						System.out.println("La media es: " +media);
						System.out.println("La sesión con menos asistencia es la " +asismingrupo   +" con " +min +" alumnos");
						
							if (mediagrupo == 0){
								mediagrupo = media;
							}
						
							
							if (mediagrupo <mediagrupoomin){
								mediagrupoomin = mediagrupomindef;
								numgrupomedia = h;
							}
						
						}
						continue;
					}
				}
			
			
		System.out.println("La mejor media es: "+mediagrupomindef +" del grupo " +numgrupomedia);
			
			
		}
		
		
	}



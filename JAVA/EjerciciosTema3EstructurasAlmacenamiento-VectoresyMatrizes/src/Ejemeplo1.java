import java.util.*;

public class Ejemeplo1 {

	public static void main(String[] args) {

		int salas = 5;
		int ordenadores = 20;
		int reservas[][] = new int[salas][ordenadores];
		int opcion;
		int numsala;
		int numordenador;
		int numreservas = 0;
		
		Scanner teclado = new Scanner(System.in);

		//Inicializar matriz de reservas
		for (int i=0;i<salas;i++){ //Recorrido de salas												
			for (int j=0;j<ordenadores;j++){ //Recorrido de ordenadores
				reservas[i][j] = 0;
			}
		}
		
	do{
		System.out.println("Elige una opción");
		System.out.println("-------------------------------------------");
		System.out.println("1: Asignar turno");
		System.out.println("2: Cancelar turno");
		System.out.println("3: Cantidad de turnos asignados");
		System.out.println("4: Salir");
		System.out.println("-------------------------------------------");
		System.out.println("Ingresa una opcion:");
		opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Asignar o cancelar turno");
			System.out.println("------------------------");
			
			System.out.println("Introduzca la sala");
			numsala = teclado.nextInt();
			System.out.println("Introduzca el ordenador");
			numordenador = teclado.nextInt();
			if (reservas[numsala][numordenador] == 0){
				reservas[numsala][numordenador] = 1;
				System.out.println("Reserva completada");
			} else {
				for (int i=0;i<salas;i++){ //Recorrido de salas		
					System.out.println("Sala: " +i);
					for (int j=0;j<ordenadores;j++){ //Recorrido de ordenadores
						if(reservas[i][j] == 0);
						System.out.println("El odenador " +j +" está libre");
						
					}
				}
			}
			
			break;
		case 2:
			System.out.println("Cancelar turno");
			System.out.println("----------------------------------------");
			
			System.out.println("Introduzca la sala");
			numsala = teclado.nextInt();
			System.out.println("Introduzca el ordenador");
			numordenador = teclado.nextInt();
			if (reservas[numsala][numordenador]==1){
				reservas[numsala][numordenador] = 0;
				System.out.println("Reserva eliminada");
			} else {
				System.out.println("No hay ninguna reserva en la sala " +numsala +" del ordenador " +numordenador);
			}
			
			
			break;
		case 3:
			System.out.println("Cantidad de turnos asignados");
			System.out.println("----------------------------");
			for (int i=0;i<salas;i++){ //Recorrido de salas												
				for (int j=0;j<ordenadores;j++){ //Recorrido de ordenadores
					if (reservas[i][j]==1){
						numreservas = numreservas +1;
					}
				}
			}
			System.out.println("El número de reservas es " +numreservas);
			break;
		case 4:
			//System.out.println("Salir");
			break;
		}
	}while(opcion!=4);

	}

}

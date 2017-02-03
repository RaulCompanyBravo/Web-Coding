
public class Ejercicio1_Plantilla {
	
			//ATRIBUTOS
		double pReal;
		double pImag;
		 
			//METODOS
		public void asignar(double r, double i){
			pReal = r;
			pImag = i;
		}
		
		public void sumar(Ejercicio1_Plantilla n){
			pReal = pReal + n.pReal;
			pImag = pImag + n.pImag;
		}
		
		public void sumar2(double r, double i){
			pReal = pReal + r;
			pImag = pImag + i;	
		}
		
		public Ejercicio1_Plantilla sumar3(double r, double i){
			Ejercicio1_Plantilla n = new Ejercicio1_Plantilla();
			n.pReal = pReal + r;
			n.pImag = pImag + i;
			return n;
		}
		
		public void imprimir(){
			System.out.println("pRela: " +pReal);
			System.out.println("pImag:  "+pImag);
		}
			

	}



//Empate 1p y 1p, gana 1p y pierde 0p
	function Equipo(nombre){ //Contructor equipo
		this.nombre = nombre;
		this.puntos = 0;

		this.mostrarNombre=function(){return this.nombre}
		this.mostrarPuntos=function(){return this.puntos}

		this.setPuntos=function(v){this.puntos = this.puntos + v}
	}
		//Generar equipos y pedirlos

var patron=RegExp("^[A-Z]{3}[0-9]{4}$") //Expression regular que comprueba que tenga el formato "BAR2015"


	var e1=prompt("Intorduce el equipo")
	var e2=prompt("Intorduce el equipo")
	var e3=prompt("Intorduce el equipo")
	var e4=prompt("Intorduce el equipo")
	var equipo1=new Equipo(e1); 
	var equipo2=new Equipo(e2); 
	var equipo3=new Equipo(e3); 
	var equipo4=new Equipo(e4); 

	var equipos =new Array(4); //Crear array para guardar los equipos
	function agregarEquipos(){
		equipos=[equipo1,equipo2,equipo3,equipo4]
	}

	agregarEquipos(); //Agregar los equipos al array
	
	
	function Emparejamientos(local,visitante,g_local,g_visitante){ //Constructor que piede y almacena los resultados de los partidos, con tres if para comprabar si pierden, ganan o empatan
		this.local = local;
		this.visitante = visitante;
		this.g_local = g_local;
		this.g_visitante = g_visitante;

		if(g_local>g_visitante){
			for(var x=0;x<equipos.length;x++){
				if(equipos[x].mostrarNombre()==local){equipos[x].setPuntos(g_local)}
			}
			console.log(equipos[1].mostrarPuntos())
		} else if (g_local<g_visitante){
			for(var x=0;x<equipos.length;x++){
				if(equipos[x].mostrarNombre()==visitante){equipos[x].setPuntos(g_visitante)}
			}	
		console.log(equipos[1].mostrarPuntos())
		} else if (g_local==g_visitante){
			for(var x=0;x<equipos.length;x++){
				if(equipos[x].mostrarNombre()==visitante){equipos[x].setPuntos(1)}
				if(equipos[x].mostrarNombre()==local){equipos[x].setPuntos(1)}
		}
		console.log(equipos[1].mostrarPuntos())
		}
		this.mostrarEmparejamiento=function(){ //Muestra los emparejamientos
			var emparejamiento = "" +this.local +" " +this.g_local +" - " +this.visitante +" " +this.g_visitante;
			return emparejamiento;
		}

	}

	function golesAleatorios(){ //Genera los goles de los partidos de forma aleatoria
			num_gol = Math.floor((Math.random() * 5))
			return num_gol
	}
	var emparejamientos=new Array(12) //Array para guardar todos los emparejamientos
	function generarJornadas(){ //Funcion para egnerar los emparejamientos
		for(var o=0;o<emparejamientos.length;o++){
			eq1 = Math.floor((Math.random() * 4))
			eq2 = Math.floor((Math.random() * 4))
			
			while(eq1==eq2){eq2 = Math.floor((Math.random() * 4))}
			emparejamientos[o]=new Emparejamientos(equipos[eq1].mostrarNombre(),equipos[eq2].mostrarNombre(),golesAleatorios(),golesAleatorios())

		}



	}
		//console.log(equipos);
		generarJornadas(); //Generar jornadas
			for(var u=0;u<emparejamientos.length;u++){ //Mostrar las jornadas y sus partidos, cada jornada son 2 partidos
				if(u==0 | u==2 | u==4 | u==6 | u==8 | u==10){document.write("<h2>Jornada " +u +"</h2>")}

					document.write(emparejamientos[u].mostrarEmparejamiento() +"<br>")
			}
			var pu = 0;
			function ganador(){ //No funciona
				for(var u=0;u<equipos.length;u++){
					if(parseInt(equipos[u].mostrarPuntos())>pu){p=equipos[u].mostrarPuntos()}
				}
			alert(pu)
			}








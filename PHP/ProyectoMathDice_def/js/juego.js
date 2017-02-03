/*
function showUser(str) {
  if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  } else { // code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.open("GET","/home/ubuntu/workspace/ProyectoMathDiceBBDDs.Organizado.AJAX/dbAJAX.php?q="+str,true);
  xmlhttp.send();
}
*/
var valorDados = new Array();
  var op;
  var res;
  var valorDadoOP;
   /* var d1 = document.getElementById("1").name moverDados
    var d2 = document.getElementById("2").name
    var d3 = document.getElementById("3").name
    var d4 = document.getElementById("4").name
    var d5 = document.getElementById("5").name */
function vDados(v){
  var vdado12 = document.getElementById("12").name;
  valorDadoOP = 0;
  switch (v) {
    case 1:
       //valorDados[1] = document.getElementById("1").name
       valorDadoOP = document.getElementById("1").name
       //document.getElementById("probaNum").innerHTML += valorDados[1];
       console.log(valorDados)
       document.getElementById("1").src='./img/Dado6/' +valorDadoOP +'_1.png';
       document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/Dado6/' +valorDadoOP  +'.png" height="200" width="200"/></div>' ;
       document.getElementById("1").removeAttribute("onclick");
       break;
    case 2:
       //valorDados[2] = document.getElementById("2").name
       valorDadoOP = document.getElementById("2").name
       //document.getElementById("probaNum").innerHTML += valorDados[2];
       console.log(valorDados) 
         document.getElementById("2").src='./img/Dado6/' +valorDadoOP +'_1.png';
       document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/Dado6/' +valorDadoOP  +'.png" height="200" width="200"/></div>' ;
       document.getElementById("2").removeAttribute("onclick");
       break;
    case 3:
       //valorDados[3] = document.getElementById("3").name
       valorDadoOP = document.getElementById("3").name
       //document.getElementById("probaNum").innerHTML += valorDados[3];
       console.log(valorDados) 
        document.getElementById("3").src='./img/Dado6/' +valorDadoOP +'_1.png';
       document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/Dado6/' +valorDadoOP  +'.png" height="200" width="200"/></div>';
       document.getElementById("3").removeAttribute("onclick");
       break;
    case 4:
       //valorDados[4] = document.getElementById("4").name
       valorDadoOP = document.getElementById("4").name
        document.getElementById("4").src='./img/Dado6/' +valorDadoOP +'_1.png';
       //document.getElementById("probaNum").innerHTML += valorDados[4];
       document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/Dado6/' +valorDadoOP  +'.png" height="200" width="200"/></div>';
       console.log(valorDados)
       document.getElementById("4").removeAttribute("onclick");
       break;
    case 5:
       //valorDados[5] = document.getElementById("5").name
       valorDadoOP = document.getElementById("5").name
      // document.getElementById("probaNum").innerHTML += valorDados[5];
       document.getElementById("5").src='./img/Dado6/' +valorDadoOP +'_1.png';
       document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/Dado6/' +valorDadoOP  +'.png" height="200" width="200"/></div>';
       console.log(valorDados)
       document.getElementById("5").removeAttribute("onclick");
       break;
    case 8:
        //document.getElementById("probaNum").innerHTML += "-";
        document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/res.png" height="200" width="200"/></div>';
        break;
    case 9:
        //document.getElementById("probaNum").innerHTML += "+";
        document.getElementById("moverDados").innerHTML += '<div class="col-md-1"><img src="./img/sum.png" height="200" width="200"/></div>';

        break;
      
  }
  
    console.log("Resultado antes" +res)
  //Sumar 9 Retar 8
  if(op==9){res=parseInt(res) + parseInt(valorDadoOP)} else if(op==8){res=res-valorDadoOP}
  if(v==8 || v==9){op=v} else if(res==null){res=valorDadoOP}
    console.log("Resultado despues" +res)
    console.log(vdado12)

  var mostarRes;
    console.log("Reultado" +res)
    console.log("Dadode12" +vdado12)
    var puntos
    //parseInt(puntos)+0;
    console.log("Tipo campo puntos" +typeof(puntos))
  if(res==vdado12){
    console.log("cuadra")
    puntos=true;
    console.log("Puntos -->"+puntos)
    document.getElementById("opcionDeReultado").innerHTML = '<div class="modal-body" style="background-color:green;text-align:center;"><H2>Correcto!</H2><h4></h4><img src="./img/like-icon.png"></img><br /><br /><button class="btn btn-lg btn-info" onclick="javascript:history.go(0)">Otra vez?<span class="glyphicon glyphicon-refresh"></span></button></div>'
    
    
   
   var conexion=new XMLHttpRequest; //Instanciamos XMLHttpRequest
        conexion.onreadystatechange=function(){ //Manejador de eventos para gestionar cambios
        if(this.readyState==4 && this.status=="200"){console.log(this.responseText)}};
        var n = document.getElementById("usern").getAttribute("name"); 
        console.log(n)
        //console.log(n);
        conexion.open("GET","./lib/dbAJAX.php?q="+n)
        conexion.send();
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //showUser("true");
  } else if (res!=vdado12){
    //showUser("false");
    console.log("no cuadra")
    console.log("Puntos -->"+puntos)
    document.getElementById("opcionDeReultado").innerHTML = '<div class="modal-body" style="background-color:red;text-align:center;"><H2>Incorrecto!</H2><h4></h4><img src="./img/dislike-icon.png"></img><br /><br /><button class="btn btn-lg btn-info" onclick="javascript:history.go(0)">Reintentar <span class="glyphicon glyphicon-refresh"></span></button></div>'
  }
  /*
  valorDados[2] = document.getElementById("2").name
  document.getElementById("probaNum").innerHTML = valorDados[2];
   console.log(valorDados) 
*/
}

$(document).ready(function(){
        $('#b12').click(function(){

                document.history.go(0);
        
        });

    });
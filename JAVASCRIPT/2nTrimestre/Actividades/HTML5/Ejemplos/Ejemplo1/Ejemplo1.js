/* Opcion 1
function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}
*/

/* Opcion 2

*/
var origen, destino;

function iniciar(){
	origen=document.getElementById("imagen");
	destino=document.getElementById("cajaSoltar");

	origen.addEventListener("dragstart",arrastrado);

	origen.addEventListener("dragenter",function(e){
		e.preventDefault();
	});

	destino.addEventListener("dragover",function(e){
		e.preventDefault();
	});

	destino.addEventListener("drop",soltar);
}

function arrastrado(e){
	var imagen="<img src='"+ origen.getAttribute("src") + "' width='200'>'";
	e.dataTransfer.setData('imagen',imagen);

}

function soltar(e){
	e.preventDefault();
	destino.innerHTML=e.dataTransfer.getData("imagen");

}

addEventListener("load",iniciar);















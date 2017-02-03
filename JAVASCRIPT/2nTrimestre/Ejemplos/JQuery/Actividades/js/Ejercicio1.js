$(document).ready(function(){
	$(".pregunta").click(function() {
		$(this).next("div").slideToggle(400);  // abrir respuesta
	});
	$('#colorinput').on('change', function() {
 	   $('body').css('background-color', $(this).val()); // cambiar fondo
	});
});
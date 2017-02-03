$(document).ready(function(){
    $("#boton").click(function(){
        if( $("#nombre").val() == ""){
            $("#infouser").html("No has puesto nada").css("color","red");
        }
    });
    
	var valorDefecto=$("#nombre").val();
	$("#nombre").focus(function(){
		if($("#nombre").val() == valorDefecto){
			$("#nombre").val("");
		}
	});
	
	$("#unidad").focus(function(){
	    var v=$("#unidad")*12;
	    $("#res").html(v);
	})
	
	
})

/*
$("#.checkbox:checked")



*/
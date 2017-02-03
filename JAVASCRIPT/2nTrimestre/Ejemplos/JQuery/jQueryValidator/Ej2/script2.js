$(document).ready(function(){
    $("#txt").focus(function(){
        $("#azul1").html("Hola focus").css("background-color","blue")
        $("#txt").blur(function(){$("#azul1").html("Adios focus").css("background-color","red");
    });
    
    })
    $("#lista").click(function(){
        $("#pos").html($("#lista option:selected").text())
    })
    
    $("#amarillo").focus(function(){
        $("#color").html("Cambiar color a amarillo").css("background-color","yellow")    
    })
    $("#rojo").focus(function(){
        $("#color").html("Cambiar color a rojo").css("background-color","red")    
    })
    $("#verde").focus(function(){
        $("#color").html("Cambiar color a verde").css("background-color","green")    
    })
    
    $("#boton").focus(function(){
        $("#color").html("Cambiar color a rojo").css("background-color","red")
        $("#rojo").attr('checked', true)
        $("#boton").blur(function(){$("#rojo").attr('checked',false)})
    })
    
});
<?php
  $menu=array( //Array en el que esta el menu a mostrar
    "titulo"=>array(
      "es"=>"Math Dice",
      "en"=>"Math Dice"
    ),
    "portada"=>array(
      "es"=>"Inicio",
      "en"=>"Home"
    ),
    "perfil"=>array(
      "es"=>"Perfil",
      "en"=>"Profile"
    ),
   "instrucciones"=>array(
     "es"=>"Intrucciones",
     "en"=>"Instructions"
    ),
     "tiposdeJuego"=>array(
     "es"=>"Tipo juego",
     "en"=>"Game choice",
       "submenu"=>array(
            "tipo1"=>array(
              "es"=>"Junior",
              "en"=>"Junior"       
           ),
           "tipo2"=>array(
              "es"=>"Junior+",
              "en"=>"Junior+"
            )
       )
    )
  );
  	$tit = $menu["titulo"][$idioma]; //Almacena el titulo del menu
  	$ins = $menu["instrucciones"][$idioma]; //Alamcena las instrucciones del menu
	$por =$menu["portada"][$idioma]; //Almacena la portada del menu
	$tip = $menu["tiposdeJuego"][$idioma]; //Almacena el tipo de juego del menu
  	$per = $menu["perfil"][$idioma]; //Almacena el tipo de juego del menu
  
  
?>
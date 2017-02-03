<html>
  <?php
  $idioma="en"; //Variable que indica el inidoma en el que se motrara la pagina
 
  $menu=array( //Array en el que esta el menu a mostrar
    "titulo"=>array(
      "es"=>"Math Dice",
      "en"=>"Math Duce"
    ),
    "portada"=>array(
      "es"=>"Inicio",
      "en"=>"Home"
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
              "es"=>"Juego tradicional",
              "en"=>"Traditional game"       
           ),
           "tipo2"=>array(
              "es"=>"Juego modificado",
              "en"=>"Game modified"
            ),
            "tipo3"=>array(
              "es"=>"Juego niños",
              "en"=>"Kid game"
          )
       )
    )
  )
?>


<?php

		$tit = $menu["titulo"][$idioma]; //Almacena el titulo del menu
		$ins = $menu["instrucciones"][$idioma]; //Alamcena las instrucciones del menu
		$por =$menu["portada"][$idioma]; //Almacena la portada del menu
		$tip = $menu["tiposdeJuego"][$idioma]; //Almacena el tipo de juego del menu
	
?>

<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><?php echo $tit ?></a> <!-- Muestra el titulo del juego-->
    </div>
    <div>
      <ul class="nav navbar-nav">
        <li class="active"><a href="#"><?php echo $por ?></a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><?php echo $tip ?><span class="caret"></span></a> <!-- Muetra el tipo de juego -->
          <ul class="dropdown-menu">
            <?php 
              
            ?>
            <?php
            for($o = 1;$o < (count($menu["tiposdeJuego"]["submenu"]) +1);$o++){ //Muestra el submenu de lo modos de juego
            
            echo '<li><a href="#">' . $menu["tiposdeJuego"]["submenu"]["tipo$o"][$idioma] . '</a></li>'; //Muestra los diferentes tipos del juego
            }
              ?>
          </ul>
        </li>
        <li><a href="#"><?php echo $ins ?></a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>
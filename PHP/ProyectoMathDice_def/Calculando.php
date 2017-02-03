<?php 

include('funciones.php');
include('./BBDD.php');
include('./lib/auth.php');
session_start();
$db1 = new db("localhost","usuarios","raulcompanybravo",'');
$_SESSION['db'] = $db1;



if(isset($_GET['nombre2'])){echo "Cambio Nombre";$_GET['nombre']=$_GET['nombre2'];$db1->modificarDatos($_GET['nombre'],$_SESSION['jugador']->getNombre());}
if(isset($_GET['edad2'])){echo "Cambio edad";$_GET['edad']=$_GET['edad2'];$db1->modificarDatosEdad($_GET['edad'],$_GET['nombre']);}
echo '<div id="usern" name="'.$_GET['nombre'].'" style="display: none;"></div>';
$test = $db1->getDatos($_GET['nombre'])[1];
echo $test;
$datos_Jugador = new Jugador($db1->getDatos($_GET['nombre'])[1],$db1->getDatos($_GET['nombre'])[3],$_GET['idioma'],$_GET['modo'],$db1->getDatos($_GET['nombre'])[5]);

//echo $datos_Jugador->getNombre();
$_SESSION['jugador'] = $datos_Jugador;

?>
<html>
  <link rel="stylesheet" type="text/css" href="./css/junior.css">
<?php $idioma = $datos_Jugador->getIdioma(); ?>
<?php include('./lib/menu.php') ?>
<head>
  <?php headBS(); $puntos;?>
</head>
<body>
  <script type="text/javascript" src="./js/juego.js"></script>
   

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
            for($o = 1;$o < (count($menu["tiposdeJuego"]["submenu"]) +1);$o++){ //Muestra el submenu de lo modos de juego
            echo '<li ><a href="#" onclick="abrirLink('.$o.')">' . $menu["tiposdeJuego"]["submenu"]["tipo$o"][$idioma] . '</a></li>'; //Muestra los diferentes tipos del juego
              //onclick="parent.location='index.jsp#home'">home</a>
            }
              ?>
          </ul>
        </li>
        <li><a href="#"><?php echo $ins ?></a></li>
        <li><a href="cambiarDatos.php"><?php echo $per ?></a></li>
      </ul>
    </div>
  </div>
</nav>



<?php lanzarDados(); ?>
<br />
<div class="row" id="moverDados">
  <div class="col-md-1"></div>
</div>
<div class="row">
  <div class="col-md-1"></div><div class="col-md-1"></div><div class="col-md-1"></div><div class="col-md-1"></div><div class="col-md-1"></div>
  
  <div class="col-md-1">
    <br />
  </div>
</div>
<?php //mostrar_db2(); ?>
</body>
</html>

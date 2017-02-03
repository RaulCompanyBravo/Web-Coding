<?php

function headBS(){
  $mostarHEAD = <<<EOF
  
<title>Bootstrap Case</title>
          <meta charset="utf-8">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

          
EOF;
echo $mostarHEAD;
}
?>
<?php
/*
function datosUsuario($nom,$edad){
    class Usuario{
    public $nombre ="nombre";
    public $edad=99;
    public $puntos=1;
    
    public function getNombre(){return $this->nombre;}
    public function getEdad(){return $this->edad;}
    public function getPuntos(){return $this->puntos;}

    public function setNombre($v){$this->nombre=$v;}
    public function setEdad($v){$this->edad=$v;}
    public function setPuntos($v){$this->puntos=$v;}
    }
}
*/
class Jugador{ 
   	var $nombre; 
   	var $edad;
   	var $idioma;
   	var $modo;
   	var $puntos;
   	function __construct($nombre,$edad,$idioma,$modo,$puntos){ 
      	$this->nombre=$nombre;
      	$this->edad=$edad;
      	$this->idioma=$idioma;
      	$this->modo=$modo; 
      	$this->puntos=$puntos; 
   	} 

   	function getNombre(){return $this->nombre;}
	  function getEdad(){return $this->edad;}
   	function getIdioma(){return $this->idioma;}
   	function getModo(){return $this->modo;}
   	function getPuntos(){return $this->puntos;}

   	function setNombre($v){$this->nombre = $v;}
   	function setEdad($v){$this->edad = $v;} 
   	function setIdioma($v){$this->idioma = $v;} 
   	function setModo($v){$this->modo = $v;} 
   	function setPuntos($v){$this->puntos = $v;} 

}

  /*
 $user =new Usuario();
 $user->setNombre("Raul");
 $user->setEdad(19);
 echo $user->getNombre();
 echo $user->getEdad();
  */
?>
<?php
function formulario($v){
if($v==1){
print('

<form class="form-horizontal" method="get">
    <!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios"></label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="radios-0">
      <input type="radio" name="radios" id="radios-0" value="sum" checked="checked">
      Suma
    </label> 
    <label class="radio-inline" for="radios-1">
      <input type="radio" name="radios" id="radios-1" value="res">
      Resta
    </label> 
  </div>
</div>
    
</form>

');
} else {
print('

<form class="form-horizontal" method="get">
    <!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios"></label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="radios-0">
      <input type="radio" name="radios" id="radios-0" value="sum" checked="checked">
      Suma
    </label> 
    <label class="radio-inline" for="radios-1">
      <input type="radio" name="radios" id="radios-1" value="res">
      Resta
    </label> 
    <br />
    <label class="radio-inline" for="radios-2">
      <input type="radio" name="radios" id="radios-2" value="mul">
      Multiplicación
    </label> 
    <label class="radio-inline" for="radios-3">
      <input type="radio" name="radios" id="radios-3" value="div">
      División
    </label>
  </div>
</div>
    
</form>

');
}
}
?>
<?php
/*
<html>
    <head>
        
    </head>
    <style type="text/css">
    input{border-radius:10px 10px 10px 10px;}
    div{
      border-radius: 28px 28px 28px 28px;
      -moz-border-radius: 28px 28px 28px 28px;
      -webkit-border-radius: 28px 28px 28px 28px;
      border: 4px solid #000000;
      background-color: reds;
      width:200px;
      height:200px;
    }
    
    </style>

<body>
  <div>
    <center>

  <!--<input type="text" name="valor1" style="width: 13px;" maxlength="1" placeholder="1"/> 
  <input type="text" name="valor2" size="2" maxlength="1" placeholder="2"/>
  <input type="text" name="valor3" size="2" maxlength="1" placeholder="3"/>
  <input type="text" name="valor4" size="2" maxlength="1" placeholder="4"/>
  <input type="text" name="valor5" size="2" maxlength="1" placeholder="5"/>
  <input type="submit" value="Submit"/><input type="reset" value="Submit"/>-->
$op;
if($_GET['op']=="es"){
  $op="es";
} elseif($_GET['op']=="en") {
  $op="en";
}*/
//echo $_GET['op'];
//echo $op;
?>
<?php
/*
function formulario($v){
if($v==1){
print('

<form class="form"> <p></p>
  <input type="text" name="valor1"/><p>
  <input type="text" name="valor2"/><p> 
  <input type="radio" name="op" value="sum"/>
  <input type="radio" name="op" value ="res"/>
  <input type="submit" name="enviar"/>
</form>

');
} else {
print('

<form class="form"> <p></p>
  <input type="text" name="valor1"/><p>
  <input type="text" name="valor2"/><p>
  <input type="radio" name="op" value="sum"/>
  <input type="radio" name="op" value ="res"/>
  <input type="radio" name="op" value="mul"/>
  <input type="radio" name="op" value ="div"/>
  <input type="submit" name="enviar"/>
</form>

');
}
}
*/?>
<?php
/*
<html>
    <head>
        
    </head>
    <style type="text/css">
    input{border-radius:10px 10px 10px 10px;}
    div{
      border-radius: 28px 28px 28px 28px;
      -moz-border-radius: 28px 28px 28px 28px;
      -webkit-border-radius: 28px 28px 28px 28px;
      border: 4px solid #000000;
      background-color: reds;
      width:200px;
      height:200px;
    }
    
    </style>

<body>
  <div>
    <center>

  <!--<input type="text" name="valor1" style="width: 13px;" maxlength="1" placeholder="1"/> 
  <input type="text" name="valor2" size="2" maxlength="1" placeholder="2"/>
  <input type="text" name="valor3" size="2" maxlength="1" placeholder="3"/>
  <input type="text" name="valor4" size="2" maxlength="1" placeholder="4"/>
  <input type="text" name="valor5" size="2" maxlength="1" placeholder="5"/>
  <input type="submit" value="Submit"/><input type="reset" value="Submit"/>-->
$op;
if($_GET['op']=="es"){
  $op="es";
} elseif($_GET['op']=="en") {
  $op="en";
}*/
//echo $_GET['op'];
//echo $op;
?>
<?php
function lanzarDados(){
        
    $valoresDados6= [];
    $valoresDados12= [];
            //$s=rand(1,6);
            echo '<div class="row">';
            echo '<div class="col-md-1"></div>';
            for($t=1;$t<6;$t++){
            $u=rand(1,6);
            echo '<div class="col-md-1"><img src="./img/Dado6/'.$u.'.png" height="200" width="200" onclick="vDados('.$t.')" id="'.$t.'" name="'.$u.'"/></div>';
            array_push($valoresDados6, $u);
            echo '<div class="col-md-1"></div>';
            //echo '<img src="./img/'$t'.png" height="100" width="100">' . '</img>'
            //echo '<div class="col-md-1"></div>';
              }
              $dado1=$valoresDados6[0];
              $dado2=$valoresDados6[1];
              $dado3=$valoresDados6[2];
              $dado4=$valoresDados6[3];
              $dado5=$valoresDados6[4];
              $_SESSION['dado1']=$dado1;
              $_SESSION['dado2']=$dado2;
              $_SESSION['dado3']=$dado3;
           
           
           
             $_SESSION['dado4']=$dado4;
              $_SESSION['dado5']=$dado5;
              
              /*
                $valord1=$valoresDados2[0];
            $valord2=$valoresDados2[1];
            $_SESSION['D21']= $valord1;
            $_SESSION['D22']= $valord2;
              */
            echo '</div>';
            echo '<div class="row">';
            echo '<div class="col-md-1"></div>';
            echo '<div class="col-md-1"></div>';
            echo '<div class="col-md-1"><br /><br /><br />
        <!-- Large modal -->
<button type="button" class="btn btn-success" data-toggle="modal" data-target=".bs-example-modal-lg" style="font-size:175%;">Jugar <span class="glyphicon glyphicon-play"></button>
<br />

<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
  <div class="modal-dialog modal-lg">
    <div class="modal-content" id="opcionDeReultado">
    </div>
  </div>
</div>
</div>';
            
            
            
            
            
            
            
            echo '<div class="col-md-1"><img src="./img/sum.png" onclick="vDados(9)" height="200" width="200"/></div>';
            echo '<div class="col-md-1"></div>';
            
             for($k=1;$k<2;$k++){
                 $h=rand(1,12);
                echo '<div class="col-md-1"><img src="./img/Dado12/1_'.$h.'.png" height="200" width="200" name="'.$h.'" id="12"/></div>';
                array_push($valoresDados12, $h);
                echo '<div class="col-md-1"></div>';
                echo '<div class="col-md-1"><img src="./img/res.png" onclick="vDados(8)" width="200"/></div>';
                }
               $sum12 = array_sum($valoresDados12);
               //echo $sum12;
            //echo '<div class="col-md-1"><img src="./img/Dado6/'.$t.'.png"/></div>';
                
                
                print('<div class="col-md-1"></div><div class="col-md-1"><div class="container">
        <div class="row text-center">
            <div class="col-md-12" style="margin-top: 20px;">
                <div class="pricing-table">
                    <div class="panel panel-primary" style="border: none;">
                        <div class="panel-body panel-body-landing">
                            <table class="table">
                                <tr>
                                    <td>Nombre: '.$_SESSION['jugador']->getNombre().'</td>
                                </tr>
                                <tr>
                                    <td>Edad: '.$_SESSION['jugador']->getEdad().'</td>
                                </tr>
                                <tr>
                                    <td>Idioma: '.$_SESSION['jugador']->getIdioma().'</td>
                                </tr>
                                <tr>
                                    <td>Modo: '.$_SESSION['jugador']->getModo().'</td>
                                </tr>
                                <tr>
                                    <td>Puntos: '.$_SESSION['jugador']->getPuntos().'</td>
                                </tr>


                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>');
    
    echo '</div>';
}
?>
<?php 
function lanzar2dados(){
   session_start();
      $valoresDados2= [];
    echo '<div class="row">';
            for($t=1;$t<3;$t++){
            $u=rand(1,6);
            echo '<div class="col-md-1"><img src="./img/Dado6/'.$u.'.png"/></div>';
            array_push($valoresDados2, $u);
            echo '<div class="col-md-1"></div>';
            //echo '<img src="./img/'$t'.png" height="100" width="100">' . '</img>'
            //echo '<div class="col-md-1"></div>';
              }
            $valord1=$valoresDados2[0];
            $valord2=$valoresDados2[1];
            $_SESSION['D21']= $valord1;
            $_SESSION['D22']= $valord2;

            echo '</div>';
}
?>
<?php
function botonComprobar(){
$res='<div class="row">
<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Windows 8 modal - Click to View</button>
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-body">
      <H2>Battery Low!</H2>
      <h4>Your Laptop battery is less then 10%.Recharge the battery.</h4>
      </div>
    </div>
  </div>
</div>
</div>';
return $res;
}
?>
<?php
function mostrarRes($r){
if($r==1){
print('<div class="modal-body" style="background-color: #0f8845">
            <H2>Correcto!</H2>
            <h4>SUMA AQUI</h4>
            </div>
            ');
} else {
  print('<div class="modal-body" style="background-color: red">
            <H2>Incorrecto!</H2>
            <h4>SUMA AQUI</h4>
            </div>');
}
}




?>
<?php 


?>
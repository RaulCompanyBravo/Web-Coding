<?php include('funciones.php');
?>
<?php session_start();
if($_SESSION['jugador']==null){header('Location: ./Index.php');} ?>
<html>
<head> 
 <style type="text/css">
    body{
	background-color: #444;
}

.vertical-offset-100{
    padding-top:100px;
}</style>
<meta charset="utf-8"> 

<?php echo headBS() ?>
 </head>
  <body background="./img/IndexWallpaper.jpg">
 <?php session_start(); ?>

<div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title"><center><b>Math Dice</b></center></h3>
			 	</div>
			  	<div class="panel-body">
			    	<form accept-charset="UTF-8" role="form" method="get" action="./Calculando.php">
                    <fieldset>
			    	  	<div class="form-group">
                  <input id="nombre2" name="nombre2" type="text" placeholder="" class="form-control input-md" required value="<?php echo $_SESSION['jugador']->getNombre(); ?>">
			    		</div>
			    		<div class="form-group">
              <input id="edad2" name="edad2" type="text" placeholder="" class="form-control input-md" value="<?php echo $_SESSION['jugador']->getEdad(); ?>" required="">
			    		</div>
			    		<center><b>Idioma</b></center>
			    		<div class="checkbox">
			    	    	<center>
			    	    	<label>
                    <input type="radio" name="idioma" id="idioma-0" value="es" <?php if($_SESSION['jugador']->getIdioma()=="es"){echo "checked";}; ?>> Español
			    	    	</label>
			    	    	<label>
                <input type="radio" name="idioma" id="idioma-1" value="en" <?php if($_SESSION['jugador']->getIdioma()=="en"){echo "checked";}; ?>> Ingles
			    	    	</label>
			    	    	</center>
			    	    </div>
			    	    <center><b>Tipo de juego</b></center>
			    		<div class="checkbox">
			    		    <center>
			    	    	<label>
                  <input type="radio" name="modo" id="radios-0" value="Junior" <?php if($_SESSION['jugador']->getModo()=="Junior"){echo "checked";};?>> Junior
			    	    	<label>
			    	    	<input type="radio" name="modo" id="radios-1" value="Junior+" <?php if($_SESSION['jugador']->getModo()=="Junior+"){echo "checked";};?>> Avanzado
			    	    	</label>
			    	    	</center>
			    	    </div>
			    	    <button class="btn btn-lg btn-info btn-block" type="submit">Volver <span class="glyphicon glyphicon-arrow-left"></button>
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>




  </body>
</html>



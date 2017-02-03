<?php include('funciones.php')?>
<?php //mod_usuario(); ?>
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
			    		    <input class="form-control" id="nombre" name="nombre" type="text" placeholder="Nombre" >
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" id="edad" name="edad" type="text" placeholder="Edad" required="">
			    		</div>
			    		<center><b>Idioma</b></center>
			    		<div class="checkbox">
			    	    	<center>
			    	    	<label>
			    	    		<input type="radio" name="idioma" id="idioma-0" value="es" checked required="">Español
			    	    	</label>
			    	    	<label>
			    	    		<input type="radio" name="idioma" id="idioma-1" value="en" required="">Ingles
			    	    	</label>
			    	    	</center>
			    	    </div>
			    	    <center><b>Tipo de juego</b></center>
			    		<div class="checkbox">
			    		    <center>
			    	    	<label>
			    	    		<input type="radio" name="modo" id="radios-0" value="Junior" checked="checked" required="">Junior
			    	    	</label>
			    	    	<label>
			    	    		      <input type="radio" name="modo" id="radios-1" value="Junior+" required="">Avanzado
			    	    	</label>
			    	    	</center>
			    	    </div>
			    	    
			    	    <button class="btn btn-lg btn-success btn-block" type="submit">Jugar <span class="glyphicon glyphicon-play"></span></button>
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>




  </body>
</html>



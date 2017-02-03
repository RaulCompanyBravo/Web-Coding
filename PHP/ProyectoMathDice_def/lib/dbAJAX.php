<?php

    $nombre = $_GET['q'];
    echo $nombre;

   	    $conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
        $query_euser="UPDATE usuario SET puntos=puntos+1 WHERE nombre='$nombre'";
   	    $conexion->query($query_euser);
   	    echo "mod";
  
?>
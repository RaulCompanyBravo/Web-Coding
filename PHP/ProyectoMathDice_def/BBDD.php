<?php //include('./lib/db.php'); 
class db{ 
   	var $server; 
   	var $db;
   	var $user;
   	var $pass;
   	var $puntos;
   	function __construct($server,$db,$user,$pass){ 
      	$this->server=$server;
      	$this->db=$db;
      	$this->user=$user;
      	$this->pass=$pass;
      
   	} 

   	function getServer(){return $this->server;}
	function getdb(){return $this->db;}
   	function getUser(){return $this->user;}
   	function getPass(){return $this->pass;}
   	

   	function setServer($v){$this->server = $v;}
   	function setdb($v){$this->db = $v;} 
   	function setUser($v){$this->user = $v;} 
   	function setPass($v){$this->pass = $v;}
   	
   	
   	function getDatos($v){
   	$conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
    $query = 'SELECT * FROM usuario where nombre="'.$v.'"';
    $resultado=$conexion->query($query);
    $datos_user_db=[];
    if (mysqli_num_rows($resultado) != 0){
    while ($rows = $resultado->fetch_assoc()) {
        $rows["id"]; $datos_user_db[0]=$rows["id"];
        $rows["nombre"]; $datos_user_db[1]=$rows["nombre"];
        $rows["apellidos"]; $datos_user_db[2]=$rows["apellidos"];
        $rows["edad"]; $datos_user_db[3]=$rows["edad"];
        $rows["sexo"];$datos_user_db[4]=$rows["sexo"];
        $rows["puntos"];$datos_user_db[5]=$rows["puntos"];
        }
        return $datos_user_db;
    } else {
        
        $query_auser="INSERT INTO usuarios.usuario (nombre, apellidos, edad, sexo, puntos) VALUES ('".$_GET['nombre']."', '', '".$_GET['edad']."', '','')";
        $conexion->query($query_auser);
        $query = 'SELECT * FROM usuario where nombre="'.$v.'"';
    $resultado=$conexion->query($query);
    while ($rows = $resultado->fetch_assoc()) {
        $rows["id"]; $datos_user_db[0]=$rows["id"];
        $rows["nombre"]; $datos_user_db[1]=$rows["nombre"];
        $rows["apellidos"]; $datos_user_db[2]=$rows["apellidos"];
        $rows["edad"]; $datos_user_db[3]=$rows["edad"];
        $rows["sexo"];$datos_user_db[4]=$rows["sexo"];
        $rows["puntos"];$datos_user_db[5]=$rows["puntos"];
        }
        return $datos_user_db;

    }
    
        $resultado->free();
   	}
   	
   	
   	function comprobar_User($v){
       	$conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
       	$dnombreu=[];
        $query = 'SELECT nombre FROM usuario where nombre="'.$v.'"';
        $resultado=$conexion->query($query);
        if (mysqli_num_rows($resultado) != 0){
            while ($rows = $resultado->fetch_assoc()) {
                $rows["nombre"]; $dnombreu[1]=$rows["nombre"];
            }
            return $dnombreu;
        } else {
            return false;
        }
   	}
   	
   	function modificarDatos($v,$v2b){
   	    $conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
            $query_muser="UPDATE usuario SET nombre='".$v."' WHERE nombre='".$v2b."'";
   	        $conexion->query($query_muser);
   	        
   	        
   	}
   	function modificarDatosEdad($v,$v2b){
   	    $conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
            $query_euser="UPDATE usuario SET edad='".$v."' WHERE nombre='".$v2b."'";
   	        $conexion->query($query_euser);
   	        
   	}
   	    function modificarPuntos($nombre){
   	    $conexion=new mysqli("localhost","raulcompanybravo","","usuarios");
            $query_euser="UPDATE usuario SET puntos=puntos+1 WHERE nombre='".$nombre."'";
   	        $conexion->query($query_euser);
   	}
   	

}
?>



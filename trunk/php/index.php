<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="vues/css/css.css"/>
<title>Projet xml</title>
</head>
<body>
 
 <ul>
	<a href="#"><li>Genres | </li></a>
	<a href="#"><li>Films | </li></a>
	<li>Rechercher : <input type="text" name="recherche"/></li>
  </ul> 
  
<?php
include ('modeles/Mconnect.php');

//Connexion � la base 
$bd = new Mconnect();
$connect=$bd->getRessource();

$stmt = ociparse($connect,"select * from PLANTE"); 
//On parse la requ�te � effectuer sans oublier de lui passer la chaine de connexion en param�tre 

ociexecute($stmt,OCI_DEFAULT); 
//On execute la requ�te en lui passant l'option OCI_DEFAULT 


echo "D�but----<br>\n\n"; 
  
while (ocifetch($stmt)){ //On parcourt les r�sultats 
  echo ociresult($stmt,1); //On r�cup�re le premier champ de la ma_table 
  echo ociresult($stmt,2); //On r�cup�re le deuxi�me champ de la ma_table 
} 
     
echo "<br>----fin\n\n"; 

$bd->close(); 
//On se d�connecte du serveur
	?>
  </body>
</html>
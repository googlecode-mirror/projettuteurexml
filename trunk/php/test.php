<html>
  <body>
  <?php
$connect = oci_connect("lp10","d3whrc2","iutdb"); 
//Connexion � la base 

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

ocilogoff($connect); 
//On se d�connecte du serveur
	?>
  </body>
</html>
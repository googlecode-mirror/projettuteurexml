<?php

class Mgenres {
	public function select_genres(){
		//Connexion � la base 
		$bd = new Mconnect();
		
		$connect=$bd->getRessource();
		
		$stmt = ociparse($connect,"select NOM_GENRE, ID_GENRE from GENRE ORDER BY NOM_GENRE"); 
		//On parse la requ�te � effectuer sans oublier de lui passer la chaine de connexion en param�tre 

		ociexecute($stmt,OCI_DEFAULT); 
		//On execute la requ�te en lui passant l'option OCI_DEFAULT 
		
		$bd->close(); 
		
		$tab = Mutilitaire::tableau($stmt);
		return $tab;
	}
}
?>
<?php 

class Java {
	public static function formulaire (){
		include_once('vues/form_ajout_film.php');
	}
	
	public static function resultats ($data){
		$path = Mutilitaire::configuration('java_path');
		echo "<div style='width:400px;'>";
		if (shell_exec('java')){
			if (empty($data)){
				echo "<div style='Background-color:#FFF'><strong>Votre entr�e n'est pas valide !!!</strong></div>";
			} else {
				if ($output = shell_exec($data)){
					echo "<div style='Background-color:#FFF'><strong>Commande ex�cut�e : ".$data."</strong><br/>";
					echo $output."<br/><br/><br/><br/></div>";
				} else {
					echo "<div style='Background-color:#FFF'><strong>Erreur, v�rifiez le path dans le fichier conf.ini</strong></div>";
				}
			}
		} else {
			echo "<strong>Votre ordinateur n�c�ssite l'installation de l'environnement Java</strong><br/>
				<span style='font-size:10px;'>(Le t�l�chargement est disponible <a href='http://www.java.com/fr/download/index.jsp'>>>ici<<</a>)</span>";
		}		
		echo "</div>";
	}
}

?>
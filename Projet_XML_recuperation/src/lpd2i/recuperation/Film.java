/*
 * Film.java 	14 f�vr. 2011
 * Projet_XML_recuperation
 */ 
package lpd2i.recuperation;

import java.util.ArrayList;

/**
 * Classe g�rant les informations d'un film
 * @author Xavier Mourgues
 * @version 0.1
 */
public class Film {
    /** Titre du film */
    private String titre;
    
    /** Dur�e du film */
    private int duree;
    
    /** Liste des acteurs */
    private ArrayList<Personne> acteurs;
    
    /** Liste des r�alisateurs */
    private ArrayList<Personne> realisateurs;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Film [titre=" + titre + ", duree=" + duree + ", acteurs=");
        for(Personne acteur : acteurs){
            str.append(acteur);
        }
        str.append(", realisateurs=");
        for(Personne realisateur : realisateurs){
            str.append(realisateur);
        }
        str.append("]");
        return str.toString();
    }
    
    
}

/*
 * Film.java 	14 f�vr. 2011
 * Projet_XML_recuperation
 */
package lpd2i.recuperation;

import java.util.ArrayList;

/**
 * Classe g�rant les informations d'un film
 * 
 * @author Xavier Mourgues
 * @version 0.1
 */
public class Film {
    /** Titre du film */
    private String titre;

    /** Dur�e du film */
    private int duree;

    /** Ann�e de sortie du film */
    private int annee;
    
    /** Note moyenne donn�e par les site */
    private float noteSite;
    
    /** R�sum� du film */
    private String resume;
    
    /** Genres du film */
    private ArrayList<String> genres;
    
    /** Commentaires du film */
    private ArrayList<Commentaire> commentaires;
    
    /** Liste des acteurs */
    private ArrayList<Personne> acteurs;

    /** Liste des r�alisateurs */
    private ArrayList<Personne> realisateurs;

    
    public Film(){
        this.acteurs = new ArrayList<Personne>();
        this.realisateurs = new ArrayList<Personne>();
        this.genres = new ArrayList<String>();
        this.commentaires = new ArrayList<Commentaire>();
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the duree
     */
    public int getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * TODO Commenter cette m�thode
     * @param parseInt
     */
    public void setAnnee(int annee) {
        this.annee = annee;
        
    }

    /**
     * TODO Commenter cette m�thode
     * @param f
     */
    public void setNoteSite(float note) {
        this.noteSite = note;
    }

    /**
     * TODO Commenter cette m�thode
     * @param nodeValue
     */
    public void setResume(String resume) {
        this.resume = resume;
    }

    /**
     * TODO Commenter cette m�thode
     * @param nodeValue
     */
    public void addGenre(String genre) {
        genres.add(genre);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Film [titre=" + titre + ", duree=" + duree + ", annee=" + annee
                + ", noteSite=" + noteSite + ", resume=" + resume + ", genres=");
        for(String genre : genres){
            str.append("," +genre);
        }
        str.append(", commentaires=");
        for(Commentaire com : commentaires){
            str.append(com);
        }
        str.append(", acteurs=");
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

    /**
     * TODO Commenter cette m�thode
     * @param personne
     */
    public void addRealisateur(Personne personne) {
        this.realisateurs.add(personne);
        
    }

    /**
     * TODO Commenter cette m�thode
     * @param parseActorsContent
     */
    public void setActeurs(ArrayList<Personne> acteurs) {
        this.acteurs = acteurs;
    }
    

}

/*
 * TestScraping.java 	14 f�vr. 2011
 * Projet_XML_recuperation
 */
package lpd2i.recuperation.tests;

import java.net.MalformedURLException;

import lpd2i.recuperation.Film;
import lpd2i.recuperation.Scrapping;

/**
 * Classe de teste du t�l�chargement des informations
 * 
 * @author Xavier Mourgues
 * @version 0.1
 */
public class TestScrapping {

    /**
     * TODO Commenter cette m�thode
     * 
     * @param args
     * @throws MalformedURLException 
     */
    public static void main(String[] args) throws MalformedURLException {
        Scrapping scrap = new Scrapping(
                args[1],
                Scrapping.ALLOCINE);
        
        Film film = scrap.extractFilm();
        
        film.save();

    }

}

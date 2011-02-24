/*
 * TestScraping.java 	14 f�vr. 2011
 * Projet_XML_recuperation
 */
package lpd2i.recuperation.tests;

import lpd2i.recuperation.Film;
import lpd2i.recuperation.Scraping;

/**
 * Classe de teste du t�l�chargement des informations
 * 
 * @author Xavier Mourgues
 * @version 0.1
 */
public class TestScraping {

    /**
     * TODO Commenter cette m�thode
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scraping scrap = new Scraping(
                "http://www.allocine.fr/film/fichefilm_gen_cfilm=29233.html",
                Scraping.ALLOCINE);

        Film film = scrap.extractFilm();

        System.out.println(scrap);
    }

}

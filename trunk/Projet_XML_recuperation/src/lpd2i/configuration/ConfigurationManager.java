/*
 * ConfigurationManager.java	11 avr. 2011
 * xMourgues 
 */
package lpd2i.configuration;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import sun.net.ResourceManager;

/**
 * Class singleton g�rant les configurations pour les diff�rents sites
 *
 * @author xMourgues
 * @version 
 */
public class ConfigurationManager {
    /** Constante indiquant que la page provient d'allocine */
    public static final int ALLOCINE = 1;

    /** Constante indiquant que la page provient du site IMDB */
    public static final int CINEFIL = 2;
    
    /** Collection des configurations des sites */
    private LinkedHashMap<Integer, SiteConfiguration> conf;
    
    /** variable d'instance de la classe de type singleton */
    private ConfigurationManager instance = null;
    
    /**
     * Constructeur priv� pour le singleton
     */
    private ConfigurationManager(){
	loadConfig();
    }
    
    /**
     * Charge la configuration a partir du fichier ini de configuration
     */
    private void loadConfig() {
	
    }
    
    /**
     * renvoie l'instance de la classe singleton
     * @return l'instance de la classe
     */
    public ConfigurationManager getInstance(){
	if(instance == null){
	    instance = new ConfigurationManager();
	}
	return instance;
    }
    
}

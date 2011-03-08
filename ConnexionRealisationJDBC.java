package connection;

import java.sql.*;


/**
 * Classe utilitaire SQL gerant :
 * <li> les connexion avec la base de donn�e Oracle, mysql ... </li>
 * <li>permettant �galement de r�aliser des requete sql simple et dynamique avec JDBC< </li> 
 * * @author Peji
 */
public class ConnexionRealisationJDBC {
	
	/** Permet la connexion */
	private static Connection cnx;
	
	/** Requete static */
	private static Statement stmt;
	
	/** Requete dymanique*/
	private static CallableStatement calStmt;
	
	/**
	 * Connexion � une base de donn�e Oracle
	 * Adresse par default IUT rodez
	 */
	public static void connextionOracle(String id, String mdp) throws SQLException {
		// Chargement du pilote oracle
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		// Chaine de connexion a la base de donn�e de l'iut de rodez
		// thin driver de type 4 --> Le driver est enti�rement �crit en Java
		String url= "jdbc:oracle:thin:@oracle.dometud.iut-rodez.local:1521:XE";
		// Ouverture de la connection
		cnx = DriverManager.getConnection(url, id, mdp);
		stmt = cnx.createStatement();
	}
	
	/**
	 * Connexion � une base de donn�e mySQL
	 * Adresse par d�faut serveur local 
	 */
	public static void connexionMySQL(String id, String mdp) throws SQLException, 
						InstantiationException, IllegalAccessException, ClassNotFoundException {
		// Chargement du pilote MySQL
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		// Chaine de connexion a la base de donn�e 
		String url = "jdbc:mysql://localhost:3306/NomDeLaBase";
		cnx = DriverManager.getConnection(url, "root", "");
		stmt = cnx.createStatement();
	}
	
	/**
	 * Execution d'une requete simple
	 * @param requete dont on souhaite obtenir le resutat
	 * @return le resultat de la requete execut�e
	 */
	public ResultSet executeRequete(String requete) throws SQLException {
		return stmt.executeQuery(requete);
	}
	
	/**
	 * Appel � une fonction SQL
	 * @param requete dont on souhaite obtenir le resutat
	 * @return le resultat de la requete execut�e
	 */
	public ResultSet callStatement(String requete) throws SQLException {
		calStmt = cnx.prepareCall(requete);
		return calStmt.executeQuery();
	}
	
	
	/**
	 * Fermeture de la connexion
	 */
	public void close() throws SQLException {
		stmt.close();
		calStmt.close();
		cnx.close();
	}
}

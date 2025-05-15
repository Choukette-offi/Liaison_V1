import java.sql.*;
import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Map;

public class JoueurBD {
	ConnexionMySQL laConnexion;
	Statement st;
	JoueurBD(ConnexionMySQL laConnexion){
		this.laConnexion=laConnexion;
	}

	int maxNumJoueur() throws SQLException{
		Integer res = null;
		this.st = laConnexion.createStatement();
		ResultSet max = st.executeQuery("Select MAX(numJoueur) nb from JOUEUR;");
		while(max.next()){
			res = max.getInt("nb");
		}
		max.close();
		return res;
	}


	int insererJoueur( Joueur j) throws  SQLException{
		throw new SQLException("méthode insererJoueur à implémenter");
	}


	void effacerJoueur(int num) throws SQLException {
		throw new SQLException("méthode effacerJoueur à implémenter");
	}

    void majJoueur(Joueur j)throws SQLException{
		throw new SQLException("méthode majJoueur à implémenter");
    }

    Joueur rechercherJoueurParNum(int num)throws SQLException{
    	throw new SQLException("méthode rechercherJoueurParNum à implémenter");
    }

	ArrayList<Joueur> listeDesJoueurs() throws SQLException{
		throw new SQLException("méthode listeDesJoueurs à implémenter");
	}
	
	String rapportMessage() throws SQLException{
		return "rapportMessage A faire";
	}
	
	String rapportMessageComplet() throws SQLException{
		return "rapportMessageComplet A faire";	
	}

	ArrayList<Map.Entry<String, Integer>> nbMsgParJour() throws SQLException{
		// Pour créer une valeur pouvant être ajoutée à l'ArrayList<Map.Entry<String, Integer>>
		// faire un new AbstractMap.SimpleEntry<>("coucou",45)
		throw new SQLException("méthode nbMsgParJour à implémenter");
	}
	ArrayList<Map.Entry<String, Integer>> nbMain() throws SQLException{
		// Pour créer une valeur pouvant être ajoutée à l'ArrayList<Map.Entry<String, Integer>>
		// faire un new AbstractMap.SimpleEntry<>("coucou",45)
		throw new SQLException("méthode nbMain à implémenter");
	}	
}

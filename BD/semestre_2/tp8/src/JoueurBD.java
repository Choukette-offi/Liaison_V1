import java.sql.*;
import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Map;

import javax.swing.text.StyledEditorKit.BoldAction;

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

	int insererJoueur(Joueur j) throws  SQLException{
		this.st = laConnexion.createStatement();
		int numJoueur = maxNumJoueur() + 1;

		char lettre = 'N';
		if(j.isAbonne()) lettre = 'O';
		st.executeQuery("Insert into JOUEUR values("+  numJoueur+ ",'" + j.getPseudo() + "','"+ j.getMotdepasse() + "','"+ lettre + "','"+ j.getMain() + "',"+  j.getNiveau()+")");
		return maxNumJoueur();
	}


	void effacerJoueur(int num) throws SQLException {
		this.st = laConnexion.createStatement();
		st.executeQuery("delete from MESSAGE where idUt1 =" + num +"or idUt2 = " + num);
		st.executeQuery("delete from JOUEUR where numJoueur =" + num);
	}

    void majJoueur(Joueur j)throws SQLException{
		throw new SQLException("méthode majJoueur à implémenter");
    }

    Joueur rechercherJoueurParNum(int num)throws SQLException{
		this.st = laConnexion.createStatement();
		ResultSet rs = st.executeQuery("Select * from JOUEUR where numJoueur = " + num);
		Joueur j = null;
		Boolean abonne = false;
		while(rs.next()){
			String pseudo = rs.getString("pseudo");
			String motdepasse = rs.getString("motdepasse");
			char main = rs.getString("main").charAt(0);
			int niveau = rs.getInt("niveau");
			if(rs.getString("abonne").equals("O")) abonne = true;
			j = new Joueur(num, pseudo, motdepasse, abonne , main, niveau);
		}
    	throw new SQLException("méthode rechercherJoueurParNum à implémenter");
		return j;
	}

	Joueur rechercherJoueurParPseudo(String pseudo)throws SQLException{
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

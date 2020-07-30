package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import objet.Marques;
import objet.Produits;

public class ProduitsDaoTest implements ProduitsDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Produits> extraire() {
		Connection connection = null;
		List<Produits> listePrd = new ArrayList<Produits>();

		try {
			connection = getConnection();

			Statement monCanal = connection.createStatement();
			ResultSet monResultat = monCanal.executeQuery("SELECT * FROM produits;");
			while (monResultat.next()) {
				// tant que cest vrai on continue
				listePrd.add(new Produits(monResultat.getInt("ID"), monResultat.getString("nom"), 
						monResultat.getInt("ID_cat"), monResultat.getInt("ID_mar")));

			}
			monResultat.close();
			monCanal.close();

		} catch (Exception e) {
			System.err.println("erreur d'execution" + e.getMessage());
		} finally {

			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				System.err.println("probleme de connexion" + e.getMessage());
			}

		}

		return listePrd;
	}

	@Override
	public void insert(Produits produits) {
		Connection connection = null;
		try {
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			int nb = monCanal.executeUpdate(
				 "insert into produits (ID, nom) " + 
			"values (" 
			+ produits.getId() + ",'"
			+ produits.getNom() + "','"
			+ produits.getID_cat() +"',"
			+ produits.getID_mar() + ");");

			if (nb == 1) {
				System.out.println("produits ajouté!");
			}

			monCanal.close();
		} catch (Exception e) {

			System.err.println("Probleme de connexion" + e.getMessage());

		} finally {

			try {
				if (connection != null)
					connection.close();

			} catch (SQLException e) {

				System.err.println("Probleme de connexion" + e.getMessage());
			}

		}

	}


	@Override
	public int update(String ancienNom, String nouveauNom) {
		Connection connection = null;
		int nb = 0;
		try {
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			nb = monCanal
					.executeUpdate(
							"update produits SET nom='" + nouveauNom + 
							"' where nom='" + ancienNom + "';");

			monCanal.close();

		} catch (Exception e) {
			System.err.println("erreur d'execution" + e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();

			} catch (SQLException e) {

				System.err.println("Probleme de connexion" + e.getMessage());
			}

		}
		return nb;
	}



	public Connection getConnection() {
		// recupere fichier properties
		ResourceBundle db = ResourceBundle.getBundle("database");

		try {
			// enregistre le pilote
			Class.forName(db.getString("db.driver"));

			return DriverManager.getConnection(db.getString("db.url"), db.getString("db.user"),
					db.getString("db.pass"));
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException();
		}

	}
}
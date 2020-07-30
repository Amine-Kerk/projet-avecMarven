package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import objet.Produits;

public interface ProduitsDao {

	List<Produits> extraire();
	void insert(Produits produits);

	void insererProduit(Connection connection, Produits produits) throws SQLException;
	int update (String ancienNom, String nouveauNom);


}
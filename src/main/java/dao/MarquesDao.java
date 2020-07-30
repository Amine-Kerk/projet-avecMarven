package dao;

import java.util.List;

import objet.Marques;

public interface MarquesDao {

	List<Marques> extraire();

	void insert(Marques marques);

	int update(String ancienNom, String nouveauNom);
}
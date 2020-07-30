package dao;

import java.util.List;

import objet.Allergenes;


public interface AllergenesDao {

	List<Allergenes> extraire();
	void insert(Allergenes allergenes);
	int update (String ancienNom, String nouveauNom);
}
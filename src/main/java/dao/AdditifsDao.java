package dao;

import java.util.List;

import objet.Additifs;

public interface AdditifsDao {


	List<Additifs> extraire();
	void insert(Additifs additifs);
	int update (String ancienNom, String nouveauNom);
}
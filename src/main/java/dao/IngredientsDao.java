package dao;

import java.util.List;

import objet.Ingredients;


public interface IngredientsDao {

	List<Ingredients> extraire();
	void insert(Ingredients ingredients);
	int update (String ancienNom, String nouveauNom);
}
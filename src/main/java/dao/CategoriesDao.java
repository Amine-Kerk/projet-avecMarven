package dao;

import java.util.List;

import objet.Categories;

public interface CategoriesDao {

	List<Categories> extraire();
	void insert(Categories categories);
	int update (String ancienNom, String nouveauNom);
}
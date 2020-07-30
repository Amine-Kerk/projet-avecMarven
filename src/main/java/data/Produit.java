package data;

import java.util.ArrayList;

import objet.Additif;
import objet.Allergene;
import objet.Categorie;
import objet.DonneesNutritionnelles;
import utils.ArrayListToString;

public class Produit {

	private Categorie categorie;
	private Marque marque;
	private ArrayList<Marque> marques;
	private String NomProduit;
	private String gradeNutri;
	private DonneesNutritionnelles donneesNutri;
	private ArrayList<Ingredient> listIngredients;
	private ArrayList<Allergene> listAllergenes;
	private ArrayList<Additif> listAdditifs;

	public Produit(Categorie categorie, Marque marque, String nomProduit, String gradeNutri,
	public Produit(Categorie categorie, ArrayList<Marque> listMarques, String nomProduit, String gradeNutri,
			DonneesNutritionnelles donneesNutri, ArrayList<Ingredient> listIngredients,
			ArrayList<Allergene> listAllergenes, ArrayList<Additif> listAdditifs) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.marques = listMarques;
		this.NomProduit = nomProduit;
		this.gradeNutri = gradeNutri;
		this.donneesNutri = donneesNutri;
		this.listIngredients = listIngredients;
		this.listAllergenes = listAllergenes;
		this.listAdditifs = listAdditifs;
	}

	@Override
	public String toString() {
		return "Produit [categorie=" + categorie.getLibelleCategorie() + ", marque=" + marque.getNomMarque() + ", NomProduit=" + NomProduit + ", gradeNutri="
				+ gradeNutri + ", donneesNutri=" + donneesNutri + ", listIngredients=" + listIngredients.toString()
				+ ", listAllergenes=" + listAllergenes.toString() + ", listAdditifs=" + listAdditifs.toString() + "]";
		return "Produit [categorie=" + categorie.getLibelleCategorie() + ", marque=" + marques + ", NomProduit=" + NomProduit + ", gradeNutri="
				+ gradeNutri + ", donneesNutri=" + donneesNutri + ", listIngredients=" + ArrayListToString.getStringArrayList(this.listIngredients)
				+ ", listAllergenes=" + ArrayListToString.getStringArrayList(this.listAllergenes) + ", listAdditifs=" + ArrayListToString.getStringArrayList(this.listAdditifs) + "]";
	}
}

package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import objet.Additifs;
import objet.Allergenes;
import objet.Ingredients;

public class Splitter {

		public static ArrayList <Ingredients> splitIngredients(String morceaux) {

			// crochet pour séparer tout ingrédients avec ", ; & | ,
			// veut dire l'un ou l'autre de ces caractères, désigne un groupe
			List<String> ingredients = Arrays.asList(morceaux.split("[,;|]",-1));

			ArrayList<Ingredients> listeIngredients = new ArrayList<Ingredients>();

				for (String nomingre : ingredients) {

					listeIngredients.add(new Ingredients(nomingre));
			}

					return listeIngredients;
		}

		public static ArrayList <Additifs> splitAdditifs(String morceaux) {

			List<String> additifs = Arrays.asList(morceaux.split(",",-1));

			ArrayList<Additifs> listeAdditifs = new ArrayList<Additifs>();

			for (String nomadditifs : additifs) {

				listeAdditifs.add(new Additifs(nomadditifs));
		}

			return listeAdditifs;
		}

		public static ArrayList <Allergenes> splitAllergenes(String morceaux) {

			List<String> allergenes = Arrays.asList(morceaux.split(",",-1));

			ArrayList<Allergenes> listeAllergenes = new ArrayList<Allergenes>();

			for (String nomallergenes : allergenes) {

				listeAllergenes.add(new Allergenes(nomallergenes));
		}

					return listeAllergenes;
		}

}
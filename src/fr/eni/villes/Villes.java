package fr.eni.villes;

import java.util.Random;

public class Villes {

	static Random hasard = new Random();

	static String[] villes = {"Lille", "Lens", "Amiens", "Rouen", "Caen",
			"Rennes", "Nantes", "Niort", "Bordeaux", "Bayonne"};
	static String[] villesCopy = villes.clone();

	public static void main(String[] args) {
		System.out.println("Bienvenu dans l'exerice : villes");
		System.out.println("-------Liste des villes--------");
		imprimer(villes);// imprimer le tableau
		hasardVilles(villes);// applique la méthode
		System.out.println("-------Villes avec chiffres au hasard--------");
		imprimer(villes);// ré-imprimer au hasard
		System.out.println("-------Villes commencant par la lettre A--------");
		imprimerA(villesCopy); // imprime les villes commencant par la lettre A
	}
	// méthode pour afficher les éléments du tableau
	public static void imprimer(String[] villes) {
		for (String ville : villes) {
			System.out.println(ville);
		}
	}
	// méthode pour afficher les villes commencant par A
	public static void imprimerA(String[] villesCopy) {
		for (String ville : villesCopy) {
			if (ville.charAt(0) == 'A') {
				System.out.println(ville);
			}
		}
	}

	// méthode pour afficher les éléments avec un chiffre au hasard à la fin
	public static void hasardVilles(String[] villes) {
		for (int i = 0; i < villes.length; i++) {
			villes[i] += hasard.nextInt(9);
		}
	}
}
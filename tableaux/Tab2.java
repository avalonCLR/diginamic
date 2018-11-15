package tableaux;

import java.util.Scanner;

/**
 * Créer un tableau, entrer des valeurs, calculer la somme et la moyenne des
 * valeurs.
 * 
 * @author CLR
 *
 */
public class Tab2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer une taille de tableau");

		int taille = sc.nextInt();
		int moy = 0;
		int som = 0;
		int[] tab = new int[taille];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("donner une valeur");
			int nb = sc.nextInt();
			tab[i] = nb;
			som = som + nb;

		}
		moy = som / taille;

		System.out.println("Moyenne = " + moy);
		System.out.println("Somme = " + som);
	}

}

package tableaux;

import java.util.Scanner;

/**
 * Crée un tableau, ajoute +1 à chaque valeur saisie, affiche le tableau.
 * @author CLR
 *
 */
public class Tab11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer la taille du tableau");

		int taille = sc.nextInt();

		int[] tab = new int[taille];

		int inc = 0;

		for (int i = 0; i < tab.length; i++) {
			System.out.println("entrer une valeur");
			int val = sc.nextInt();
			inc = val + 1;
			tab[i] = inc;

		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}

package tableaux;

import java.util.Scanner;

/**
 * Crée un tableau et l'utilisateur renseigne les valeurs dans un premier temps.
 * Dans un second temps recherche le plus grand nombre saisi, 
 * affiche ce nombre, et affiche aussi sa position dans le tableau.
 * 
 * @author CLR
 *
 */
public class Tab9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("definir taille du tableau");

		int taille = sc.nextInt();

		int[] tab = new int[taille];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("entrer une valeur");
			int val = sc.nextInt();
			tab[i] = val;
		}

		int grand = -1;
		int pos = 0;

		for (int i = 0; i < tab.length; i++) {
			if (grand < tab[i]) {
				grand = tab[i];
				pos = i;
			}
		}
		System.out.println("Plus grand = " + grand);
		System.out.println("Position = " + pos);

	}

}

package tableaux;

import java.util.Scanner;

/**
 * Crée un tableau de notes, l'utilisateur renseigne les notes,
 * la moyenne des notes est affichée ainsi que le nombre de notes supérieures à la moyenne.
 * @author CLR
 *
 */
public class Tab10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer taille du tableau");

		int taille = sc.nextInt();

		int total = 0;

		int[] tab = new int[taille];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("entrer une note");
			int note = sc.nextInt();
			tab[i] = note;
			total = note + total;

		}

		int moy = 0;
		int noteSup = 0;

		moy = total / taille;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > moy) {
				noteSup = noteSup + 1;
			}
		}
		System.out.println("Moyenne = " + moy);
		System.out.println("Note Superieures a Moyenne = " + noteSup);

	}

}

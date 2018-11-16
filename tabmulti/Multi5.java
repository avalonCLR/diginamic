package tabmulti;

import java.util.Random;

/**Crée un tableau de 4 matières, pour chaque matière 3 notes sont renseignées de manière aléatoire et automatique.
 * Affiche la moyenne de chaque matière.
 * Affiche la moyenne de toutes les moyennes.
 * @author CLR
 *
 */
public class Multi5 {

	public static void main(String[] args) {

		int[][] tab = new int[4][3];

		int note = 0;
		int som = 0;
		int moy = 0;
		int noteTot = 0;
		int moyTot = 0;
		int temp = 0;
		int nbMat = 0;

		Random r = new Random();

		for (int i = 0; i < tab.length; i++) {
			temp = i; 									// i = 1 matiere
			for (int j = 0; j < tab[i].length; j++) {
				note = r.nextInt(21); 					// genere un int aleatoire entre 0 et 20
				tab[i][j] = note; 						// stock la valeur dans le tableau
				System.out.print(tab[i][j] + " ");
				if (temp == i) { 						// pour chaque matiere(i) on effectue:
					som = som + tab[i][j]; 				// somme des notes de la matiere
					noteTot = noteTot + 1; 				// comptage du nombre de note
				}

			}
			nbMat++; 									// incremente par matiere
			System.out.println(noteTot);
			moy = som / noteTot; 						// moyenne par matiere
			System.out.println("Moyenne matiere = " + moy);
			moyTot = moyTot + moy;
		}
		moyTot = moyTot / nbMat; 						// moyenne totale
		System.out.println("Moyenne Totale = " + moyTot);
	}

}

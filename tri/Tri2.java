package tri;

public class Tri2 {

	public static void main(String[] args) {

		// exemple : tri par bulle

		int[] tab = { 11, 45, -3, 12, 7, 3, 0, 10 };

		boolean permuteP = true;

		int valeurTemp = 0;

		while (permuteP == true) {
			permuteP = false;
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					valeurTemp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = valeurTemp;
					permuteP = true;
				}

			}
		}

		afficheTableau(tab);
	}

	public static void afficheTableau(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}

	}

}

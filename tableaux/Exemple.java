package tableaux;

/**
 * Exemple du cours
 * 
 * @author Noel Maurice
 *
 */

public class Exemple {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int courant = Integer.MIN_VALUE;
		boolean croissantP = true;

		int[] tableau = { 0, 2, 4, 3, 7, 10, 15 };

		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] > max) {
				max = tableau[i];
			}

			if (tableau[i] < min) {
				min = tableau[i];
			}

			if (tableau[i] < courant) {
				croissantP = false;

			}

			courant = tableau[i];
		}

		System.out.println("max => " + max);
		System.out.println("min => " + min);
		System.out.println("croissant => " + croissantP);

		afficheTableau(tableau);
	}

	public static void afficheTableau(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");

		}

		System.out.println();

	}

}

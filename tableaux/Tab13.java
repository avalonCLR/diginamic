package tableaux;

/**
 * Calcul le "JOKE" en multipliant chaque élément du tableau 1 par chaque élément du tableau 2 et additionne le tout.
 * @author CLR
 *
 */
public class Tab13 {

	public static void main(String[] args) {

		int joke = 0;

		int[] tab1 = { 4, 8, 7, 12 };
		int[] tab2 = { 3, 6 };

		for (int i = 0; i < tab2.length; i++) {
			for (int j = 0; j < tab1.length; j++) {
				joke = joke + (tab1[j] * tab2[i]);
			}
		}
		System.out.println("joke = " + joke);

	}

}

package tableaux;

/**
 * Crée un tableau qui additionne les valeurs de 2 autres tableaux.
 * @author CLR
 *
 */
public class Tab12 {

	public static void main(String[] args) {

		int[] tab1 = { 4, 8, 7, 9, 1, 5, 4, 6 };
		int[] tab2 = { 7, 6, 5, 2, 1, 3, 7, 4 };
		int[] tab3 = new int[8];

		for (int i = 0; i < tab1.length; i++) {
			tab3[i] = tab1[i] + tab2[i];
		}
	}

}

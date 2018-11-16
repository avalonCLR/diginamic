package tabmulti;

/**
 * Crée un tableau de 6x13 rempli de 0.
 * @author CLR
 *
 */
public class Multi1 {

	public static void main(String[] args) {

		int[][] tab = new int[6][13];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				tab[i][j] = 0;
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}

	}

}

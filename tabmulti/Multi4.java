package tabmulti;

/**
 * Recherche et affiche la plus grande valeur au sein d'un tableau à 2 dimensions
 * préalablement rempli.
 * 
 * @author CLR
 *
 */
public class Multi4 {

	public static void main(String[] args) {

		int[][] tab = new int[][] { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0 }, 
				{ 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 99, 0 },
				{ 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 23, 0, 0, 0, 0, 0, 12, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				};

		int max = 0;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (max < tab[i][j]) {
					max = tab[i][j];
				}
				System.out.println(max);
			}
		}

	}

}

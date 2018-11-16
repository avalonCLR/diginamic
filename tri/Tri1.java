package tri;

public class Tri1 {

	public static void main(String[] args) {

		// exemple: tri par insertion
		
		int[] tab = { 12, 15, 11, 22, -1, -2, 32, 8 };

		for (int i = 0; i < tab.length ; i++) {

			int min = tab[i];
			int indiceMin = i;
			int valeurTemp = min;

			for (int j = i + 1; j < tab.length ; j++) {
				if (tab[j] < min) {
					min = tab[j];
					indiceMin = j;
				}
			}
			tab[i] = min;
			tab[indiceMin] = valeurTemp;

			System.out.print(tab[i]+" ");
		}

	}

}

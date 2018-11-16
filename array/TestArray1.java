package array;

public class TestArray1 {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// afficher les elements du tableau
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		System.out.println();

		// afficher les elements dans l'ordre inverse
		for (int index = array.length - 1; index >= 0; index--) {
			System.out.print(array[index] + " ");
		}

		System.out.println();

		// afficher uniquement les entiers superieurs a 3
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 3) {
				System.out.print(array[index] + " ");
			}
		}

		System.out.println();

		// affiche uniquement les entiers pairs
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0) {
				System.out.print(array[index] + " ");
			}
		}
		System.out.println();

		// affiche le plus grand element du tableau
		int max = 0;
		
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] > max) {
				max = array[index];
			}
		}
		System.out.println(max);

		
		// affiche le plus petit element du tableau
		int min = 0;
		
		for (int index = 0; index < array.length - 1; index++) {
			if(array[index]<min) {
				min = array[index];
			}
		}System.out.println(min);
		
	}

}

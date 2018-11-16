package array;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		//trier le tableau en utilisant la classe Arrays
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));

	}

}

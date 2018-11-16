package array;

import java.util.Scanner;

public class ArrayEx4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] tab = new int[1];

		boolean menu = true;

		int choice = 0;
		int position = 0;
		
		while (menu == true) {

			choice = select();

			if (choice == 1) {

				 if (position >= tab.length){
					 
	                 int[] tmp = new int[tab.length+1];
	                 	for(int i=0; i<tab.length; i++) {
	                 		tmp[i] = tab[i];
	                 	}
	                 tab = tmp;
	             }
				
				System.out.println("Please type a number to insert in array");
				int number = sc.nextInt();
				tab[position] = number;
				position++;

			}

			if (choice == 2) {
				option2(tab);
			}

			if (choice == 3) {
				menu = false;
				System.out.println("Program exited");
			}

		}

	}

	public static int select() {
		System.out.println("Please select:");
		System.out.println("Press [1] to add a number to the array");
		System.out.println("Press [2] to display array");
		System.out.println("Press [3] to exit program");
		System.out.println();
		int choice = 0;
		choice = sc.nextInt();
		return choice;
	}


	public static void option2(int[] tab) {

		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();

	}

}

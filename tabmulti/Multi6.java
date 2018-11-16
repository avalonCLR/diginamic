package tabmulti;

import java.util.Scanner;

/**
 * Crée un tableau rempli de 0, demande à l'utilisateur de choisir une position
 * dans le tableau, la position de l'utilisateur est représenté par un 1,
 * l'utilisateur peut ensuite se déplacer dans le tableau via un menu. Si le
 * déplacement n'est pas possible, l'utilisateur est invité à effectuer un autre
 * choix.
 * 
 * @author CLR
 *
 */
public class Multi6 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int intY = 4;
		int intX = 4;

		int x = 0;
		int y = 0;

		int[][] tab = new int[intY][intX];

		init(tab); // initialisation du tableau rempli de 0

		System.out.println("Welcome, Start game? Yes[1] No[0]");
		int input = sc.nextInt();
		System.out.println();

		if (input == 1) {
			startY(y); // initialisation première valeur de position utilisateur
			startX(x); // initialisation deuxième valeur de position utilisateur
			moveTab(tab, x, y); // affiche la position de l'utilisateur dans le tableau
		} else if (input == 0) {
			System.out.println("Have a nice day");
		} else {
			System.out.println("Please try again");
		}

		while (input == 1) {

			menu(); // affiche le menu

			int input2 = sc.nextInt();

			// up & left
			if (input2 == 0) {

				x = x - 1;
				y = y - 1;

				if (y < 0 | x < 0) {

					cannotMove(); // ne peut pas effectuer le déplacement
					x = x + 1;
					y = y + 1;

				} else {

					moveTab(tab, x, y); // effectue le déplacement utilisateur et affiche le tableau
				}
			}

			// up & right
			if (input2 == 1) {

				x = x - 1;
				y = y + 1;

				if (y < 0 | x >= tab.length) {

					cannotMove(); // ne peut pas effectuer le déplacement
					x = x - 1;
					y = y + 1;

				} else {

					moveTab(tab, x, y); // effectue le déplacement utilisateur et affiche le tableau
				}
			}

			// down & left
			if (input2 == 2) {

				x = x + 1;
				y = y - 1;

				if (x < 0 | y >= tab.length) {

					cannotMove(); // ne peut pas effectuer le déplacement
					x = x + 1;
					y = y - 1;

				} else {

					moveTab(tab, x, y); // effectue le déplacement utilisateur et affiche le tableau

				}
			}

			// down & right
			if (input2 == 3) {

				x = x + 1;
				y = y + 1;

				if (y >= tab.length | x >= tab.length) {

					cannotMove(); // ne peut pas effectuer le déplacement
					x = x - 1;
					y = y - 1;

				} else {
					moveTab(tab, x, y); // effectue le déplacement utilisateur et affiche le tableau
				}
			}

			// quit
			if (input2 == 4) {
				System.out.println("See you soon!");
				input = 0;
			}

		}

	}

	public static void init(int[][] tab) {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = 0;
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void moveTab(int[][] tab, int y, int x) {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i == y & j == x) {
					tab[i][j] = 1;
				} else {
					tab[i][j] = 0;
				}
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void menu() {
		System.out.println("Select move:");
		System.out.println("[0] up & left");
		System.out.println("[1] up & right");
		System.out.println("[2] down & left");
		System.out.println("[3] down & right");
		System.out.println("[4] Quit");
	}

	public static void cannotMove() {
		System.out.println("Please select different move");
	}

	public static int startY(int y) {
		System.out.println("Please enter your position in Y axis:");
		y = sc.nextInt();
		if (y > 0) {
			y = y - 1;
		}
		System.out.println("Y = " + y);
		System.out.println();
		return y;
	}

	public static int startX(int x) {
		System.out.println("Please enter your position in X axis:");
		x = sc.nextInt();
		if (x > 0) {
			x = x - 1;
		}
		System.out.println("X = " + x);
		System.out.println();
		return x;
	}

}

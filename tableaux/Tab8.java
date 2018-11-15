package tableaux;

import java.util.Scanner;

/**
 * Crée un tableau de valeurs, renseigne les valeurs de l'utilisateur, vérifie
 * si les valeurs sont des multiples de 3 ou non et 
 * affiche le nombre de multiple et non multiple de 3.
 * 
 * @author CLR
 *
 */
public class Tab8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("saisir taille du tableau");

		int taille = sc.nextInt();

		int[] tab = new int[taille];

		int multi = 0;
		int nonM = 0;

		for (int i = 0; i < tab.length; i++) {
			System.out.println("entrer une valeur");
			int val = sc.nextInt();
			tab[i] = val;

			if (val % 3 == 0) {
				multi = multi + 1;
			} else {
				nonM = nonM + 1;
			}
		}
		System.out.println("nombres multiple de 3 = " + multi);
		System.out.println("nombres non multiple de 3 = " + nonM);

	}

}

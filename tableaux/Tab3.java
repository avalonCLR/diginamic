package tableaux;

import java.util.Scanner;
/**
 * Crée un premier tableau et y affiche les valeurs saisies par l'utilisateur.
 * Crée un second tableau qui affiche les valeurs saisies par l'utilisateur en ordre inverse.
 * @author CLR
 *
 */
public class Tab3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrer taille de tableau");
		
		int taille = sc.nextInt();
		
		int[] tab1 = new int [taille];
		int[] tab2= new int [taille];
		
		for(int i = 0; i < tab1.length; i++ ) {
			System.out.println("entrer une valeur");
			int nb = sc.nextInt();
			tab1[i] = nb;
			tab2[(taille-1)-i] = nb;
		}
		
		for(int i = 0; i < tab1.length; i++) {
			System.out.println(tab1[i]);
			
		}
		for(int i = 0; i < tab1.length; i++) {
			System.out.println(tab2[i]);
		}
	}

}

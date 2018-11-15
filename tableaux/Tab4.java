package tableaux;

import java.util.Scanner;

/**
 * Crée un tableau, permet à l'utilisateur de rentrer les valeurs, vérifie si les valeurs sont en ordre croissant, 
 * ensuite affiche le plus grand nombre, le plus petit nombre et si les valeurs sont en ordre croissant. 
 * @author CLR
 *
 */
public class Tab4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrer la taille du tableau");
		
		int taille = sc.nextInt();
		
		int[] tab = new int[taille];
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println("entrer valeur");
			int v = sc.nextInt();
			tab[i] = v;
			
		}

		int min = taille;
		int max = -1;
		int courant = -1;
		boolean croissant = true;
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i]<courant) {
				croissant = false;
			}
			
			courant = tab[i];
			
			if(max < tab[i]) {
				max = tab[i];
				
			} 
			if(min > tab[i]) {
				min = tab[i];
				
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		System.out.println("Croissant = "+croissant);
	}

}

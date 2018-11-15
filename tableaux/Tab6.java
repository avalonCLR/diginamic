package tableaux;

/**
 * Retranscription de l'exercice 6
 * @author CLR
 *
 */
public class Tab6 {

	public static void main(String[] args) {

		int nombre[] = new int[7];

		nombre[0] = 1;

		for (int k = 1; k < 6; k++) {
			nombre[k] = nombre[k - 1] + 2;
		}

		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
	}

}

package tableaux;
/**
 * Retranscription de l'exercice 7
 * @author CLR
 *
 */
public class Tab7 {

	public static void main(String[] args) {

		int[] suite = new int[7];

		suite[0] = 1;
		suite[1] = 1;

		for (int i = 2; i < suite.length; i++) {
			suite[i] = suite[i - 1] + suite[i - 2];

		}
		for (int i = 0; i < suite.length; i++) {
			System.out.println(suite[i]);
		}

	}

}

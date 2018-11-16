package array;

public class TestArray2 {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		//moyenne du tableau
		int somme = 0;
		int nbValeurs = 0;
		
		for(int i =0; i<array.length; i++) {
			somme = somme+array[i];
			nbValeurs = array.length;
			
		}System.out.println(somme/nbValeurs);
	
		//recherche de l'index
		for(int i =0; i<array.length; i++) {
			if(array[i]==15) {
				System.out.println(i);
			}
		}
		
		//trouver le nombre d'entiers en doublon dans le tableau
		int doublon = 0;
		for(int i =0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					doublon = doublon+1;
				}
			}
			
		}System.out.println(doublon);
		
	}

}

package array;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a rank");
		int rank = sc.nextInt();
		
		for(int i = 0; i<rank+1; i++) {
	            System.out.println(i + ": " + fibonacci(i));
		}
	}
	
	public static long fibonacci(int n) {
        if (n <= 1) { 
        	return n;
        } else {
        	return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}

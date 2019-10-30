package com.codingninja.pattern;

import java.util.Scanner;

public class TriangularNumberPattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0, j = 0;
        while(i < number) {
            while(j <= i) {
                System.out.print(i + 1);
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
		
	}

}

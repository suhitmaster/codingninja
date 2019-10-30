package com.codingninja.pattern;

import java.util.Scanner;

public class InvertedNumberPattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int row = 0;
        int p = number;
        while(row < number) {
            int column = 0;
            while(column < (number - row)){
                System.out.print(p);
                column = column + 1;
            }
            p = p - 1;
            row = row + 1;
            System.out.println();
        }

		
	}
}

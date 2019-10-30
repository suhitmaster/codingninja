package com.codingninja.pattern;

import java.util.Scanner;

public class CharacterPattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0, j = 0;
        while(i < number) {
            char ithChar = (char)('A' + i);
            while(j <= i) {
                System.out.print(ithChar);
                ithChar = (char) (ithChar + 1);
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
		
	}

}

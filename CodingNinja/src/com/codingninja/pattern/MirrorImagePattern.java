package com.codingninja.pattern;

import java.util.Scanner;

public class MirrorImagePattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int row = 0;
        while(row < number) { 
            
            int spaces = 1;
            while(spaces < number - row) {
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int stars = 0;
            int p = 1;
            while(stars <= row) {
                System.out.print(p);
                stars = stars + 1;
                p = p+ 1;
            }
            System.out.println();
            row = row + 1;
        }
		
	}

}

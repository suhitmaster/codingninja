package com.codingninja.pattern;

import java.util.Scanner;

public class ReverseNumberPattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0, j = 0;
       int p = 1;
        while(i < number) {
            while(j <= i) {
                System.out.print(p);
                j++;
                p = p - 1;
            }
            System.out.println();
            i++;
            p = i + 1;
            j = 0;
        }
		
	}

}

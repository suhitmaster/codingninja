package com.codingninja.pattern;

import java.util.Scanner;

public class TriangleOfNumbers {
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
            int p = row;
            int numbers = 0;
            while(numbers <= row) {
                System.out.print(p + 1);
                numbers = numbers + 1;
                p = p + 1;
            }
            p = p -1;
            numbers = 0;
            
            while(numbers < row){
                System.out.print(p);
                p = p - 1;
                numbers = numbers +1;
            }
            System.out.println();
            row = row + 1;
        }
		
	}

}

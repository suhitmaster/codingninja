package com.codingninja.pattern;
import java.util.Scanner;

public class ParellelogramPattern {
	public static void main(String[]cp) {
		Scanner sc = new Scanner(System.in);
		int number = 3;//sc.nextInt();
		int row = 1;
		while(row <= number) {
			int space = 1;
			while(space <= (row -1)) {
				System.out.print(' ');
				space = space + 1;
			}
			int star = 1;
			while(star <= number) {
				System.out.print("*");
				star = star + 1;
			}
			row = row + 1;
			System.out.println();
		}

	}

}

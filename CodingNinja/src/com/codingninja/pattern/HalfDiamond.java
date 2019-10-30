package com.codingninja.pattern;
import java.util.Scanner;

public class HalfDiamond {
	public static void main(String [] cp) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int row = 1;
		System.out.println('*');
		while(row <= number1) {
			System.out.print('*');	
			int column = 1;
			while(column <= row) {
				System.out.print(column);
				column = column + 1;
			}
			column = 1;
			int p = row - 1;
			while(column <= (row -1)) {
				System.out.print(p);
				column = column + 1;
				p = p -1;
			}
			System.out.println('*');
			row = row + 1;
		}
		int number2 = number1 - 1;
		row = number2;
		while(row >= 1) {
			System.out.print('*');	
			int column = 1;
			while(column <= row) {
				System.out.print(column);
				column = column + 1;
			}
			column = 1;
			
			int p = row - 1;
			while(column <= (row -1)) {
				System.out.print(p);
				column = column + 1;
				p = p -1;
			}
			System.out.println('*');

			row = row - 1;
		}
		System.out.println('*');
	}
}

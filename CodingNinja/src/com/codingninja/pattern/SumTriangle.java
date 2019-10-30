package com.codingninja.pattern;

import java.util.Scanner;

public class SumTriangle {
	public static void main(String [] cp) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int row = 1;
		while(row <= number) {
			int column = 1;
			while(column <= row) {
				System.out.print(column);
				if(row > 1 & column !=row) {
					System.out.print("+");
				}
				column = column + 1;
			}
			System.out.print("=");
			int ans = (row * (row +1))/2;
			System.out.print(ans);
			System.out.println();
			row++;
		}
	}

}

package com.codingninja.test1;

import java.util.Scanner;

public class Pattern {
	public static void main(String []cp) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row <= n) {
			int col = 1;
			int p = n;
			while(col <= n) {
				if(p == row) {
					System.out.print("*");
				}
				else {
					System.out.print(p);
				}
				col = col + 1;
				p = p - 1;
			}
			System.out.println();
			row = row + 1;
		}
	}

}

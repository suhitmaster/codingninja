package com.codingninja.pattern;
import java.util.Scanner;

public class OddSquare {
	public static void main(String []cp) {
		Scanner sc = new Scanner(System.in);
		int number = 5;//sc.nextInt();
		int start = 1;
		int end = ((number*2) -1);
		int row = 1;
		int pivot = 0;
		while(row <= number) {
			int column = 1;
			int p = row + pivot;
			while(column <= number) {
				
				System.out.print(p);
				column = column + 1;
				if(p == end) {p = start; continue;}
				p = p + 2;
				
			}
			row = row + 1;
			pivot = pivot + 1;
			System.out.println();
		}
	}
}

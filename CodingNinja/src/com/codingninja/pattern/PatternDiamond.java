package com.codingninja.pattern;
import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {       
		//Scanner sc = new Scanner(System.in);
		int number = 7;//sc.nextInt();
		int row = 0;
		int n = (number /2) + 1;
		while(row < n) { 
			int spaces = 1;
			while(spaces < n - row) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
			int stars = 0;
			while(stars <= row) {
				System.out.print("*");
				stars = stars + 1;
			}
			stars = 0;
			while(stars < row){
				System.out.print("*");
				stars = stars + 1;
			}
			System.out.println();
			row = row + 1;
		}
		int remain = number - n;
		row = 1;
		int remainStars = remain;
		while(row <= remain) {
			int spaces = 1;
			while(spaces <= row) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
			int stars = 1;
			while(stars <= remainStars) {
				System.out.print("*");
				stars = stars + 1;
			}
			stars = 1;
			while(stars < remainStars){
				System.out.print("*");
				stars = stars + 1;
			}
			System.out.println();
			row++;
			remainStars = remainStars-1;
		}

	}
}

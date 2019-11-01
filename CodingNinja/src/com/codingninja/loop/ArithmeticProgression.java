package com.codingninja.loop;

import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String []cp) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int term = 0;
		for(int i=0, j=1; j<=x; i++) {
			term = (3* (i +1)) + 2;
			if(term %4 == 0) {
				continue;
			}
			j++;
			System.out.print(term + " ");
			
		}

	}
}

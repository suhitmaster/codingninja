package com.codingninja.loop;

import java.util.Scanner;

public class NthFibNumber {
	public static void main(String []cp) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x == 1 || x == 2) {
			System.out.println("1");
			return;
		}
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 0;
		System.out.print(firstTerm);
		System.out.print(" " + secondTerm);
		for(int i = firstTerm + secondTerm; i <=(x - 1); i++) {
			thirdTerm = firstTerm + secondTerm;
			System.out.print(" " +thirdTerm);
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		//System.out.println(thirdTerm);
	}
}

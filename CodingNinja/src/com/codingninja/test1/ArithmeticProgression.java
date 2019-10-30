package com.codingninja.test1;

import static java.lang.System.in;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		boolean flag = false;
		for(int i =0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		if(n >= 1) {
			temp =  arr[1] - arr[0];
		}
		else {
			System.out.println("true");
			return;
		}
		int diff;
		for(int i =2 ; i < n; i++) {
			diff = arr[i] - arr[i -1]; 
			if(diff != temp) {
				flag = true;
				break;
			}
			temp = diff;
		}
		if(flag) System.out.println("false");
		else System.out.println("true");
	}

}
 
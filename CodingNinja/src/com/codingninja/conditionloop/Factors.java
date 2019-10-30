package com.codingninja.conditionloop;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int index=2; index <= number /2; index++) {
			if(number % index == 0) {
                System.out.print(index + " ");
				}
			}
		

	}

}

package com.codingninja.conditionloop;

import java.util.Scanner;

public class FindPowerNumber {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        long result = 1;
        for(int i=1; i <= power; i++) {
            result = result * number;
        }
        System.out.println(result);

	}

}

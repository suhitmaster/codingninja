package com.codingninja.conditionloop;

import java.util.Scanner;

public class SumOfNEvenIOdd {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        int digit = 0;
        int sum_of_even = 0;
        int sum_of_odd = 0;
        while(number != 0 ){
            digit = number % 10;
            if(digit % 2 == 0) {
                sum_of_even = sum_of_even + digit;
            }
            else {
                sum_of_odd = sum_of_odd + digit;
            }
            number = number / 10;
        }
        System.out.print(sum_of_even + "   " + sum_of_odd);
	}

}

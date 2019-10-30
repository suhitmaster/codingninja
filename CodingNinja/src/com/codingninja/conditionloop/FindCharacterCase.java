package com.codingninja.conditionloop;

import java.util.Scanner;

public class FindCharacterCase {
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 91) {
            System.out.println("1");
        }
        else if(ch >= 97 && ch <= 122) {
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
	}

}

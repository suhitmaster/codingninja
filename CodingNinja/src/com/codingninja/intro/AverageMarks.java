package com.codingninja.intro;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String [] cp) {
	char name = ' ';
    int mark1, mark2, mark3;
    Scanner sc = new Scanner(System.in);
    
    name =   sc.next().charAt(0); 
    
    mark1 = sc.nextInt();
    mark2 = sc.nextInt();
    mark3 = sc.nextInt();
    
    System.out.println(name);
    System.out.println((mark1 + mark2 + mark3) /3);
	}
}

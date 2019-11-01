package com.codingninja.loop;

import java.util.Scanner;

public class NpRimeNumber {
	static boolean isPrime(int n) 
	{ 
	if (n <= 1) 
	    return false; 
	  
	for (int i = 2; i < n; i++) 
	    if (n % i == 0) 
	        return false; 
	  
	return true; 
	} 
	  
	static void printPrime(int n) 
	{ 
	for (int i = 2; i <= n; i++)  
	{ 
	    if (isPrime(i)) 
	        System.out.println(i + " "); 
	} 
	} 

	public static void main(String[] cp) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		printPrime(x);
	}

}

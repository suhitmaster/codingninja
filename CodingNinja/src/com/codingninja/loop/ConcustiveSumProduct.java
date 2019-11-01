package com.codingninja.loop;
import java.util.Scanner;

public class ConcustiveSumProduct {
	public static void main(String [] cp) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		int mul = 1;
		if(y == 1) {
			for(int i = 1; i<=x; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}else if(y == 2) {
			for(int i = 1; i<=x; i++) {
				mul = mul * i;
			}
			System.out.println(mul);
			
		}else {
			System.out.println("-1");
		}
	}
}

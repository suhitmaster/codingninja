package com.codingninja.conditionloop;

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        
        double hra = basic * (20.0 /100.0);
        double da = basic * (50.0 /100.0);
        double pf = basic * (11.0/100.0);
        
        int allow = 0;
        if(grade == 'A') {
            allow = 1700;
        }
        else if(grade == 'B') {
            allow = 1500;
        }
        else {
            allow = 1300;
        }
        
        System.out.println((int)Math.round((basic + hra + da + allow) - pf));
	}

}

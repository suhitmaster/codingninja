package com.codingninja.conditionloop;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
		
        //for(int i=s; i<=e; i=+w) {
        while(s <= e){
            System.out.print(s + "\t");
            System.out.print(((s - 32)*5)/9);
            //System.out.print((i-32)*(0.5556));
            System.out.println();
            s = s + w;
        }
	}

}

package com.codingninja.loop;

/*
 * 
 * You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. 
 * Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., 
 * sn (0 <= i <= n) in such a way that the first part is strictly 
 * decreasing while the second is strictly increasing one.
	That is, in the sequence if numbers are decreasing, they can start 
	increase at one point. And once number starts increasing, they 
	cannot decrease at any point further.
	Sequence made up of only increasing numbers or only decreasing 
	numbers is a valid sequence. So in both the cases, print true.
	You just need to print true/false. No need to split the sequence.
	Input format : 8 7 6 5 10 12
 */

import static java.lang.System.in;

import java.util.Scanner;

public class IsArithmeticProgress {
public static void main(String [] cp) {	Scanner sc = new Scanner(in);
int n = 2;//sc.nextInt();
int [] arr = {5,3, 2};//new int[n];
boolean flag = false;
//for(int i =0 ; i < n; i++) {
//	arr[i] = sc.nextInt();
//}
int diff = 0;
int split = 0;
int i =0;
for(i =0 ; i < (n - 1); i++) {
	diff = arr[i] - arr[i+1]; 
	if(diff <= 0) {
		split = i + 1;
		break;
	}
}
	if(i == (n - 1)) {
        System.out.println("true");
        return;
	}
    if(split == (n - 1)) {
        System.out.println("true");
        return;
    } 

for(int j = split; j < (n - 1); j++) {

	diff = arr[j+1] - arr[j]; 
	if(diff <= 0) {
		flag = true;
		System.out.println("false");
		break;
	}

}
if(!flag) System.out.println("true");

}
}

package com.codingninja.function;

public class FibMember {
	public static boolean checkMember(int n){
		boolean flag = false;
		int firstTerm = 0;
		
		int secondTerm = 1;
		
		int thirdTerm = 0;
		
		while (thirdTerm < n)
		{
			thirdTerm = firstTerm + secondTerm;
			
			firstTerm = secondTerm;
			
			secondTerm = thirdTerm;
		}
		
		if(thirdTerm == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkMember(10);
	}

}

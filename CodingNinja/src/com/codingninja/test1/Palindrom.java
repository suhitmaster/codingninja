package com.codingninja.test1;

import java.util.Scanner;

public class Palindrom {
	public static void main(String [] cp) {
		  int r,sum=0,temp;    
		  int n=454; 
		  
		  temp=n;    

		  while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("true");    
			  else    
			   System.out.println("false");    
			}  
	

}

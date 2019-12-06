package org.cts;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	
    int a=n,j=0,i=0;
    
    while(a>0) {
    	i=a%10;
    	j=(j*10)+i;
    	a=a/10;
    	
    }
    
    System.out.println("The reverse of number n is: "+j);
	if(n==j) {
		System.out.println("Palindrome");
	}
	else
		System.out.println("not a palindrome");
}
}

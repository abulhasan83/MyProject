package org.cts;

import java.util.Scanner;

public class CountN {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=n,i=0,j=0;
	while(a>0) {
		a=a/10;
		++i;
	}
	
	System.out.println("The nummber of digits is  "+i);
			;
}
}

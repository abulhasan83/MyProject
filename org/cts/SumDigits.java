package org.cts;

import java.util.Scanner;

public class SumDigits {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n= s.nextInt();
	int a=n,i=0,j=0;
	while(a>0) {
		i=a%10;
		j=j+i;
		a=a/10;
	}
	
	System.out.println(j);
	
			
}
}

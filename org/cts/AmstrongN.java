package org.cts;

import java.util.Scanner;

public class AmstrongN {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	int a=n,i=0,j=0;
	while(a>0)
	{
		i=a%10;
		j=(i*i*i)+j;
		a=a/10;
	}
	if(j==n) {
	System.out.println(n+"  is an amstrong number");
			
}
	else {
		System.out.println(n+"  is not an amstrong number");
	}
}
}

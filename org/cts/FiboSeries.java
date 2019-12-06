package org.cts;

import java.util.Scanner;

public class FiboSeries {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of fibo:");
	int n = s.nextInt();
	long f=0,f1=0,f2=1;
	System.out.println(f1+ "\n " +f2);
	for(int i=0; i<=n;i++) {
		f=f1+f2;
		System.out.println(f);
		f1=f2;
		f2=f;
	}
	
}
}

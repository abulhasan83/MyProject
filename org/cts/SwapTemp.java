package org.cts;

import java.util.Scanner;

public class SwapTemp {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter two numbers");
	int a = s.nextInt();
	int b = s.nextInt();
	int temp=0;
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping   " + a +"  " + b);
	
}
}

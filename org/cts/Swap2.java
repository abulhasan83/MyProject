package org.cts;

import java.util.Scanner;

public class Swap2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a = s.nextInt();
	int b = s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping:  "+ a + " " + b );
}
}

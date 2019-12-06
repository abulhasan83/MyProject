package org.cts;

import java.util.Scanner;

public class VariablesPro {
static int add(int a,int b) {
	int c = a+b;
	return c;
	
	
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the a and b:");
	int a= s.nextInt();
	int b = s.nextInt();

	System.out.println(add(a,b));
	
	
}



}

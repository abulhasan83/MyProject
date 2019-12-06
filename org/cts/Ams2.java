package org.cts;

import java.util.Scanner;

public class Ams2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	for(int f=0;f<=1000;f++) {
		int a=f,i=0,j=0;
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		
		if(j==f)
		System.out.println(j);
	}
	
}
}

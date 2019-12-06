package org.cts;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String[] args) {
		int count=0;
		for(int n=0;n<=100;n++) {
			int a=n,i=0,j=0;
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(j==n) {
				count++;
				System.out.println(n);
			
			
}
		
	}
		System.out.println(count);s
}
}

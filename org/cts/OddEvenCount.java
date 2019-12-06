package org.cts;

import java.util.Scanner;

public class OddEvenCount {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//System.out.println("Enter ");
	//int n = s.nextInt();
	int i=0,j=0;
	for(int n=0;n<=100;n++)
	if(n%2==0) {
		System.out.println(n);
		i++;
	}
	else
	{
		System.out.println(n);
		j++;
	}

System.out.println("No of Even numbers:  " +i);
System.out.println("No of Odd numbers:" +j);
}
}

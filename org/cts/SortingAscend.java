package org.cts;

import java.util.Scanner;

public class SortingAscend {
public static void main(String[] args) {
	int temp;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of values:");
	int n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Pls enter the values to sort:");
	for(int i=0;i<n;i++) {
		a[i] = s.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println("Ascending Order:");
	for(int l=0;l<n;l++) {
		System.out.println(a[l]);
	}
	
	System.out.println("descending Order:");
	for(int k=n-1;k>0;k--) {
		System.out.println(a[k]);
	}
}
}

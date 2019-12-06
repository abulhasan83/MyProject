package org.cts;

import java.util.Scanner;

public class StringRev {
public static void main(String[] args) {
	Scanner s  =new Scanner(System.in);
	System.out.println("Enter the String");
	String ori = s.nextLine();
	String rev="";
	int length = ori.length();
	for(int i=length-1;i>=0;i--) {
		rev = rev+ori.charAt(i);
	}
	
	System.out.println("String:"+ori + "\n" + "Its reverse is:"+rev);
	
	if(ori.equals(rev))
	{
		System.out.println(ori+"is palindrome");
	}
	else
	{
		System.out.println(ori+ "  is not a palindrome");
	}
}
}

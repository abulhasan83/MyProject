package org.cts;

public class StringArray {
public static void main(String[] args) {
	String s= "AshokKumar";
	String rev = " ";
	char[] ch = s.toCharArray();
	for(int i=ch.length-1;i>4;i--) {
		rev=rev+ch[i];
		
	}
	System.out.println(rev);
}
}

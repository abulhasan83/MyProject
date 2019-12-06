package org.cts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
public static void main(String[] args) {
	Map<Character,Integer> mp = new HashMap<Character,Integer>();
	Scanner s = new Scanner(System.in);
	String ss = s.nextLine();
	char[] charArray = ss.toCharArray();
	
	for(Character c: charArray) {
		if(mp.containsKey(c)) {
			int x=mp.get(c);
			//System.out.println(x);
			mp.put(c, x+1);
		}
		else {
			mp.put(c, 1);
		}
	}
	System.out.println(mp);
}
}

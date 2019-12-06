package org.cts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
	Map<String,Integer>mp = new HashMap<String,Integer>();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String ss = s.nextLine();
	String[] split = ss.split(" ");
	for(String sp:split) {
		if(mp.containsKey(sp)) {
			Integer x = mp.get(sp);
			mp.put(sp, x+1);
		}
		else {
			mp.put(sp, 1);
		}
	}
	System.out.println(mp);
	
}
}

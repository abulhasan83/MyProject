package org.cts;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsPro {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	Set l2 = new HashSet();
	Map<Integer,String> mp = new HashMap<Integer,String>();
	
	ls.add("Abul");
	ls.add("Arul");
	ls.add("Abi");
	ls.add("Amul");
	Iterator<String> i = ls.iterator();
	while(i.hasNext()) {
		String next = i.next();
		System.out.println(next);
	}
	
	l2.addAll(ls);
	Iterator i2 = l2.iterator();
	while(i2.hasNext()) {
		Object nt = i2.next();
		System.out.println(nt);
	}
	
	mp.put(1,"Greens");
	mp.put(2, "Omr");
	mp.put(3, "Adayar");
	mp.put(4,"Veleacherry");
	
	Iterator<Map.Entry<Integer,String>> ie = mp.entrySet().iterator();
	while(ie.hasNext()) {
		     Entry<Integer, String> next = ie.next();
		     System.out.println(next);
		     Integer key = next.getKey();
		     String value = next.getValue();
		     System.out.println("Key=" + key);
		     System.out.println("Values=" + value);
	}
	
	
}
}

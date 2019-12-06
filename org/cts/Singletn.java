package org.cts;

public class Singletn {
	static Singletn e = null;
	private Singletn()
{
	System.out.println("This is default constructor");
}

public static Singletn getInstance()
{
	if(e==null)
	{
		e = new Singletn();
		
		
	}
	System.out.println(e);
	   return e;
}

public void normalMethod()
{
	System.out.println("This is non static method");
	getInstance();
}

public static void main(String[] args) {
	Singletn em = getInstance();
	System.out.println(em);
	e.normalMethod();
}
}

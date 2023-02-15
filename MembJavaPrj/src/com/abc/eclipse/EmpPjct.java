package com.abc.eclipse;

public class EmpPjct extends MemberDEtailsPjct {
	String spec,dept;
	EmpPjct()
	{
	super("ABC","LMN",12,54,500);
	}
	public void display()
	{
		
	System.out.println(name+"\n");
	System.out.println(address+"\n");
	System.out.println(age+"\n");
	System.out.println(phone_number+"\n");
	System.out.println(salary+"\n");
	}
}

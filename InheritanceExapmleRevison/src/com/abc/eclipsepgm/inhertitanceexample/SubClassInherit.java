package com.abc.eclipsepgm.inhertitanceexample;

public class SubClassInherit extends ParentInheritance{
	public void difference()
	{
		int d=a-b;
		System.out.println("Difference="+d);
		System.out.println("a="+super.a);
		super.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassInherit obj=new SubClassInherit();
		obj.difference();
		obj.display();
		
	}

}

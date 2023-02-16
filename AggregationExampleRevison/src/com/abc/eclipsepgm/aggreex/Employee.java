package com.abc.eclipsepgm.aggreex;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display()
	{
		System.out.println("Id="+id);
		System.out.println("name="+name);
		System.out.println("Address="+address);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add=new Address("City","State","Country");
		Employee e=new Employee(111,"abc",add);
		e.display();
		Employee e1=new Employee(01,"emn",add);
		e1.display();
	}

}

package abc.arrexce.eclipsepgm;

import java.util.Scanner;

public class ArrayRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]=new int[5];
		System.out.println("Enter values in to array\n");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println(" values in to array\n");

		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);

		}

	}

}

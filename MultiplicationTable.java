package coreJavaprograms;

import java.util.Scanner;

public class MultiplicationTable {

	
	public static void main (String arguments[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int tables[]=new int[10];
		for(int i=1;i<=10;i++) {
			tables[i-1]= num*i;
		    System.out.println(num+" "+"*"+ " "+i+ " "+"="+" "+tables[i-1]);
		}
		
	}
	
}

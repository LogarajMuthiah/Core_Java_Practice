package coreJavaprograms;

import java.util.Scanner;
public class SumandAverage {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 numbers");
		
		int inputs[]=new int[5];
		int sum=0;
		int average=0;
		for(int i=0;i<inputs.length;i++) {
			inputs[i]=sc.nextInt();
			 sum += inputs[i];
		}
		
		average = sum / inputs.length;
		System.out.println("sum"+" :  "+ sum +"   Average"+"  :  "+average);
	
	}
	
}

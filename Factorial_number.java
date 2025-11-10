package coreJavaprograms;

import java.util.Scanner;
public class Factorial_number {
	
	static int recursivemethod(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*recursivemethod(n-1);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");

		int fac=sc.nextInt();
		
		for(int i=fac-1;i>0;i--) {
			fac=fac*i;
		}
         System.out.println("Factorial number"+ fac);
         
         
         // Recursive method
         int result=recursivemethod(fac);
         
         System.out.println("Factorial numbers usign recursive method   "+fac);
	}

}

package coreJavaprograms;

import java.util.Scanner;

public class Simple_Interest {
	double p;
	int n;
	double r;
	
	Simple_Interest(double principle,int period,double interest){
	   p=principle;
	   n=period;
	   r=interest;
	}

	double interestcalc() {
		return p*n*r/100;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle,period,interest");
		double principle = sc.nextDouble();
		int period=sc.nextInt();
		double interest=sc.nextDouble();
		
		Simple_Interest obj=new Simple_Interest(principle,period,interest);
		double finalinterest=obj.interestcalc();
		double totalpayable=finalinterest+principle;
		
                System.out.println("Final Interest  "+finalinterest);
                System.out.println("Total Payable "+totalpayable);
	}

}

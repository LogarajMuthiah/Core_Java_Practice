package coreJavaprograms;

import java.util.Scanner;

public class AddTwoComplexNumbers {
	
	int real;
	int imag;
	String imagunit;
	
	AddTwoComplexNumbers(String rai){
		rai = rai.replaceAll("\\s+", "");
		
		String[] parts = rai.split("(?=[+-])");
		
		int r= Integer.parseInt(parts[0].trim());
		String i= parts[1];
		
		String[] parts2 = i.split("(?<=\\d)(?=\\D)");
		
		int iu= Integer.parseInt(parts2[0].trim());
		
		String imagunit=parts2[1];
		
		this.real=r;
		this.imag=iu;
		this.imagunit= imagunit;
		
	}
	
	
	AddTwoComplexNumbers add(AddTwoComplexNumbers other) {
		int realnumber=this.real+other.real;
		int imagnumber=this.imag+other.imag;
		String result = realnumber+" + "+imagnumber+imagunit;
		return new AddTwoComplexNumbers(result);
		
	}
	
	
	 void display(){
		 String result = real+" + "+imag+"+"+imagunit;
		 
		System.out.println("Addition of real number   "+result);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
	
		
		String realandimag=sc.next();
		String realandimag1=sc.next();
		
		
		
		AddTwoComplexNumbers c1=new AddTwoComplexNumbers(realandimag);
		AddTwoComplexNumbers c2=new AddTwoComplexNumbers(realandimag1);
		
		AddTwoComplexNumbers sum = c1.add(c2);
		sum.display();
		
		
		
	}

}

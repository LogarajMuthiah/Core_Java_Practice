package coreJavaprograms;

import java.util.Scanner;
import java.lang.*;

public class ExceptionHandling {
	
	private int withdrawamt;
	private int balance=5000;
	
	ExceptionHandling(int withdrawamt){
		this.withdrawamt=withdrawamt;
	}
	
	void withdraw() throws Exception{
			
			if(withdrawamt>balance) {
				throw new Exception("Insufficient Balance");
			}else {
				// 5000 - 8000
				balance = balance-withdrawamt;
				System.out.println("Transaction succesfull");
			}
			
	}
	
	int balance() {
		
		return balance;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount");
		int withdrawamount = sc.nextInt();
		
		ExceptionHandling obj=new ExceptionHandling(withdrawamount);
		
		try {
			obj.withdraw();
		}
		catch(Exception e){
			System.out.println("Transaction failured  "+e.getLocalizedMessage());
		}
		finally {
			System.out.println("Clearing logs");
		}
		
		
		int balanceamount= obj.balance();
		System.out.println("balance method - "+balanceamount);

	}

}

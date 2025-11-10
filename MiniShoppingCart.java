package CollectionsFramework;

import java.util.*;

public class MiniShoppingCart {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> cart=new ArrayList<>();
	
	void showoptions() {
		System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. Display all items");
        System.out.println("4. Exit");
	}
	
	int getinput() {
		return sc.nextInt();
	}
	
	String getStringInput() {
		
		return sc.nextLine();
	}
	
	
	void run() {
		
		while(true) {
		 showoptions();
		 
		 System.out.println("Enter the option");
		 
		 int inputfromuser=getinput();
		 sc.nextLine(); 
		 
		if(inputfromuser==4) {
			System.out.println("Thanks for shopping with us");
			break;
		}else if(inputfromuser==1) {
			System.out.println("Enter item to add in the cart");
			String StringInputFromUser=getStringInput();
			cart.add(StringInputFromUser.toUpperCase().trim());
			
		}else if(inputfromuser==2) {
			System.out.println("Enter item to remove in the cart");
			String StringInputFromUser=getStringInput();
			if(StringInputFromUser.isEmpty()||!cart.contains(StringInputFromUser.toUpperCase().trim())) {
				System.out.println("This item is not in the list");
				
			}else {
				System.out.println("remove part working");
				cart.remove(StringInputFromUser.toUpperCase().trim());
			}
			
			
		}else if(inputfromuser==3) {
			
			if(cart.isEmpty()) {
				System.out.println("No items in the cart! You wanna add something?");
			}else {
			for(String cartitems:cart) {
				System.out.println("Items in the cart  "+cartitems);
			}
			}
		}else {
			System.out.println("Please enter the valid input");
		}
		
		
		}	
		
	}
	
	

	public static void main(String[] args) {
		
		MiniShoppingCart obj= new MiniShoppingCart();
		obj.run();
		

	}

}

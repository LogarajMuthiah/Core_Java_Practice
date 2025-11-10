package CollectionsFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		
		
		
	/*	Create an ArrayList of String to store grocery items.

Let the user:

Add an item to the list.

Remove an item by name.

Check if an item is in the list.

See how many items are in the list.

Display all items.

Rules:

Only use add(), remove(), get(), size(), and contains().

No loops or iterators required yet — just test your methods with a few hardcoded examples or simple calls.

⏱ You still have 15 minutes to finish this simplified task!

If you take longer… well, let’s just say the manager won’t be happy 😏.*/
		
		
		ArrayList<String> items=new ArrayList<>();
	
		
		
		items.add("Coconut");
		items.add("Chilli");
		items.add("Tomato");
		
		items.remove("Chilli");
		
		int sizes=items.size();
		System.out.println("There are "+sizes+" items in the list!");
		
		if(items.contains("Tomato")) {
	System.out.println("Tomato is in the list");
		}else {
			System.out.println("Tomato is not in the list");
		}
		
		for(String item:items) {
			System.out.println("Items in the list "+item);
		}
		
		/*Add at least 5 products (like “Rice”, “Oil”, “Sugar”, etc.).

		Remove one product.

		Use contains() to check if a product (“Milk”) is in the list.

		Display the total number of products using size().

		Print all products one by one using get(index).

		Rules:

		Still no iterators.

		Only use: add(), remove(), get(), contains(), size().

		Print meaningful messages for each step — like a mini report. */
		
		
		ArrayList groceries=new ArrayList<>();
		
		groceries.add("Rice");
		groceries.add("oil");
		groceries.add("Sugar");
		groceries.add("Milk");
		groceries.add("Coffee Powder");
		
		groceries.remove("Sugar");
		
		if(groceries.contains("Milk")) {
			System.out.println("Milk is  in the list");
		}else {
			System.out.println("Milk is not in the list");
		}
		
		System.out.println("There are "+groceries.size()+" items in the list!");
		
		for(int i=0;i<groceries.size();i++) {
			System.out.println(i+1+". "+groceries.get(i));
		}
		
		
	}

}

package coreJavaprograms;

public class fibonacci_series {
	
	
	

	public static void main(String[] args) {
		
	     int length=5;
	     
	     int loop[]=new int[length+1];
	     
	     loop[0]=0 ; 
	     loop[1]=1;
	     
	     int sum=loop[0]+loop[1];
	     
	     for (int i=2;i<=length;i++) {
	    	 
	    	 loop[i]=loop[i-1]+loop[i-2];
	    	 sum +=loop[i];
	    	 
	     }
	     
	     for(int j=0;j<=length;j++) {
	    	 System.out.println("Fibonacci series   "+loop[j]);
	     }
	     
	    System.out.println("Sum of fibonacci series  "+sum);


	    // Another method 
	    
	    int first=0;
	    int second=1;
	    
	    int current=0;
	    
	    System.out.print("Fibonacci series by another method "+first+","+second);
	    
	    for(int k=2;k<=length;k++) {
	    	current= first+second;
	    	System.out.print(","+current);
	    	first=second;
	    	second=current;
	    }
	    System.out.println();
	    System.out.println("Sum of fibonacci series by another method  "+sum);
	}

}

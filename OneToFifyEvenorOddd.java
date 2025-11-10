package coreJavaprograms;

public class OneToFifyEvenorOddd {
	
  public static void main (String args[]) {
	  
	  int even[]=new int[25+1];
	  int odd[]=new int[25];
	  int numlength=51;
	  int eindex=0;
	  int oindex=0;
	  
	  for(int i=0;i<numlength;i++) {
		  
		  if(i%2==0) {
			  even[eindex++]=i;
		  }
		  else {
			  odd[oindex++]=i;
		  }
	  }
	  
	  for(int j=0;j<numlength;j++) {
		  if(even[j]!=0) {
			  System.out.println("Even numbers    "+ even[j]);
		  }
	  }
	       for(int j=0;j<numlength;j++) {
		  if(odd[j]!=0) {
			  System.out.println("odd numbers    "+ odd[j]);
		  }
	  }
	  
		  
	 }
}
	  
  


package coreJavaprograms;

public class StringMethods {

	public static void main(String[] args) {
	
		String name="Logaraj";
		String name1="logaraj";
		String lastname="Muthiah";
		String trim="trim   text";
		String substring="Java is Bad";
		String delimiter="java,python,kotlin";
		String email="XXXX@gmail.com";
		String url="http://www.example.com";
		String blank="  ";
		int num=1008;
		
		
		//length()
		
		System.out.println("Length of a string  "+name.length());
		
		//CharAt
		
		System.out.println("CharAt "+name.charAt(2));
		
		//substring
		System.out.println("Substring  "+name.substring(2, 6));
		
		//UpperCase
		System.out.println(name.toUpperCase());
		
		//equals()
		System.out.println("Equals and equalsignorecase  "+ name.equals(name1));
		System.out.println("Equals and equalsignorecase  "+ name.equalsIgnoreCase(name1));
		
		//trim()
		System.out.println("trim "+trim);
		
		//replace
		
		System.out.println("Replace  "+substring.replaceAll("Bad", "awesome"));
		
		//split
		
		String delimit[]=delimiter.split(",");
		for(String d:delimit) {
			System.out.println("delimiter  "+d);
		}
		
		System.out.println("String method# contains   "+ email.contains("@"));
		
		System.out.println("Starts with()"+url.startsWith("http"));
		System.out.println("Ends with()"+url.endsWith(".com"));
		
		System.out.println("index of a  in logaraj   "+name.indexOf("a"));
		System.out.println("Lastindex of a  in logaraj   "+name.lastIndexOf("a"));
		
		System.out.println("Is empty or is blank  "+ blank.isEmpty()+"   Java isblank() is available in java 11+ and after  so mimic it using trim and is empty method   "+blank.trim().isEmpty());
		
         System.out.println(String.join("-", name,name1,lastname));
         
       System.out.println("Converts int to string  "+String.valueOf(num));
         
         
         
	}

}

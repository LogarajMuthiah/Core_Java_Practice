package coreJavaprograms;

public class EmailValidation {

	public static void main(String[] args) {
		
		/*It must contain '@'.

		It must end with ".com".

		It must not start with '@'.

		It must not contain any spaces.
		
		Rules - no regex, library */
		
		
		
		String email = "student.learnjavag@mail.com";
		
		if(email.contains("@")&&email.endsWith(".com")) {
			if(!email.startsWith("@")&&!email.contains(" ")) {
				System.out.println("Account created");
			}else {
				System.out.println("enter a valid email id");
			}
		}
		else {
			System.out.println("enter a valid email id");
		}

		

	}

}

import java.util.Scanner;

public class email_Validation {
	
	static boolean isvalid(String email) {
		
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		
		return email.matches(regex);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String email;
		int x;
		
		for(x = 0; x <= 3; x++) {
			System.out.print("Enter the Email address: ");
			email = sc.next();
			
			System.out.println("\nThe Email address is: " + email);
			System.out.println("\nIs the above Email address valid? " + isvalid(email));
			System.out.println();
			
		}

	}

}

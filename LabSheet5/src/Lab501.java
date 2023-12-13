import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name : ");
		String Fullname= scan.nextLine();
		int countspace=0;
		int space=Fullname.indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {
			String first =Fullname.substring(0,space);
			String last =Fullname.substring(space+1);
			System.out.println("First Name: "+first.toUpperCase());

			System.out.print("Last Name: "+last.toLowerCase());
		}

	}

}

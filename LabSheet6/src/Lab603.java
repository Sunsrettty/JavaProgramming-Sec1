import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please enter your name,separated by a spcae\n:");
		String fullname = scan.nextLine();
		int space=fullname.indexOf(" ");
		String firstName = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+firstName);
	}
	public static String abbreviatName(String fullname) {
		String Nani =" ";
		for(int i=0;i<fullname.length()-1;i++) {
			if(fullname.charAt(i)==' ') {
				Nani = Nani+(fullname.charAt(i+1))+".";
			}
			}
		return Nani;
	}

}

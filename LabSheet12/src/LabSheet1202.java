import java.util.*;
import java.io.*;
public class LabSheet1202 {
 
	public static void main(String[] args) throws IOException {
	Scanner inputEmail = new Scanner(System.in);
	System.out.print("Input Email: ");
	String sectionInput = inputEmail.next();
	boolean Found = false;
	Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
	
	while(readFile.hasNext()){
			readFile.next();
			readFile.next();
			String pass = readFile.next();
			String email = readFile.next();
			
			if(sectionInput.equalsIgnoreCase(email)) {
				System.out.println("Your password is "+pass);
				Found = true;
				break;
			}
		}
	if(Found == false)
		System.out.println("The data not found...");
	 readFile.close();
	}
}
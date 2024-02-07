import java.util.*;
import java.io.*;
public class Example1021 {
   public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname =readFile.next();//read name data to fname variable
			String lname = readFile.next();//readFile.next();
			readFile.next();//read password data
			String email = readFile.next().toUpperCase();//read email data to email variable
			
			System.out.println(fname+" "+"("+email+")");
		}
		readFile.close();
	}

}

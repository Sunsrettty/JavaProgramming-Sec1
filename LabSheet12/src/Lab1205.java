import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int No = 1;
		while(readFile.hasNext()) {
			String id =readFile.next();
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			String grade = readFile.next();
			readFile.next();
			System.out.println(No+".\t"+id+"\t"+Level(id)+"\t"+fname.charAt(0)+"."+lname+"\t"+grade+"\t"+Status(grade));
			No++;
		}
		readFile.close();	
		
		}
	public static String Level(String id) {
		if(id.substring(0,2).equals("19")) {
			return "3th";
		}
		else {
			return "4th";
		}
		
	}
	public static String Status(String grade) {
		double G = Double.parseDouble(grade);
		if(G>2) {
			return "Pass";
		}else if(G>=1) {
			return "Critical";
		}else {
			return "Retired";
		}
	}
	public static void Header() {
		System.out.println("No."+"\tID"+"\t\t"+"Level"+"\t"+"Name"+"\t\tGrade"+"\tStatus");
		System.out.println("*******************************************************************************");
		
	}

}

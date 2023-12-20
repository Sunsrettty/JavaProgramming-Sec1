import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();

	}
	public static void inputEmail() {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		
		boolean chkEmail= checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		
		//JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail );
		
		
		//inputEmail = inputEmail.tolowerCase();
	}
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}//end checkEmail()

public static void displayEmail(boolean chEmail,String inEmail) {
	if(chEmail==true) {
		JOptionPane.showInputDialog("Your e-mail is "+inEmail);
		}else {
			JOptionPane.showInputDialog("Your e-mail is not hotmail or gmail");
		}
}
}



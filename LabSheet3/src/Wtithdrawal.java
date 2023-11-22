import javax.swing.*;
import java.util.Random;
public class Wtithdrawal {

	public static void main(String[] args) {
		//using class Random for random money 
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance: "+balance+"\nInput money to withdraw :"));
		
		
		if(money>balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money>=20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money%100 !=0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+ money+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int thousand = money / 1000;
			int fivehun = money%1000 / 500;
			int hundred = money%1000%500 / 100;
			JOptionPane.showMessageDialog(null, "You withdraw "+ money+" baht."+"\n1000 = "+thousand+"\n500 = "+fivehun+"\n100 = "+hundred);
			
		}
	}

}

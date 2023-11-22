import javax.swing.*; //import library for input data from Dialog Box
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET =299;
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double priceAfterdiscount , totalPrice =0;
		//calculate total price of buffet
		totalPrice = BUFFET*numberofCustomer;
		//using showMessage dialog box for display totalPrice
		//JOptionPane.showConfirmDialog(null, "Amout to be paid is "+totalPrice+" baht.");
		//using Confirm dialog box
		int memberCard;
		do {
			memberCard=JOptionPane.showConfirmDialog(null, "Total price is "+totalPrice+ " baht."+"\nDo you have a member card?");
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		if(memberCard==JOptionPane.YES_OPTION) {
		//discount = totalPrice*90/100;
		priceAfterdiscount = totalPrice * 90 / 100;
			JOptionPane.showInputDialog(null,"Amout to be paid is "+priceAfterdiscount+"baht.");

	} //end of if 
		else if (memberCard==JOptionPane.NO_OPTION) {
			JOptionPane.showInputDialog(null,"Amout to be paid is "+totalPrice+"baht.");
		}
	}
}

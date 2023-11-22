import java.text.*;
import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String productName =input.nextLine() ;
		System.out.print("Input product unit   : ");
		int productUnit =input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.print("--------------------------------------------------");
		float totalPrice = productUnit*priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+"baht.");
		System.out.print("--------------------------------------------------");
		System.out.print("Input product name   : ");
		double dis =input.nextLine() ;

	}

}

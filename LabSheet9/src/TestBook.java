import java.util.*;

public class TestBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Input book title: ");
		String title = scan.nextLine();
		System.out.print("Input book price: ");
		float price = scan.nextFloat();
		System.out.print("Input publish year: ");
		int publishyear = scan.nextInt();
		
		Book Banana = new Book();
		Banana.setTitle(title);
		Banana.setPrice(price);
		Banana.setpublishyear(publishyear);
		System.out.print(Banana.toString());

	}

}

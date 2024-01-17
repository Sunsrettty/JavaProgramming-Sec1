import java.util.Scanner;

public class TestAuthor {

	public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.print("Input author name   : ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail : ");
			String email = scan.next();
			System.out.print("Input auhor gender  : ");
			char gender = scan.next().charAt(0);
			
			Author Pendragon = new Author(name,email,gender);
			System.out.print(Pendragon);
			

	}

}

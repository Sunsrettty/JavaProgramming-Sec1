import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb =new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {	
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 baht money : "+34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 baht money : "+13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addFive(100);*/
		inputCoin();

	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Money Total : "+pb.getPiggyBank());
		MainMenu();
	}
	public static void MainMenu() {
		while(true) {
			System.out.println("=========================");
			System.out.println("Menu of Piggy Bank");
			System.out.println("=========================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit.");
			System.out.println("=========================");
			System.out.print("Please Select Menu[1-5] : ");
			int Menu = scan.nextInt();
			if(Menu ==1) {
				System.out.print("Insert 1 Baht Money: ");
				int Total =scan.nextInt();
				pb.addOne(Total);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(Menu == 2) {
				System.out.print("Insert 2 Baht Money: ");
				int Total =scan.nextInt();
				pb.addTwo(Total);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(Menu ==3) {
				System.out.print("Insert 5 Baht Money: ");
				int Total =scan.nextInt();
				pb.addFive(Total);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(Menu==4) {
				System.out.print("Insert 10 Baht Money: ");
				int Total =scan.nextInt();
				pb.addTen(Total);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else {
				System.out.print("Bye Bye");
				break;
			}
			
		}
	}

}

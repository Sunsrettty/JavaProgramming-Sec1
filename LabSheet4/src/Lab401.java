import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int xNum,yNum;
		System.out.print("Input value of X : ");
		xNum=scan.nextInt();
		System.out.print("Input value of Y : ");
		yNum=scan.nextInt();
		while(true) {
			if(yNum<xNum) {
				System.out.print("input value of Y, again : ");
				yNum=scan.nextInt();
			}
			else {
				break;
			}
			
			}
		for(int i = xNum+1; i <= yNum; i++) {
				System.out.println(xNum + "+"+ i +"=" + (xNum+=i));
		}

	}

}

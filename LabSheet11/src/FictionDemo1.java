import javax.swing.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		String bookName = JOptionPane.showInputDialog("Input Bookname:");
		int publicYear = Integer.parseInt(JOptionPane.showInputDialog("Input PublicYear:"));
		FictionBook book = new FictionBook(bookName,publicYear);
		String authorName = JOptionPane.showInputDialog("Input Author-Name:");
		String authoremail = JOptionPane.showInputDialog("Input Author-Email:");
		book.setAuthorName(authorName);
		book.setEmail(authoremail);
		while(!book.checkFormatName()) {
			authorName = JOptionPane.showInputDialog("Input Author-Name:");
			book.setAuthorName(authorName);
		}
		while(!book.checkEmail()) {
			authoremail = JOptionPane.showInputDialog("Input Author-Email:");
			book.setEmail(authoremail);
		}
		JOptionPane.showMessageDialog(null, book.toString());

	}

}
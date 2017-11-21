package extra;

import javax.swing.JOptionPane;

public class ThankfulFor {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("what are you thankful for?");
		String b = JOptionPane.showInputDialog("what are you thankful for?");
		String c = JOptionPane.showInputDialog("what are you thankful for?");
		String d = JOptionPane.showInputDialog("what are you thankful for?");
		String e = JOptionPane.showInputDialog("what are you thankful for?");
		JOptionPane.showMessageDialog(null, " you are thankful for\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
	}
}

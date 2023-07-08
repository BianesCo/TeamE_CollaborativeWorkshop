package interfaces;

import javax.swing.JOptionPane;
public class Spaces {

	public static void main(String[] args) {
		
		String text=JOptionPane.showInputDialog("Enter a text string");
		text = text.replaceAll(" ", "");
		JOptionPane.showMessageDialog(null, text);

	}

}

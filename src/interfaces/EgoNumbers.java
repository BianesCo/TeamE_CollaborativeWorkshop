package interfaces;

import javax.swing.JOptionPane;

import logic.methods;

public class EgoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateNumber();
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
		JOptionPane.showMessageDialog(null,"----- ERROR -----");
		}		
		

	}

	private static void validateNumber() {
		// TODO Auto-generated method stub}
		String number = JOptionPane.showInputDialog(" Enter Number");
		JOptionPane.showMessageDialog(null,"the number "+number+" is " + methods.egotistical(number));
		
		
		
	}

}

package interfaces;

import javax.swing.JOptionPane;


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
		JOptionPane.showMessageDialog(null,"the number " + number +" is " + egotistical(number));
			
	}
	  public static boolean egotistical(String num) {
			int addition = 0;
			int n = Integer.parseInt(num);
			for (int i = 0; i < num.length(); i++) {
				int base = Character.getNumericValue(num.charAt(i));
				double exponent = Math.pow(base,num.length());
				
				addition += exponent;
			}
			if (addition == n) {
				return true;
			}else {
				return false;
			}
		}

		
		
	}


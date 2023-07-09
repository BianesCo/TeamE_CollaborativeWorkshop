package main;

import javax.swing.JOptionPane;

import interfaces.CousinsFactors;
import interfaces.Dates;
import interfaces.EgoNumbers;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mainMenu();
			
		} catch (NullPointerException e) {
			e.getMessage();
		}

	}

	private static void mainMenu() {
		String menu = " ------- MAIN MENU ------ \n\n" +
	     "1. ROMAN NUMERALS \n"+
		 "2. PRIME FACTORS \n"+
	     "3. DELETE SPACES \n"+
		 "4. EGOTISTICAL NUMBERS \n"+
	     "5. MAGIC NUMBERS \n"+
		 "6. DATES \n"+
	     "Y. EXIT THE PROGRAM \n"+
		 "-- WRITE YOUR CHOICE -- \n";
	char option = 0;
	do {
		option = Character.toUpperCase(JOptionPane.showInputDialog(menu).charAt(0));
		 switch (option) {
		case '1': 
			break;
		case '2':
			try {
			       cousinsFact();
			       
				  } catch (NumberFormatException e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"----- ERROR -----");
				  }
			break;
		case '3':
			break;
		case '4':
			try {
				validateNumber();
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
			JOptionPane.showMessageDialog(null,"----- ERROR -----");
			}	
			
			break;
		case '5':
			break;
		case '6':
			try {
				validateDate();
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null,"----- ERROR -----");
			}
			break;
		case 'Y':
		}
	} while (true);
		
	}

	private static void validateDate() {
		// TODO Auto-generated method stub
		try {
			String data = JOptionPane.showInputDialog("Enter date in dd/mm/aaaa format ");
			JOptionPane.showMessageDialog(null, Dates.dates(data));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"----- ERROR -----");
		}
		

	}

	private static void validateNumber() {
		// TODO Auto-generated method stub}
				String number = JOptionPane.showInputDialog(" Enter Number");
				JOptionPane.showMessageDialog(null,"the number " + number +" is " + EgoNumbers.egotistical(number));
		
	}

	private static void cousinsFact() {
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog(" Enter Number");
		int num = Integer.parseInt(number);
		if (num>1) {
			if (num>1 && num<4) {
				JOptionPane.showMessageDialog(null,number + "=" + number );
			}
			JOptionPane.showMessageDialog(null,number + "=" + CousinsFactors.decomposeCoisins(num) );
			
		}else {
			JOptionPane.showMessageDialog(null, " --- ERROR---");
		}
		
		
	}

}

package main;

import javax.swing.JOptionPane;

import interfaces.CousinsFactors;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainMenu();

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
			break;
		case '5':
			break;
		case '6':
			break;
		case 'Y':
		}
	} while (true);
		
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

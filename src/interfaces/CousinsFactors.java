package interfaces;

import javax.swing.JOptionPane;

public class CousinsFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
	       cousinsFact();
	       
		  } catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"----- ERROR -----");
		  }
		
		
	}

	private static void cousinsFact() {
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog(" Enter Number");
		int num = Integer.parseInt(number);
		if (num>1) {
			if (num>1 && num<4) {
				JOptionPane.showMessageDialog(null,number + "=" + number );
			}
			JOptionPane.showMessageDialog(null,number + "=" + decomposeCoisins(num) );
			
		}else {
			JOptionPane.showMessageDialog(null, " --- ERROR---");
		}
		
	}

	private static String decomposeCoisins(int number) {
		StringBuilder exponent = new StringBuilder();
		
		for (int factors = 2; factors <=number; factors++) {
			int numPotency=0;
			while (number % factors == 0) {
				numPotency ++;
				number /= factors;
			}

				if (numPotency > 0) {
					exponent.append(factors);
					if (numPotency > 1) {
						exponent.append("^").append(numPotency);
					}
				exponent.append(" * ");	
				}
	
		
			
		}
		if (exponent.length()>0) {
			exponent.delete(exponent.length()-3,exponent.length());
		}
		return exponent.toString();

	}
}
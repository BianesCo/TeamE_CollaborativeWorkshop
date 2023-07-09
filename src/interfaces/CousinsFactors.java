package interfaces;


public class CousinsFactors {

	public static String decomposeCoisins(int number) {
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
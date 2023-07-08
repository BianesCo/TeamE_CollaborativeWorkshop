package logic;

public class methods {
	
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

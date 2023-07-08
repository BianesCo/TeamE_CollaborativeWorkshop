package interfaces;

import java.util.*;
import javax.swing.JOptionPane;
public class RomanNum {

	public static void main(String[] args) {
		
		String ro=JOptionPane.showInputDialog("Enter a roman number");
		int a= romanToInt(ro);
		JOptionPane.showMessageDialog(null, ro+" = "+a);
		
	}
	
	public static int romanToInt(String s) {
		
		int res=0;
		int length=s.length();
		
		Map<Character,Integer> romanM = getRomanMap();
		for (int i = 0; i < length -1; i++ ) {
			
			int currentV = romanM.get(s.charAt(i));
			
			if(currentV < romanM.get(s.charAt(i+1))) {
				res-=currentV;
			}else {
				res+=currentV;
			}
		}
		
		return res+romanM.get(s.charAt(length-1));
	}
	
	public static Map<Character,Integer> getRomanMap(){
		
		Map<Character,Integer> roman =new HashMap<Character,Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		return roman;
	}
}

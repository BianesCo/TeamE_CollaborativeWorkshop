package interfaces;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class MagicNum {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a numer"));
        boolean isMagic = n(number);
        JOptionPane.showMessageDialog(null, isMagic); 
    }
    
    public static boolean n(int number) {
        String num= Integer.toString(number);
        
        StringBuilder inv = new StringBuilder(num);
        inv.reverse();
        
        char[] des = num.toCharArray();
        Arrays.sort(des);
        StringBuilder desord= new StringBuilder();
        for (int i = des.length - 1; i >= 0; i--) {
            desord.append(des[i]);
        }
        
        char[] asc = num.toCharArray();
        Arrays.sort(asc);
        
        int result = Integer.parseInt(inv.toString()) - Integer.parseInt(new String(desord));
        
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
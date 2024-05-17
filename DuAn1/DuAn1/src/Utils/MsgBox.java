
package Utils;

import java.awt.Component;
import javax.swing.JOptionPane;


public class MsgBox {
    public static void alert(Component comp, String message)
    {
        JOptionPane.showMessageDialog(comp, message, 
                "Cửa hàng YumFood", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component comp, String message)
    {
        int result = JOptionPane.showConfirmDialog(comp, message, "Cửa hàng YumFood", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component comp, String message)
    {
        return JOptionPane.showInputDialog(comp, message, 
                "Cửa hàng YumFood", JOptionPane.INFORMATION_MESSAGE);
    }
}

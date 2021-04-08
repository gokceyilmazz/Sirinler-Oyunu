
package sirinleroyun;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gökçe Yılmaz
 */
public class OyunEkrani extends JFrame{
    
    public OyunEkrani(String title) throws HeadlessException {
    super(title);
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        OyunEkrani ekran = new OyunEkrani("Şirinler Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false);
        
        ekran.setSize(1000, 1000);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        
        oyun.addKeyListener(oyun);
        
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        ekran.add(oyun);
        
        ekran.setVisible(true);
    }
    
    
}

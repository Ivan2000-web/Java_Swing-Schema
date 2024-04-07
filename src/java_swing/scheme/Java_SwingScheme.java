package java_swing.scheme;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Java_SwingScheme {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel()); //изменяем внешний вид для внутренних компонентов контейнера
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Java_SwingScheme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame.setDefaultLookAndFeelDecorated(true); //изменяем внешний вид для внеших компонентов относительно контейнера
        
        MyJButton button1 = new MyJButton("Button");
    
        MyJPanel panel = new MyJPanel("Panel", button1);
        
        MyJFrame frame = new MyJFrame("Frame", 400, 400, new BorderLayout(), panel);
    }
    
}


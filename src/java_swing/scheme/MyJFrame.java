package java_swing.scheme;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    
    public MyJFrame(String title, int width, int height, LayoutManager layout, Component comp) {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle(title);
        super.setSize(width, height);
        if (layout instanceof BorderLayout) {
            this.getContentPane().add(comp, BorderLayout.SOUTH);
        } else {
            this.getContentPane().add(comp);
        }
        super.setVisible(true);
    }

}

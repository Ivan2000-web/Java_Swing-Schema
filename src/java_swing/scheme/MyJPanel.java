package java_swing.scheme;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{

    public MyJPanel(String name, Component comp) {
        super.setBorder(BorderFactory.createLineBorder(Color.black));
        super.add(comp);
    }

    }

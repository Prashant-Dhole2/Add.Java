/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
public class JToolTip_ex {
    public static void main(String args[])
    {
        JFrame f=new JFrame("JToolTip Example");
        JTextField tf=new JTextField();
        tf.setBounds(100,100,100,30);
        tf.setToolTipText("Min Password is 8 Char");
        JLabel lb=new JLabel("Password");
        lb.setBounds(20,100,80,30);
        
        f.add(tf);
        f.add(lb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

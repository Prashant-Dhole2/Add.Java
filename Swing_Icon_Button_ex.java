/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.awt.*;
import javax.swing.*;
public class Swing_Icon_Button_ex {
    public static void main(String args[])
    {
        JFrame .setDefaultLookAndFeelDecorated(true);
        JFrame f=new JFrame("JButton with Icon");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(2,1));
        
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        
        ImageIcon icon=new ImageIcon("C:\\Users\\Dell\\Downloads\\icons8-lock-24.PNG");
        JButton b1=new JButton("Adv java",icon);
        b1.setVerticalTextPosition(JButton.TOP);
        b1.setHorizontalTextPosition(JButton.CENTER);
        
        
        panel.add(b1);
        f.add(panel);
        f.setVisible(true);
    }
}

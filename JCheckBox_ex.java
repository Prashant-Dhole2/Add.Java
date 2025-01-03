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
public class JCheckBox_ex {
    public static void main(String args[])
    {
        JFrame f=new JFrame("JCheckBox Example");
        JCheckBox ch1=new JCheckBox("india");
        JCheckBox ch2=new JCheckBox("England");
        ch1.setBounds(50,50,100,50);
        ch2.setBounds(50,100,100,50);
        f.add(ch1);
        f.add(ch2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}

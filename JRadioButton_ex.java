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
public class JRadioButton_ex {
    public static void main(String args[])
    {
        JFrame f=new JFrame("JRadioButton Example");
        JRadioButton rb1=new JRadioButton("Marathi");
        JRadioButton rb2=new JRadioButton("English",true);
        JRadioButton rb3=new JRadioButton("Hindi");
        
        rb1.setBounds(50,100,100,30);
        rb2.setBounds(50,150,100,30);
        rb3.setBounds(50,200,100,30);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

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
import java.awt.event.*;
import javax.swing.*;
public class JCheckBox_book  implements ActionListener{
    JCheckBox ch1,ch2,ch3,ch4;
    JButton b;
    JTextField tf;
    public void JCheckBox_book()
    {
        JFrame f=new JFrame();
        f.setLayout(new FlowLayout());
        ch1=new JCheckBox("Music");
        f.add(ch1);
        
        ch2=new JCheckBox("Sport");
        f.add(ch2);
        ch3=new JCheckBox("Entertainment");
     
        f.add(ch3);
        
        ch4=new JCheckBox("News");
        f.add(ch4);
        tf=new JTextField(15);
        f.add(tf);
        
        b=new JButton("Frist");
        
        b.addActionListener(this);
        f.add(b);
        
        f.setSize(300,300);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String str="";
        if(ch1.isSelected());
        str=str+"Music";
       
        
        if(ch2.isSelected())
        
            str=str+"Sport";
            
       
        if(ch3.isSelected())
        
           str=str+"Entertainment"; 
        
        if(ch4.isSelected())
        
            str=str+"News";
        
        tf.setText(str);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        JCheckBox cb=(JCheckBox)ie.getItem();
        tf.setText(cb.getText());
    }
    public static void main (String args[])
    {
        JCheckBox_book ck=new JCheckBox_book();
    }
    
}

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
import java.awt.event.*;
public class JTextField_Book extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField tf;
    JTextField_Book()
    {
        b1=new JButton("Frist");
        b1.setBounds(50,50,100,30);
        b2=new JButton("Second");
        b2.setBounds(200,50,100,30);
        tf=new JTextField();
        tf.setBounds(90,100,200,30);
        
        add(b1);
        add(b2);
        add(tf);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        setSize(400,400);
        setTitle("JTextField Example");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            tf.setText("Frist Button is Clicked");
        }
        else
        {
            tf.setText("Second Button is Clicked");
        }
    }
    public static void main(String args[])
    {
        JTextField_Book tx=new JTextField_Book();
    }
}

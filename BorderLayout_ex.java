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
public class BorderLayout_ex {
    public static void main(String args[])
    {
         JFrame f=new JFrame("Border Latout Example");
         JButton b1=new JButton("NORTH");
         JButton b2=new JButton("SOUTH");
         JButton b3=new JButton("EAST");
         JButton b4=new JButton("WEST");
         JButton b5=new JButton("CENTER");
         
        // f.setLayout(new BorderLayout(20,15));
         f.add(b1,BorderLayout.NORTH);
         f.add(b2,BorderLayout.SOUTH);
         f.add(b3,BorderLayout.EAST);
         f.add(b4,BorderLayout.WEST);
         f.add(b5,BorderLayout.CENTER);
         
         f.setSize(300,300);
         f.setVisible(true);
    }
}

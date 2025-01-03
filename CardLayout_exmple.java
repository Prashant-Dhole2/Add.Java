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
public class CardLayout_exmple extends JFrame implements ActionListener{
    CardLayout crd=new CardLayout();
    Container cPane =getContentPane();
     CardLayout_exmple()
    {
        
        
        cPane.setLayout(crd);
        JButton btn1 =new JButton("Apple");
        JButton btn2 =new JButton("Boy");
        JButton btn3 =new JButton("Cat");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
         cPane.add("a",btn1);
         cPane.add("b",btn2);
         cPane.add("c",btn3);
        
    }
     public void  actionPerformed(ActionEvent e)
     {
         crd.next(cPane);
     }
     public static  void main(String args[])
     {
         CardLayout_exmple cd=new CardLayout_exmple();
         cd.setSize(300,300);
         cd.setVisible(true);
         cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}

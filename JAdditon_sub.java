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
public class JAdditon_sub extends JFrame implements ActionListener{
  JButton b1,b2;
  JTextField tx1,tx2;
  JLabel l1,l2,l3;
 
 JAdditon_sub()
  {
      b1=new JButton("Addtion");
      b2=new JButton("Substraction");
      tx1=new JTextField(20);
      tx2=new JTextField(20);
      l1=new JLabel("Frist Number");
      l2=new JLabel("Second Number");
      l3=new JLabel(" ");
      setLayout(new FlowLayout());
      setSize(300,300);
      add(l1);
      add(tx1);
      add(l2);
      add(tx2);
      add(l3);
      add(b1);
      add(b2);
     
     
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
      
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e)
  {
       int n1,n2,r;
      n1= Integer.parseInt(tx1.getText());
      n2=Integer.parseInt(tx2.getText());
      
      if(e.getSource()==b1)
      {
          r=n1+n2;
          l3.setText(""+r);
      }
      else
      {
          r=n1-n2;
          l3.setText(""+r);
      }
  }
  public static void main(String args[])
  {
      JAdditon_sub as=new JAdditon_sub();
  }

   
}

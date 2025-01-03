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
import java.awt.event.*;
public class JCombox_ex_Book {
    String city[]={"Pune","Mumnbai","DELHI","Nashik"};
    public JCombox_ex_Book()
    {
        JFrame f=new JFrame("JComboBox example");
        JComboBox cb=new JComboBox(city);
        cb.setBounds(50,50,100,30);
        f.add(cb);
       f. setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(300,300);
       f.setVisible(true);
        
    }
    public  static void main(String args[])
    {
        JCombox_ex_Book jb=new JCombox_ex_Book();
    }
}

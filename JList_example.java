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
public class JList_example {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        DefaultListModel<String> lm=new DefaultListModel<>();
        lm.addElement("Item 1");
        lm.addElement("Item 2");
        lm.addElement("Item 3");
        lm.addElement("Item 4");
        lm.addElement("Item 5");
        
        JList<String> list = new JList<>(lm);
        list.setBounds(50,100,100,200);
        f.add(list);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

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
public class JTextArea_ex {
    JTextArea_ex()
    {
        JFrame f=new JFrame("JTextArea Example");
        JTextArea ta=new JTextArea("Welcome To GBTech");
        ta.setBounds(50,100,200,200);
        f.add(ta);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        JTextArea_ex t=new JTextArea_ex();
    }
}

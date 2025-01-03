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
public class JList_example_book {
    String city[]={"Pune","Mumbai","Delhi","Nashik"};
    public JList_example_book()
    {
        JFrame f=new JFrame("JList Example");
        JList lt=new JList(city);
        
        f.add(lt);
        f.setSize(400,400);
        
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    public static void main(String args[])
    {
        JList_example_book jl=new JList_example_book();
    }
}

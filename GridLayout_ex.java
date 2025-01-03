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
public class GridLayout_ex {
    public static void main(String args[])
    {
        JFrame obj=new JFrame();
        
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");
        JButton b7=new JButton("Button 7");
        JButton b8=new JButton("Button 8");
        JButton b9=new JButton("Button 9");
        
        obj.add(b1);
        obj.add(b2);
        obj.add(b3);
        obj.add(b4);
        obj.add(b5);
        obj.add(b6);
        obj.add(b7);
        obj.add(b8);
        obj.add(b9);
        
        obj.setLayout(new GridLayout(3,3,10,10));
        obj.setSize(600,600);
        obj.setVisible(true);
        
        
    }
}

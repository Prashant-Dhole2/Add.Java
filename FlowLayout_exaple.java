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
public class FlowLayout_exaple {
    public static void main(String args[])
    {
        JFrame obj=new JFrame();
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton b10=new JButton("10");
        
        obj.add(b1);
        obj.add(b2);
        obj.add(b3);
        obj.add(b4);
        obj.add(b5);
        obj.add(b6);
        obj.add(b7);
        obj.add(b8);
        obj.add(b9);
        obj.add(b10);
        
        obj.setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));
        obj.setSize(400,400);
        obj.setVisible(true);
        
        
    }
}

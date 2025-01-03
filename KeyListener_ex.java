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
public class KeyListener_ex  extends Frame implements KeyListener{
    
    Label l;
    TextArea area;
    KeyListener_ex()
    {
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        l.setText("Key Relessed");
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Typed");
    }
    public static void main(String args[])
    {
        new KeyListener_ex();
    }
}

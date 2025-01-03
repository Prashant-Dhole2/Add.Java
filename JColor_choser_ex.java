/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JColor_choser_ex extends JFrame implements ActionListener {
    JButton b;
    Container c;
    JColor_choser_ex()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("color");
        b.addActionListener(this);
        c.add(b);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        Color initialColor=Color.RED;
        Color color=JColorChooser.showDialog(this,"Select a Color", initialColor);
        c.setBackground(color);
    }
    public static void main(String args[])
    {
        JColor_choser_ex obj=new JColor_choser_ex();
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}

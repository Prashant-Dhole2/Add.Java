/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class Jcomponent_ex extends JComponent{
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(50,30,150,150);
    }
    public static void main(String args[])
    {
        Jcomponent_ex el=new Jcomponent_ex();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame=new JFrame("Jcomponents Example");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(el);
        frame.setVisible(true);
    }
}

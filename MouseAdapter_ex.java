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
public class MouseAdapter_ex extends MouseAdapter{
    Frame f;
    
    MouseAdapter_ex()
    {
        f=new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
        
    }
    public static void main(String args[])
    {
        new MouseAdapter_ex();
    }
}

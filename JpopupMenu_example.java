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
import javax.swing.*;
public class JpopupMenu_example {
    public static void main(String args[])
    {
        final JFrame f=new JFrame("JPopupMenu Example");
        final JPopupMenu popupmenu=new JPopupMenu("Edit");
        
        JMenuItem cut=new JMenuItem("cut");
        JMenuItem copy=new JMenuItem("copy");
        JMenuItem paste=new JMenuItem("Paste");
        
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                popupmenu.show(f,e.getX(),e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

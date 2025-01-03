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
public class WindowEvent_ex extends Frame implements WindowListener {
    WindowEvent_ex()
    {
        addWindowListener(this);
        //setting the size,layout and visibility of frame
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new WindowEvent_ex();
    }
    public void windowActivated(WindowEvent arg0)
    {
        System.out.println("Window Activated");
    }
     public void windowClosed(WindowEvent arg0)
    {
        System.out.println("Window Closed");
    }
     public void windowClosing(WindowEvent arg0)
    {
        System.out.println("Window Closing");
        dispose();
    }
      public void windowDeactivated(WindowEvent arg0)
    {
        System.out.println("Window Deactivated");
    }
       public void windowOpened(WindowEvent arg0)
    {
        System.out.println("Window Opened");
    }
        public void windowDeiconified(WindowEvent arg0)
    {
        System.out.println("Window Deiconified");
    }
         public void windowIconified(WindowEvent arg0)
    {
        System.out.println("Window Iconified");
    }
   
    
}

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
public class Component_event_ex {
    public static void main(String args[])
    {
        Frame f=new Frame("Component example");
        TextArea tx=new TextArea();
        Checkbox cb1=new Checkbox("ck 1");
        Checkbox cb2=new Checkbox("ck 2");
        Panel p=new Panel();
        p.add(cb1);
        p.add(cb2);
        f.add(tx,BorderLayout.CENTER);
        f.add(cb1,BorderLayout.NORTH);
        f.add(cb2,BorderLayout.SOUTH);
        f.setVisible(true);
        ComponentListener compolistener=new MyComponentListener();
        f.addComponentListener(compolistener);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
class MyComponentListener implements ComponentListener{
    public void componentShown(ComponentEvent evt)
    {
        System.out.println("component show ");
    }
    public void componentHidden(ComponentEvent evt)
    {
        System.out.println("component Hidden ");
    }
    public void componentMoved(ComponentEvent evt)
    {
        System.out.println("component Moved ");
    }
    public void componentResized(ComponentEvent evt)
    {
        System.out.println("component Resized");
    }
    
}


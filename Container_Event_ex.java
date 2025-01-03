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
public class Container_Event_ex {
    public static void main(String args[])
    {
        JFrame f=new JFrame("Container Example");
        Container cPane=f.getContentPane();
        ContainerListener containerlistener=new ContainerListener()
                {
                    ActionListener actionlistener=new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent event)
                        {
                            System.out.println("Select : "+event.getActionCommand());
                        }
                    };
                    @Override
                    public void componentAdded(ContainerEvent event)
                    {
                        Component compChild =event.getChild();
                        if(compChild instanceof JButton)
                        {
                            JButton jButton=(JButton) compChild;
                            jButton.addActionListener(actionlistener);
                        }
                    }
                    @Override
                      public void componentRemoved(ContainerEvent event)
                         {
                               Component compChild =event.getChild();
                        if(compChild instanceof JButton)
                        {
                            JButton jButton=(JButton) compChild;
                            jButton.addActionListener(actionlistener);
                        }
  
                            }
                };
                    cPane.addContainerListener(containerlistener);
                    cPane.setLayout(new GridLayout(3,2));
                    cPane.add(new JButton("Frist"));
                    cPane.add(new JButton("Second"));
                    cPane.add(new JButton("Third"));
                    cPane.add(new JButton("Fourth"));
                    cPane.add(new JButton("Fifth"));
                    f.setSize(400,400);
                    f.setVisible(true);
                
                
    }
}

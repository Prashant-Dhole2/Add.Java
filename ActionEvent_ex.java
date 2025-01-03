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
public class ActionEvent_ex  {
    public static void main(String args[])
    {
        Frame f=new Frame("ActionListener Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50,150,20);
        Button b=new Button("Click me");
        b.setBounds(30,100,60,30);
        
        b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
    {
        tf.setText("This is Adv Java");
    }
                });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}

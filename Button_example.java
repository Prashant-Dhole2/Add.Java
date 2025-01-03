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
public class Button_example {
    public static void main(String args[])
    {
        Frame f=new Frame("Button Example");
        Button b=new Button("Update");
        Button b2=new Button();
        b.setBounds(50,100,80,30);
        b2.setBounds(50,150,80,30);
        b2.setLabel(b.getLabel());
        b.setLabel("Save");
        
        b.setEnabled(true);
        f.add(b);
        f.add(b2);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
        
        
    }
}

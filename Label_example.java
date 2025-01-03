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
public class Label_example {
    public static void main(String args[])
    {
        Frame f= new Frame("Label Frame Demo");
        Label l1,l2;
        l1=new Label("Frist Label Text",Label.RIGHT);
        l2=new Label("Second Label Text",Label.CENTER);
        
        l1.setBounds(20,100,200,30);
        l2.setBounds(20,150,200,30); 
        
        f.add(l1);
        f.add(l2);
        
         f.setSize(400,400);
         f.setLayout(null);
         f.setVisible(true);
         
    }
}

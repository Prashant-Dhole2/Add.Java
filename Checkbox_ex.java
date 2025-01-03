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
public class Checkbox_ex {
    public static void main(String args[])
    {
        Frame f=new Frame("Checkbox Example");
        Checkbox cb2=new Checkbox("Hindi",true);
        cb2.setBounds(100,100,50,50);
        Checkbox cb3=new Checkbox("Marathi");
        cb3.setBounds(100,150,70,50);
        Checkbox cb4 =new Checkbox("English");
        cb4.setBounds(100,200,70,50);
        
        
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
}
}

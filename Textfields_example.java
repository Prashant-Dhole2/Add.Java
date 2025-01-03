/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.awt.*;
public class Textfields_example  {
    public static void main(String args[])
    {
        Frame f=new Frame("TextField Example");
        TextField t1=new TextField("Demo text");
        t1.setBounds(50,100,80,30);
        
        f.add(t1);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

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
public class Awt_exampale extends Frame{
    Awt_exampale()
    {
        Button b=new Button("Click me");
        b.setBounds(100,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is AWT Exampale");
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String args[])
    {
        Awt_exampale ae=new Awt_exampale();
    }
    
}

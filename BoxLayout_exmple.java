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
import javax.swing.*;
public class BoxLayout_exmple extends Frame{
    public BoxLayout_exmple()
    {
                Button b[]=new Button[5];
        
        for(int i=0;i<5;i++)
        {
            b[i]=new Button("Button"+(i));
            add(b[i]);
        }
        
        setTitle("Box Layout Exapmle");
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String args[])
    {
        BoxLayout_exmple z=new BoxLayout_exmple();
    }
}

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
public class TextArea_ex {
    public static void main(String args[])
    {
        Frame f=new Frame();
        TextArea tx=new TextArea("Write here");
        tx.setColumns(5);
        tx.setRows(10);
        tx.setBounds(50,100,200,200);
        
        f.add(tx);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

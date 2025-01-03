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
public class TextEvent_ex {
    public static void main(String args[])
    {
        Frame f=new Frame();
        TextField txf=new TextField();
        f.add(txf,BorderLayout.NORTH);
        f.pack();
        f.setVisible(true);
        txf.addTextListener(new MyTextListener("Text Field"));
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }
}
class MyTextListener implements TextListener{
    String preface;
    public MyTextListener(String source)
    {
        preface=source+"text value changed.\n"+" Frist 10 charactercs: \"";
    }
    public void textValueChanged(TextEvent e)
    {
        TextComponent tc=(TextComponent) e.getSource();
        System.out.println("Tyaped value in TextComponent "+ tc.getText());
    }
}

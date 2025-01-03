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
public class Dilaog_Boxes_ex {
    public static Dialog d ;
    public static void main(String args[])
    {
        Frame f=new Frame();
        d=new Dialog(f,"Dialog Examaple",true);
        d.setLayout(new FlowLayout());
        Button b=new Button("ok");
        b.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            Dilaog_Boxes_ex.d.setVisible(false);
        }
        });
        d.add(new Label("Click Button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
                }
}

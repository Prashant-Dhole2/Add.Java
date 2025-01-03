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
public class Scrollbar_ex {
    public static  void main(String args[])
    {
        Frame f=new Frame("Scrollbar Example");
        Label lb=new Label("Horizontal Scrollbar");
        Scrollbar sb=new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);
        Label lb2=new Label("Vertical Scrollbar");
        Scrollbar sb2=new Scrollbar(Scrollbar.VERTICAL,10,5,0,100);
      //  sb.setBounds(100,100,50,100);
     //   sb2.setBounds(100,300,50,100);
        
        
        f.add(lb);
        f.add(lb2);
        f.add(sb);
        f.add(sb2);
        
        f.setLayout(new FlowLayout());
        f.setSize(520,200);
        f.setVisible(true);
    }
}

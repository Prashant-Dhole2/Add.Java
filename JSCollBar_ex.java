/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
public class JSCollBar_ex {
    public static void main(String args[])
    {
        JFrame f=new JFrame("ScrollBar Example");
        JScrollBar sb=new JScrollBar(JScrollBar.HORIZONTAL);
        sb.setBounds(50,100,100,50);
        
        f.add(sb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

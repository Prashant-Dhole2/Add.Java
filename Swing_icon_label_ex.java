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
public class Swing_icon_label_ex extends JApplet {
    public void init()
    {
        Container c=getContentPane();
        ImageIcon img=new ImageIcon("C:\\Users\\Dell\\Desktop\\Wallpaper.JPG");
        JLabel lab=new JLabel("Wallpaper",img,JLabel.CENTER);
        c.add(lab);
    }
}

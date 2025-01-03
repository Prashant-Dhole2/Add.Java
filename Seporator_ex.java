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
public class Seporator_ex {
    JMenu mainmenu;
    JMenuItem m1,m2,m3,m4,m5;
    
public Seporator_ex()
{
    JFrame f=new JFrame("Seporator Example");
    JMenuBar mb=new JMenuBar();
    mainmenu=new JMenu("Menu");
    m1=new JMenuItem("Frist");
    m2=new JMenuItem("Second");
    m3=new JMenuItem("Thrid");
    m4=new JMenuItem("Fourth");
    m5=new JMenuItem("Fifth");
   
    mainmenu.add(m1);
    mainmenu.addSeparator();
    mainmenu.add(m2);
    mainmenu.addSeparator();
    mainmenu.add(m3);
    mainmenu.addSeparator();
    mainmenu.add(m4);
    mainmenu.addSeparator();
    mainmenu.add(m5);
   
    mb.add(mainmenu);
    f.setJMenuBar(mb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    
    
}
public static void main(String args[])
{
    Seporator_ex sp=new Seporator_ex();
}
}

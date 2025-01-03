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
public class JMenu_example {
    public static void main(String args[])
    {
       
        JMenu mainmenu,submenu;
        JMenuItem item1,item2,item3;
        JCheckBoxMenuItem item4,item5;
        JRadioButtonMenuItem item6,item7;
         JFrame f=new JFrame("JMenu Example");
         JMenuBar mb=new JMenuBar();
         mainmenu=new JMenu("Main Menu");
         submenu=new JMenu("Sub Menu");
         item1=new JMenuItem("Frist");
         item2=new JMenuItem("Second");
         item3=new JMenuItem("Third");
         item4=new JCheckBoxMenuItem("Fourth");
         item5=new JCheckBoxMenuItem("Fifth");
         item6=new JRadioButtonMenuItem("Sixth");
         item7=new JRadioButtonMenuItem("Seventh");
         
         mainmenu.add(item1);
         mainmenu.add(item2);
         mainmenu.add(item3);
         submenu.add(item4);
         submenu.add(item5);
         submenu.add(item6);
         submenu.add(item7);
         
          mainmenu.add(submenu);
          mb.add(mainmenu);
          f.setJMenuBar(mb);
          f.setSize(400,400);
          f.setLayout(null);
          f.setVisible(true);
        
    }
}

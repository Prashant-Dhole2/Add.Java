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
public class MenuBar_example {
    public static void main(String args[])
    {
        Frame f=new Frame("Menu and Menu Item Example");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Home");
        Menu submenu=new Menu("Sub Menu");
        MenuItem m1=new MenuItem("Item 1");
        MenuItem m2=new MenuItem("Item 2");
        MenuItem m3=new MenuItem("Item 3");
        MenuItem m4=new MenuItem("Item 4");
        MenuItem m5=new MenuItem("Item 5");
        
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        submenu.add(m4);
        submenu.add(m5);
        
        menu.add(submenu);
        mb.add(menu);
        
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        
    }
}

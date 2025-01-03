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
public class JScroll_Pane {
    private static final long serialVersionUID =1L;
    private static void createGDI()
    {
        JFrame f=new JFrame("Scroll pane Example");
       f.setSize(500,500);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.getContentPane().setLayout(new FlowLayout());
       JTextArea textarea=new JTextArea(20,20);
       JScrollPane scrollabelTextarea=new JScrollPane(textarea);
       scrollabelTextarea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       scrollabelTextarea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       f.getContentPane().add(scrollabelTextarea);
    }
    public static void main(String args[])
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        
        {
            public void run()
            {
                createGDI();
            }
        });
    }
}

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
public class JComboBox_ex {
   public static void main(String args[])
   {
       JFrame f=new JFrame("JComboBox Example");
       String country[]={"India","Aus","Us","England","Newzealand"};
       
       JComboBox cb=new JComboBox(country);
       cb.setBounds(50,100,100,20);
       f.add(cb);
       f.setSize(400,300);
       f.setLayout(null);
       f.setVisible(true);
       
   }
}

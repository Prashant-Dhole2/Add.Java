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
public class JTable_example {
    public static void main(String args[])
    {
        JFrame f=new JFrame("JTable Example");
        String data[][]={{"10","Raj","10000"},
                         {"11","Veer","19000"},
                         {"12","Ramesh","13000"},
                         {"13","Kuldeep","15000"},
                         {"14","Vikas","12000"}};
        
        String column[]={"Roll No","Name","Fees Bal"};
        JTable jt=new JTable(data,column);  
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
    }
}

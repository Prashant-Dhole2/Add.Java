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
public class Practical_1 extends Frame {
    public Practical_1()
    {
        MenuBar mb=new MenuBar();
        Menu F=new Menu("File");
        Menu E=new Menu("Edit");
        Menu V=new Menu("View");
        MenuItem N=new MenuItem("New");
        MenuItem O=new MenuItem("Open");
        F.add(N);
        F.add(O);
        
        mb.add(F);
        mb.add(E);
        mb.add(V);
       
        Label l1,l2,l3;
        l1=new Label("Frist Name");
        l2=new Label("Last Name");
        l3=new Label("Address");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextArea tx=new TextArea(10,5);
        Checkbox c1 = new Checkbox("Term & Condition Apply");
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb2=new Checkbox("Art",cbg,false);
        Checkbox cb3=new Checkbox("Commerce",cbg,false);
        Checkbox cb4 =new Checkbox("Scince",cbg,false);
        Button b1=new Button("Submit");
        Choice ch1=new Choice();
        ch1.add("11th");
        ch1.add("12th");
        
        l1.setBounds(70, 80, 70, 30);
        l2.setBounds(320, 80, 70, 30);
        t1.setBounds(140, 80, 120, 30);
        t2.setBounds(400, 80, 120, 30);
        tx.setBounds(150,170,150,50);
        l3.setBounds(70,170,50,30);
        c1.setBounds(290,270,200,50);
        ch1.setBounds(450,220,60,30);
        cb2.setBounds(350,150,60,60);
        cb3.setBounds(430,150,80,60);
        cb4.setBounds(350,200,80,60);
        b1.setBounds(330,350,100,40);
        
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(tx);
        add(l3);
        add(c1);
        add(ch1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(b1);
        
        setMenuBar(mb);
        setSize(800,800);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Practical_1 p=new Practical_1();
    }
}


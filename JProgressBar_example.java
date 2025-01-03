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
public class JProgressBar_example {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        int i=0,n=0;
        JProgressBar jp=new JProgressBar(2,200);
        jp.setBounds(40,40,160,30);
        jp.setValue(0);
        jp.setStringPainted(true);
        f.add(jp);
        f.setSize(250,150);
        f.setLayout(null);
        f.setVisible(true);
        while(i<=2000)
        {
             jp.setValue(i);
             i=i+20;
             try{Thread.sleep(150);}catch(Exception e){};
            
        }
       
        
                
         
    }
}

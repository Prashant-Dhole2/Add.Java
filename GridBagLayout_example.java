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
public class GridBagLayout_example extends JFrame{
    public GridBagLayout_example()
    {
        GridBagLayout grid=new GridBagLayout();
        GridBagConstraints gbc= new GridBagConstraints();
        setLayout(grid);
        setTitle("GridBag Layout Example");
        
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        this.add(new Button("Button one"),gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        this.add(new Button("Button Two"),gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=20;
        gbc.gridx=0;
        gbc.gridy=1;
        this.add(new Button("Button Three"),gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        this.add(new Button("Button Four"),gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=2;
        this.add(new Button("Button Five"),gbc);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
        GridBagLayout_example gr=new GridBagLayout_example();
    }
    
}

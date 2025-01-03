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
import javax.swing.tree.DefaultMutableTreeNode;
public class JTree_example {
  public static void main(String args[])
  {
    JFrame f=new JFrame("JTree Example");
    DefaultMutableTreeNode poly=new DefaultMutableTreeNode("poly");
    DefaultMutableTreeNode cse=new DefaultMutableTreeNode("cse");
    DefaultMutableTreeNode civil=new DefaultMutableTreeNode("civil");
    poly.add(cse);
    poly.add(civil);
    
    DefaultMutableTreeNode OS=new DefaultMutableTreeNode("Operating System");
    DefaultMutableTreeNode ACN=new DefaultMutableTreeNode("Adv Computer Network");
    DefaultMutableTreeNode STE=new DefaultMutableTreeNode("Software Testing");
    DefaultMutableTreeNode AJP=new DefaultMutableTreeNode("Adv Java");
    
    cse.add(OS);
    cse.add(ACN);
    cse.add(STE);
    cse.add(AJP);
    
    JTree jt=new JTree(poly);
    
    f.add(jt);
    f.setSize(400,400);
    f.setVisible(true);
    
  }
}

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
public class JDailogbox_Ex2 {
    public static void main(String args[])
    {
        int ans=JOptionPane.showConfirmDialog(null,"Dont like to continue?","Comfirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
          if(ans==JOptionPane.NO_OPTION)
          {
              System.out.println("You clicked No");
          }
          else if(ans==  JOptionPane.YES_OPTION)
          {
              System.out.println("You clicked Yes");
          }
          else if(ans==JOptionPane.CLOSED_OPTION)
          {
              System.out.println("Closing JOptionPane");
          }
    }
}

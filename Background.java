/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.applet.*;
import java.awt.*;

public class Background extends Applet {
     public void init()
	{
     setBackground(Color.blue);
     setForeground(Color.white);

    }
public void paint(Graphics g)
{
 g.drawString("this is Adv java",40,25);

}
}
/*
 <applet code="Background" width=200 height=200>
 </applet>
*/


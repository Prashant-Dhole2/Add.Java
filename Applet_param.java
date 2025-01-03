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
public class Applet_param extends Applet
{
  int id;
  String name,msg;
  public void init()
  {
    id=Integer.parseInt(getParameter("pid"));
	name=getParameter("pname");
  
  
  }
  public void paint(Graphics g)
  {
    msg=id +" "+ name;
	g.drawString(msg,20,30);
  }


}
/*
<applet code="Applet_param" width=200 heigth=200>
<param name="pid" value="552" />
<param name="pname" value="Demo" />
</applet> 
 */ 


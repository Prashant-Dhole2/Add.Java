/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Outer_demo{
    private int num=175;
    public class Inner_demo{
        public int getNum()
        {
         System.out.println("This is inner class method calling");
         return num;
        }
    }
}
public class Inner_Class_ex {
    public static void main(String args[])
    {
        Outer_demo outer=new Outer_demo();
        Outer_demo.Inner_demo inner=outer.new Inner_demo();
        System.out.println(inner.getNum());
    }
}

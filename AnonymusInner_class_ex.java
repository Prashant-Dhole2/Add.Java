/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
abstract class AnonymusInner
{
    public abstract void mymethod();
          
    
}
public class AnonymusInner_class_ex {
    
    public static void main(String args[])
    {
        AnonymusInner inner=new AnonymusInner()
        {
            public void mymethod()
            {
                System.out.println("This is Anonymus Inner class");
            }
        };
        inner.mymethod();
    }
}

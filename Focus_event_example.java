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
import java.awt.event.*;
public class Focus_event_example {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    public Focus_event_example()
    {
        prepareGUI();
    }
    public static void main(String args[])
    {
        Focus_event_example obj=new Focus_event_example();
        obj.showFocusListenerDemo();
    }
    private void prepareGUI()
    {
        mainFrame=new Frame("Java  Focus Event Example");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });
        headerLabel=new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel=new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        
        controlPanel=new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showFocusListenerDemo()
    {
        headerLabel.setText("Listener in action : FocusListener");
        
        Button okButton=new Button("ok");
        Button cancelButton=new Button("cancel");
        okButton.addFocusListener(new CustomFocusListener());
        
        controlPanel.add(okButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
    class CustomFocusListener implements FocusListener
    {
        public void  focusGained(FocusEvent e)
        {
            statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+"gained Focus ");
        }
        public void  focusLost(FocusEvent e)
        {
            statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+"gained lost ");
        }
                
    }
}

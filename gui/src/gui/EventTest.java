/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

/**
 *
 * @author Abhinav
 */
public class EventTest extends Frame{
    public static Button b1;
    public static  TextField tf1;
    public static void main(String args[]){
    Frame f=new Frame();
    f.setSize(500,500);
    f.setVisible(true);
     tf1=new TextField();
     b1=new Button("Click me");
     f.add("North",tf1);
     f.add("South",b1);
     
     b1.addActionListener(new Event());
    
}
}
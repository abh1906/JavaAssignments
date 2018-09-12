/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Abhinav
 */
public class Registration extends Frame {
    
    public static void main(String args[]){
        Frame f=new Frame();
        f.setSize(500,500);
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p3=new Panel();
    
        Label  name=new Label("Name");
        Label age=new Label("Age");
        Button save=new Button("Save");
        Button cancel =new Button("Cancel");
        Button exit=new Button("Exit");
        TextField tf1=new TextField(10);
        TextField tf2=new TextField(10);
        p1.add(name);
        p1.add(tf1);
        p1.add(age);
        p1.add(tf2);
        p3.add(save);
        p3.add(cancel);
        p3.add(exit);
        p2.setLayout(new GridLayout(2,3));
  
        f.add("North",p1);
        Checkbox sub1=new Checkbox("php");
        Checkbox sub2=new Checkbox("java");
        Checkbox mod1=new Checkbox("online");
        Checkbox mod2=new Checkbox("classes");
        Label subject=new Label("Subject");
        Label modes=new Label("modes");
        p2.add(subject);
        p2.add(sub1);
        p2.add(sub2);
        p2.add(modes);
        p2.add(mod1);
        p2.add(mod2);
        f.add("Center",p2);
        f.add("South",p3);
       
       f.setVisible(true);
        
        
        
    }
    
    
    
}

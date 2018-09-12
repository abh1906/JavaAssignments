/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Abhinav
 */
public class Event implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        EventTest.tf1.setText("hello button clicked");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

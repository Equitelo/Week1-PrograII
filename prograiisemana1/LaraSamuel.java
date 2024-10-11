/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograiisemana1;

import java.awt.FlowLayout;
import javax.swing.*;

public class LaraSamuel extends JFrame{
    
    Panel panel;
    
    LaraSamuel () {
        
        panel=new Panel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        
        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
    }
    
}

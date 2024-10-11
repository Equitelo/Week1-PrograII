package prograiisemana1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    JLabel labelUser;
    JLabel labelPassword;
    JButton buttonLogIn;
    JButton buttonAccount;
    
    Panel(){
        
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.red);
        this.setLayout(null);

        buttonLogIn = new JButton("1 - Log In");
        buttonAccount = new JButton("2 - Crear Account");
        buttonLogIn.setBounds(180, 200, 150, 30); 
        buttonAccount.setBounds(180, 250, 150, 30);
        this.add(buttonLogIn);
        this.add(buttonAccount);
        buttonLogIn.addActionListener(this);
        buttonAccount.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonLogIn){
            new VentanaLog();
        }else if(e.getSource()==buttonAccount){
        
        }
    }
}

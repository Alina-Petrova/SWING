/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author tss
 */
public class MyJFrame extends JFrame implements MouseListener{
    private JPanel panel;
    private JButton button1,button2;
    private JLabel lbl1;
    public final Color backgrcButton;

    public MyJFrame(String title) throws HeadlessException {
        super(title);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 200);
        this.panel=new JPanel();
        this.button1=new JButton("+");
        this.button2=new JButton("-");
        this.lbl1=new JLabel("0");
        this.panel.add(this.button1);
        this.panel.add(this.button2);
        this.panel.add(this.lbl1);
        add(panel);
        button1.addMouseListener(this);
        button2.addMouseListener(this);
        //button2.addActionCommand("-"); come variante
        backgrcButton = button1.getBackground();
        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent me) {
        String s= lbl1.getText();
        int i=0;
        if(me.getSource().equals(button1)) {           
            i=Integer.parseInt(s)+1;
        }else 
            if(me.getSource().equals(button2)) {
              i=Integer.parseInt(s)-1;
        }
        lbl1.setText(String.valueOf(i));
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource().equals(button1))
            button1.setBackground(Color.red);
        else
          if(me.getSource().equals(button2))
              button2.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource().equals(button1))
            button1.setBackground(backgrcButton);
        else
          if(me.getSource().equals(button2))
              button2.setBackground(backgrcButton);
    }

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            
        }
    
    
}

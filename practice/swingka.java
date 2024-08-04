package practice;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingka extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola");
        JLabel label = new JLabel("lily says I am Gay, I am Gay, no lily you are just confused xjfkjdscfjcmmficmcmfimcmi");
        
        
        
        JButton button = new JButton("Fuck me");
        JButton butt = new JButton("Please don't");

        button.addActionListener(new myactionlistener());
        butt.addActionListener(new myactionlistener());
        
        
JPanel panel = new JPanel();
panel.add(label);
panel.add(button);
panel.add(butt);
JScrollPane pane = new JScrollPane();

frame.getContentPane().add(pane);
frame.add(panel);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setSize(400, 400);
    }

    
    
    }

class myactionlistener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
        
    if (e.getActionCommand().equals("Fuck me")) {
System.out.println("Mujhe dabaya gaya hai");
    }   
    else{
        System.out.println("Kyu dabaya");
    }
    } 

    
}
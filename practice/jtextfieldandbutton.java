package practice;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jtextfieldandbutton extends JFrame implements ActionListener {

    public static void main(String[] args) {
        jtextfieldandbutton frame = new jtextfieldandbutton();
        frame.setVisible(true);
        
    }

    JPanel panel = new JPanel();
    JLabel valueLabel = new JLabel("Enter VALUE");
    JTextField valueField = new JTextField("", 18);
    JButton computeButton = new JButton("Compute me");
    JLabel squareLabel = new JLabel("Square:");
    JTextField squareField = new JTextField("", 18);
    JLabel rootLabel = new JLabel("Root:");
    JTextField rootField = new JTextField("", 18);

      public jtextfieldandbutton(){  // Add components to the panel
        panel.add(valueLabel);
        panel.add(valueField);
        panel.add(computeButton);
        panel.add(squareLabel);
        panel.add(squareField);
        panel.add(rootLabel);
        panel.add(rootField);

        // Implement action listener
        computeButton.addActionListener(this);

        // Add panel to the frame
        add(panel);

        // Set frame properties
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
      }
    
    public void actionPerformed(ActionEvent e){
        int value = Integer.parseInt(valueField.getText());
        squareField.setText(""+ value*value);
        rootField.setText(""+ Math.sqrt(value));
    }
}

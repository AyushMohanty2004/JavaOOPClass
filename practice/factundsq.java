package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class factundsq extends JFrame{
    JPanel pane = new JPanel();
    JLabel text = new JLabel("Enter input");
    JTextField input = new JTextField("", 7);
JButton factorial = new JButton("Find factorial");
JButton square = new JButton("Find square");

public factundsq(){
     pane.add(text);
     pane.add(input);
     pane.add(factorial);
     pane.add(square);
     getContentPane().add(pane);
     factorial.addActionListener(new myaction());
     square.addActionListener(new myaction());
     setVisible(true);
     pack();
}

public class myaction implements ActionListener {
public void actionPerformed(ActionEvent e){
    int i = Integer.parseInt(input.getText());
    if(e.getActionCommand().equals("Find factorial")){
        int factorial = 1;
        int p = 1;
        while (p<=i) {
            factorial = factorial*p;
            p++;
        }
        System.out.println(factorial);
    }
else{
    System.out.println("square" + i*i);
}    
}


    
}
public static void main(String[] args) {
new factundsq();    
}
}

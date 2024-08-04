package practice;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudent extends JFrame {

    JPanel pp = new JPanel();
    JLabel Rollno = new JLabel("Enter Roll Number");
    JTextField Roll = new JTextField("", 7);


    JLabel Name = new JLabel("Enter name");
    JTextField naam = new JTextField("", 7);

    
    JLabel marks = new JLabel("Enter marks");
    JTextField marking = new JTextField("", 7);

    JButton insert = new JButton("Insert");


public Estudent(){
    pp.add(Rollno);
    pp.add(Roll);
    pp.add(Name);
    pp.add(naam);
    pp.add(marks);
    pp.add(marking);
    pp.add(insert);
    insert.addActionListener(new myaction());

    getContentPane().add(pp);
    setVisible(true);
    pack();
}

public class myaction implements ActionListener {
public void actionPerformed(ActionEvent e){
String aroll = Roll.getText();
String aname = naam.getText();
String amark = marking.getText();

System.out.println(aroll);
System.out.println(aname);
System.out.println(amark);
}


    
}

public static void main(String[] args) {
    new Estudent();
}
}

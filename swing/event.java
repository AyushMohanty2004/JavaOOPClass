package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class event extends JFrame implements ActionListener {
    public event(String name){
        super();
        JButton button = new JButton();
        add(button);
        button.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("action performed");
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setVisible(true);
}
}

package swing;
import javax.swing.*;

public class basic {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jpanel explaination"); 
        JPanel panel = new JPanel();
    JLabel label = new JLabel("A Jpanel with some text in it");
    JButton button = new JButton("Click Me");
    panel.add(label);
    panel.add(button);
    JScrollPane scroll = new JScrollPane(panel);
    frame.getContentPane().add(scroll);
    frame.pack();
    frame.setVisible(true);
    }
}

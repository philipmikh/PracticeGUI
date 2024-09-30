import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example3 implements ActionListener {
    private JFrame mainframe;
    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JTextArea textArea;
    private JButton button1;
    private JButton button2;
    private int count = 0;

    public static void main(String[] args) {
        Example2 ex = new Example2();
    }

    public  Example3() {

        mainframe = new JFrame();
        mainframe.setSize(400,400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));

        label1 = new JLabel("Label 1!");
        label2 = new JLabel("Label 2!");

        button1 = new JButton("Button 1");
        button1.addActionListener(this); //make button clickable and the action will be preformed
        button2 = new JButton("Button 2");
        button2.addActionListener(this);





        panel.add(button1);
        panel.add(button2);

        panel.add(label1);
        panel.add(label2);

        mainframe.add(panel);

        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainframe.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
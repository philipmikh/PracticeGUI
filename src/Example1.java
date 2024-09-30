import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 implements ActionListener {

    //declared all the variables
    private JFrame mainframe;
    private JPanel panel;
    private JLabel label;
    private JTextArea textArea;
    private JButton button1;
    private JButton button2;
    private int count = 0;


    public static void main(String[] args) {
        Example1 ex = new Example1();
    }

    public Example1(){
        //construct things
        mainframe = new JFrame();
        mainframe.setSize(400,400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        label = new JLabel("This is the label!");
        textArea = new JTextArea();
        button1 = new JButton("Button 1");
        button1.addActionListener(this); //make button clickable and the action will be preformed
        button2 = new JButton("Button 2");
        button2.addActionListener(this);

        panel.add(textArea);
        panel.add(button1);
        panel.add(button2);

        panel.add(label);

        mainframe.add(panel);

        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setTitle("Don't click this button");

        //mainframe.pack(); don't do this if your setting the size of the mainframe manually
        mainframe.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Button 1")){
            System.out.println("Why did you click the button???");
            count++;
            label.setText("Number of clicks:" + count);
        } else if (command.equals("Button 2")) {
            String text = textArea.getText();
            label.setText(text);

        }



    }
}

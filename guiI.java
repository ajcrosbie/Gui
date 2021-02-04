import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label;
    private JPanel panel;
    private JTextField text;
    private JTextField text2;

    public guiI() {
        frame = new JFrame();
        button1 = new JButton("addition");
        button2 = new JButton("subtraction");
        button3 = new JButton("division");
        button4 = new JButton("multiplication");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        label = new JLabel("answer is :");
        text = new JTextField();
        text2 = new JTextField();
        panel = new JPanel();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(text);
        panel.add(text2);
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("our gui");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new guiI();
    }

    public static String fixNums(String numS, boolean t) {
        if (numS == " ") {
            for (int i = 0; i < 100; i++) {
                System.out.println(numS);
            }
            if (t == false) {
                numS = "1";
            } else {
                numS = "0";
            }

        }
        return numS;

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String num1S = text.getText();
            String num2S = text2.getText();
            // num1S = fixNums(num1S, true);
            // num2S = fixNums(num2S, true);
            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);
            int answer = num1 + num2;
            label.setText("the answer is : " + answer);
        } else if (e.getSource() == button2) {
            String num1S = text.getText();
            String num2S = text2.getText();
            // num1S = fixNums(num1S, true);
            // num2S = fixNums(num2S, true);
            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);
            int answer = num1 - num2;
            label.setText("the answer is : " + answer);
        } else if (e.getSource() == button3) {
            String num1S = text.getText();
            String num2S = text2.getText();
            // num1S = fixNums(num1S, false);
            // num2S = fixNums(num2S, false);
            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);
            int answer = num1 / num2;
            label.setText("the answer is : " + answer);
        } else if (e.getSource() == button4) {
            String num1S = text.getText();
            String num2S = text2.getText();
            // num1S = fixNums(num1S, true);
            // num2S = fixNums(num2S, true);
            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);
            int answer = num1 * num2;
            label.setText("the answer is : " + answer);
        }
    }
}

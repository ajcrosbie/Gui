import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gui implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;

    public gui() {
        frame = new JFrame();
        button = new JButton("click it");
        button.addActionListener(this);
        label = new JLabel("number of clicks");

        panel = new JPanel();
        panel.add(button);
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(1, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("our gui");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new gui();
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText(" number of clicks " + count);
    }
}

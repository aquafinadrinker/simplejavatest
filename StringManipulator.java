import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringManipulator extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextArea outputArea;

    public StringManipulator() {
        super("String Manipulator");

        // create input field and add to panel
        inputField = new JTextField(20);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter a string: "));
        inputPanel.add(inputField);

        // create output area and add to panel
        outputArea = new JTextArea(10, 20);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);
        JPanel outputPanel = new JPanel();
        outputPanel.add(new JLabel("Output: "));
        outputPanel.add(outputScrollPane);

        // create buttons and add to panel
        JButton countButton = new JButton("Count");
        JButton reverseButton = new JButton("Reverse");
        JButton upperButton = new JButton("Uppercase");
        JButton lowerButton = new JButton("Lowercase");
        countButton.addActionListener(this);
        reverseButton.addActionListener(this);
        upperButton.addActionListener(this);
        lowerButton.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(countButton);
        buttonPanel.add(reverseButton);
        buttonPanel.add(upperButton);
        buttonPanel.add(lowerButton);

        // add panels to frame
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Count")) {
            String input = inputField.getText();
            int count = input.length();
            outputArea.setText("Number of characters: " + count);
        } else if (e.getActionCommand().equals("Reverse")) {
            String input = inputField.getText();
            String reverse = new StringBuilder(input).reverse().toString();
            outputArea.setText("Reversed string: " + reverse);
        } else if (e.getActionCommand().equals("Uppercase")) {
            String input = inputField.getText();
            String upper = input.toUpperCase();
            outputArea.setText("Uppercase string: " + upper);
        } else if (e.getActionCommand().equals("Lowercase")) {
            String input = inputField.getText();
            String lower = input.toLowerCase();
            outputArea.setText("Lowercase string: " + lower);
        }
    }

    public static void main(String[] args) {
        new StringManipulator();
    }
}

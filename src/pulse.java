import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pulse extends JFrame {
    private JTextField textField;
    private JButton signUpButton;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public pulse() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Signup Page Example");
        setSize(300, 200);

        // Create the text field and sign-up button
        textField = new JTextField(20);
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (text.equals("text")) {
                    // Switch to another page and display the typed text
                    cardLayout.show(cardPanel, "otherPage");
                    JOptionPane.showMessageDialog(pulse.this, "Typed Text: " + text);
                }
            }
        });

        // Create the main page panel
        JPanel mainPage = new JPanel(new BorderLayout());
        mainPage.add(new JLabel("Enter Text:"), BorderLayout.NORTH);
        mainPage.add(textField, BorderLayout.CENTER);
        mainPage.add(signUpButton, BorderLayout.SOUTH);

        // Create the other page panel
        JPanel otherPage = new JPanel(new BorderLayout());
        otherPage.add(new JLabel("Other Page"), BorderLayout.CENTER);

        // Create the card panel and set the card layout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(mainPage, "mainPage");
        cardPanel.add(otherPage, "otherPage");

        // Set the initial page to the main page
        cardLayout.show(cardPanel, "mainPage");

        getContentPane().add(cardPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new pulse().setVisible(true);
            }
        });
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccessibleWindowTest {

    public static void main(String[] args) {
        new AccessibleWindowTest().showWindow();
    }

    public void showWindow() {
        JFrame window = new JFrame("Accessible Cipher GUI");
        window.setSize(1120, 540);
        window.setLayout(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        // Define Fonts & Colors
        Font bigFont = new Font("SansSerif", Font.PLAIN, 15);
        Color textPrimary = Color.decode("#212121");
        Color textLight = Color.decode("#FFFFFF");
        Color bgLight = Color.decode("#FFFFFF");
        Color bgAlt = Color.decode("#FAFAFA");
        Color navyText = Color.decode("#003366");
        Color btnBlue = Color.decode("#005A9C");
        Color btnRed = Color.decode("#B00020");

        // Labels
        JLabel outputTextLabel = new JLabel("Output", SwingConstants.CENTER);
        JLabel inputLabel = new JLabel("Input", SwingConstants.CENTER);
        JLabel outputLabel = new JLabel();
        outputLabel.setOpaque(true);
        outputLabel.setBackground(bgLight);
        outputLabel.setForeground(navyText);
        outputLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        outputLabel.setHorizontalAlignment(SwingConstants.LEFT);
        outputLabel.setVerticalAlignment(SwingConstants.TOP);

        JLabel keyLabel = new JLabel("Complexity key: ", SwingConstants.RIGHT);

        // Fields
        JTextField keyField = new JTextField();
        JTextArea inputArea = new JTextArea();
        inputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        inputArea.setBackground(bgAlt);
        inputArea.setForeground(textPrimary);

        // Buttons
        JButton encryptBtn = new JButton("Encrypt");
        JButton decryptBtn = new JButton("Decrypt");
        JButton exitBtn = new JButton("Exit");
        JButton clearBtn = new JButton("Clear");

        JButton[] buttons = {encryptBtn, decryptBtn, clearBtn};
        for (JButton btn : buttons) {
            btn.setBackground(btnBlue);
            btn.setForeground(textLight);
        }

        exitBtn.setBackground(btnRed);
        exitBtn.setForeground(textLight);

        // Radio Buttons
        JRadioButton subsRBtn = new JRadioButton("Substitution", true);
        JRadioButton transRBtn = new JRadioButton("Translation");
        ButtonGroup cipherGroup = new ButtonGroup();
        cipherGroup.add(subsRBtn);
        cipherGroup.add(transRBtn);

        // Tooltips
        inputArea.setToolTipText("Enter the phrase to Encrypt or Decrypt");
        outputLabel.setToolTipText("Encrypted / Decrypted Text");
        keyField.setToolTipText("Enter the Complexity key");

        // Add to window
        window.add(outputTextLabel);
        window.add(inputLabel);
        window.add(outputLabel);
        window.add(keyLabel);
        window.add(keyField);
        window.add(inputArea);
        window.add(encryptBtn);
        window.add(decryptBtn);
        window.add(exitBtn);
        window.add(subsRBtn);
        window.add(transRBtn);
        window.add(clearBtn);

        // Set Bounds
        inputLabel.setBounds(50, 20, 500, 30);
        inputArea.setBounds(50, 50, 500, 180);
        outputTextLabel.setBounds(570, 20, 500, 30);
        outputLabel.setBounds(570, 50, 500, 180);
        subsRBtn.setBounds(380, 250, 160, 30);
        transRBtn.setBounds(580, 250, 160, 30);
        keyLabel.setBounds(430, 295, 120, 30);
        keyField.setBounds(560, 295, 90, 30);
        encryptBtn.setBounds(150, 380, 160, 50);
        decryptBtn.setBounds(370, 380, 160, 50);
        clearBtn.setBounds(590, 380, 160, 50);
        exitBtn.setBounds(810, 380, 160, 50);

        // Fonts & Text Color
        Component[] components = {
                inputArea, outputLabel, subsRBtn, transRBtn, keyLabel, keyField,
                encryptBtn, decryptBtn, exitBtn, clearBtn, outputTextLabel, inputLabel
        };

        for (Component c : components) {
            c.setFont(bigFont);
            if (c instanceof JLabel || c instanceof JRadioButton) {
                c.setForeground(textPrimary);
            }
        }

        // Radio Button Label Switching
        subsRBtn.addActionListener(e -> keyLabel.setText("Complexity key: "));
        transRBtn.addActionListener(e -> keyLabel.setText("Shift value: "));

        // Exit
        exitBtn.addActionListener(e -> System.exit(0));

        // Key Listener for Escape
        inputArea.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    exitBtn.doClick();
                }
            }
        });

        // Clear
        clearBtn.addActionListener(e -> {
            inputArea.setText("");
            outputLabel.setText("");
            keyField.setText("");
            subsRBtn.setSelected(true);
            keyLabel.setText("Complexity key: ");
            inputArea.requestFocus();
        });

        window.setVisible(true);
    }
}

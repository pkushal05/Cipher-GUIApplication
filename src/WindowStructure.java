/*                                                                                             * Hot-Keys:
    Author: Kushal Patel                                                                       * Alt-E - Encrypt
      Date: 14th April 2025                                                                    * Alt-D - Decrypt
     Title: Final Project - GUI                                                                * Alt-C - Clear
      Desc: This project is the GUI version of Cipher Assignment (assignment 2)                * Alt-X or Escape - Exit
*/

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WindowStructure {

    // Main application window
    private final JFrame window;

    public WindowStructure() {

        // Final Text constants
        final String titleText = "Cipher GUI";
        final String outputText = "Output";
        final String inputText = "Input";
        final String encryptText = "Encrypt";
        final String decryptText = "Decrypt";
        final String exitText = "Exit";
        final String substitutionText = "Substitution";
        final String translationText = "Translation";
        final String complexityText = "Complexity key: ";
        final String shiftText = "Shift value: ";
        final String clearText = "Clear";
        final String error1 = "Please enter a phrase to proceed";
        final String error2 = "Please enter a key to proceed";
        final String error3 = "Please enter a valid key";
        final String error4 = "Please enter a positive key";
        final String error5 = "Please enter a positive key to decrypt using Substitution Cipher";
        final String error6 = "Please enter a negative key to decrypt using Translation Cipher";
        final String emptyText = "";
        final String inputToolTip = "Enter the phrase to Encrypt or Decrypt";
        final String outputToolTip = "Encrypted / Decrypted Text";
        final String keyToolTip = "Enter the Complexity key";
        final String encryptTootTip = "Click to Encrypt text";
        final String decryptToolTip = "Click to Decrypt text";
        final String clearToolTip = "Click to Reset the fields";
        final String exitTootTip = "Click to Exit the application";
        final String radio1ToolTip = "Choose Substitution Cipher";
        final String radio2ToolTip = "Choose Translation Cipher";
        final String fontText = "SansSerif";

        // Initialize the main window and its basic attributes
        window = new JFrame();
        window.setTitle(titleText);
        window.setSize(1120, 540);
        window.setLayout(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        // Output Label
        JLabel outputTextLabel = new JLabel(outputText);
        outputTextLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Output Label - to show the encrypted / decrypted text
        JTextArea outputArea = new JTextArea();
        outputArea.setOpaque(true);
        JScrollPane outputScroll = new JScrollPane(outputArea);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setEditable(false);
        outputArea.setBackground(Color.WHITE);
        outputArea.setForeground(Color.BLACK);
        outputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        // Complexity / Shift key label
        JLabel keyLabel = new JLabel(complexityText);
        keyLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        // Complexity / Shift key entry field
        JTextField keyField = new JTextField();

        // Input label
        JLabel inputLabel = new JLabel(inputText);
        inputLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Main input text area
        JTextArea inputArea = new JTextArea();
        JScrollPane textScroll = new JScrollPane(inputArea);
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.requestFocus();
        textScroll.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        // Buttons
        JButton encryptBtn = new JButton(encryptText);
        JButton decryptBtn = new JButton(decryptText);
        JButton exitBtn = new JButton(exitText);
        JButton clearBtn = new JButton(clearText);

        // Radio-Buttons
        JRadioButton subsRBtn = new JRadioButton(substitutionText);
        subsRBtn.setSelected(true);
        JRadioButton transRBtn = new JRadioButton(translationText);

        // Radio-button Group
        ButtonGroup cipherSelection = new ButtonGroup();
        cipherSelection.add(subsRBtn);
        cipherSelection.add(transRBtn);

        // Adding every component to the J-frame
        window.add(outputTextLabel);
        window.add(inputLabel);
        window.add(outputScroll);
        window.add(keyLabel);
        window.add(keyField);
        window.add(textScroll);
        window.add(encryptBtn);
        window.add(decryptBtn);
        window.add(exitBtn);
        window.add(subsRBtn);
        window.add(transRBtn);
        window.add(clearBtn);

        // Defining their position in the window
        // Input
        inputLabel.setBounds(50, 20, 500, 30);
        textScroll.setBounds(50, 50, 500, 180);
        // Output
        outputTextLabel.setBounds(570, 20, 500, 30);
        outputScroll.setBounds(570, 50, 500, 180);
        // Radiobutton
        subsRBtn.setBounds(380, 250, 160, 30);
        transRBtn.setBounds(580, 250, 160, 30);
        // Key
        keyLabel.setBounds(430, 295, 120, 30);
        keyField.setBounds(560, 295, 90, 30);
        // Buttons
        encryptBtn.setBounds(150, 380, 160, 50);
        decryptBtn.setBounds(370, 380, 160, 50);
        clearBtn.setBounds(590, 380, 160, 50);
        exitBtn.setBounds(810, 380, 160, 50);

        // Adding custom font to all the components
        Font bigFont = new Font(fontText, Font.PLAIN, 15);

        inputArea.setFont(bigFont);
        outputArea.setFont(bigFont);
        subsRBtn.setFont(bigFont);
        transRBtn.setFont(bigFont);
        keyLabel.setFont(bigFont);
        keyField.setFont(bigFont);
        encryptBtn.setFont(bigFont);
        decryptBtn.setFont(bigFont);
        exitBtn.setFont(bigFont);
        clearBtn.setFont(bigFont);
        outputTextLabel.setFont(bigFont);
        inputLabel.setFont(bigFont);

        // Hot-Keys
        encryptBtn.setMnemonic(KeyEvent.VK_E);
        decryptBtn.setMnemonic(KeyEvent.VK_D);
        clearBtn.setMnemonic(KeyEvent.VK_C);
        exitBtn.setMnemonic(KeyEvent.VK_X);

        // Tooltips
        inputArea.setToolTipText(inputToolTip);
        outputArea.setToolTipText(outputToolTip);
        keyField.setToolTipText(keyToolTip);
        encryptBtn.setToolTipText(encryptTootTip);
        decryptBtn.setToolTipText(decryptToolTip);
        clearBtn.setToolTipText(clearToolTip);
        exitBtn.setToolTipText(exitTootTip);
        subsRBtn.setToolTipText(radio1ToolTip);
        transRBtn.setToolTipText(radio2ToolTip);

        // AODA - Compliant Color theme
        Color backgroundColor = new Color(240, 244, 248);
        Color inputOutputBackground = Color.WHITE;
        Color labelColor = new Color(13, 27, 42);
        Color borderColor = new Color(144, 164, 174);
        Color buttonTextColor = Color.WHITE;
        Color buttonBackgroundColor = new Color(25, 118, 210);

        // Apply background color to main window
        window.getContentPane().setBackground(backgroundColor);

        // Apply colors to input and output areas
        inputArea.setBackground(inputOutputBackground);
        inputArea.setForeground(labelColor);
        inputArea.setCaretColor(labelColor);

        outputArea.setBackground(inputOutputBackground);
        outputArea.setForeground(labelColor);
        outputArea.setCaretColor(labelColor);

        // Labels
        inputLabel.setForeground(labelColor);
        outputTextLabel.setForeground(labelColor);
        keyLabel.setForeground(labelColor);

        // Radio buttons
        subsRBtn.setBackground(backgroundColor);
        subsRBtn.setForeground(labelColor);
        transRBtn.setBackground(backgroundColor);
        transRBtn.setForeground(labelColor);

        // Key field
        keyField.setBackground(inputOutputBackground);
        keyField.setForeground(labelColor);
        keyField.setCaretColor(labelColor);

        // Buttons
        JButton[] buttons = {encryptBtn, decryptBtn, clearBtn, exitBtn};
        for (JButton button : buttons) {
            button.setBackground(buttonBackgroundColor);
            button.setForeground(buttonTextColor);
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createLineBorder(borderColor, 1));
        }

        // Action listener on radio-buttons
        subsRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (subsRBtn.isSelected()) {
                    keyLabel.setText(complexityText); // Changing the text to "Complexity key" for Substitution
                }
            }
        });
        transRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (transRBtn.isSelected()) {
                    keyLabel.setText(shiftText); // Changing the text to "Shift value" for Translation
                }
            }
        });

        // Action listener on buttons

        // Encryption Button
        encryptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String key = keyField.getText();
                String inputPhrase = inputArea.getText();

                if (inputPhrase.isEmpty()) {
                    JOptionPane.showMessageDialog(window, error1); // Showing error, if input is empty
                } else if (key.isEmpty() ) {
                    JOptionPane.showMessageDialog(window, error2); // Showing error, if key is empty
                } else {
                    try {
                        int keyValue = Integer.parseInt(key); // Casting the key into int
                        if (keyValue >= 0) { // If key is valid
                            if (subsRBtn.isSelected()) {
                                String encryptedText = Substitution.encryption(inputPhrase, keyValue); // Calling the substitution encryption method
                                outputArea.setText(encryptedText);
                            } else if (transRBtn.isSelected()) {
                                String encryptedText = Translation.translation(inputPhrase, keyValue); // Calling the translation method
                                outputArea.setText(encryptedText);
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(window, error4); // Showing error, if key is negative
                        }
                    } catch (Exception err) {
                        JOptionPane.showMessageDialog(window, error3); // Showing error, if entered key is alphabetical
                    }
                }
            }
        });

        // Decryption Button
        decryptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = keyField.getText();
                String inputPhrase = inputArea.getText();

                if (inputPhrase.isEmpty()) {
                    JOptionPane.showMessageDialog(window, error1); // Showing error, if input is empty
                } else if (key.isEmpty()){
                    JOptionPane.showMessageDialog(window, error2); // Showing error, if key is empty
                }
                else {
                    try {
                        int keyValue = Integer.parseInt(key); // Casting the key into int

                        if (keyValue > 0 && subsRBtn.isSelected()) {
                            String decryptedText = Substitution.decryption(inputPhrase, keyValue); // Calling the substitution decryption method
                            outputArea.setText(decryptedText);
                        } else if (keyValue < 0 && subsRBtn.isSelected()) {
                            JOptionPane.showMessageDialog(window, error5); // Showing error
                        } else if (keyValue > 0 && transRBtn.isSelected()) {
                            JOptionPane.showMessageDialog(window, error6); // Showing error
                        } else if (keyValue < 0 && transRBtn.isSelected()) {
                            String decryptedText = Translation.translation(inputPhrase, keyValue); // Calling the translation method with negative key
                            outputArea.setText(decryptedText);
                        }
                    } catch (Exception err) {
                        JOptionPane.showMessageDialog(window, error3); // Showing error, if entered key is alphabetical

                    }
                }
            }
        });

        // Exit Button
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exiting the application
            }
        });

        // Key listener on Input Text Area
        inputArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) { // If ESCAPE is pressed "While" cursor is in text area
                    exitBtn.doClick(); // Clicking the exit button
                } else {
                    super.keyTyped(e);
                }

            }
        });

        // Clear Button
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArea.setText(emptyText);
                outputArea.setText(emptyText);
                keyField.setText(emptyText); // Resetting all the fields
                subsRBtn.setSelected(true);
                keyLabel.setText(complexityText);
                inputArea.requestFocus();
            }
        });
    }

    // Show method to set the window visible
    public void show() {
        window.setVisible(true);
    }
}
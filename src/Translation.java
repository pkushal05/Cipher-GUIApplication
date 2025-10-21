/*
    Author: Kushal Patel
      Date: 14th April 2025
     Title: Final Project - GUI
      Desc: This class contains the Translation logic
*/

public class Translation {

    // Method to perform Translation Cipher
    public static String translation(String text, int key) {
        String resultText = ""; // Initializing an empty string
        for (int i = 0; i < text.length(); i++) { // Iterate through each character
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) { // Checking if the character is Uppercase
                char newChar = (char) (ch + key); // Shift the character by the key

                // If the new character goes beyond 'Z', wrap around to the beginning of the alphabet
                if (newChar > 'Z') {
                    newChar -= 26;
                } else if (newChar < 'A') {
                    newChar += 26;
                }
                resultText += newChar; // Append to result string
            } else if (Character.isLowerCase(ch)) { // Check if the character is lowercase
                char newChar = (char) (ch + key); // Shift the character by the key

                // If the new character goes beyond 'z', wrap around to the beginning of the alphabet
                if (newChar > 'z') {
                    newChar -= 26;
                } else if (newChar < 'a') {
                    newChar += 26;
                }
                resultText += newChar; // Append to result string
            } else {
                // If it's not an alphabet ( special character or space), keeping it unchanged in the result
                resultText += ch;
            }
        }
        return resultText;
    }
}
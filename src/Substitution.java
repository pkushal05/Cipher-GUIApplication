/*
    Author: Kushal Patel
      Date: 14th April 2025
     Title: Final Project - GUI
      Desc: This class contains the Substitution logic
*/

public class Substitution {
    private static final char[] engAlphabets = { // Char Array of standard english alphabets
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final char[] subsAlphabets = { // Char Array of COSC1200 alphabets
            'Y', 'W', 'L', 'R', 'A', 'S', 'K', 'T', 'E', 'Z', 'G', 'M', 'V',
            'H', 'Q', 'B', 'X', 'N', 'C', 'D', 'I', 'J', 'F', 'U', 'O', 'P',
            'y', 'w', 'l', 'r', 'a', 's', 'k', 't', 'e', 'z', 'g', 'm', 'v',
            'h', 'q', 'b', 'x', 'n', 'c', 'd', 'i', 'j', 'f', 'u', 'o', 'p'};

    // Method to ENCRYPT
    public static String encryption(String text, int Ckey) {

        String result = text;

        for (int k = 1; k <= Ckey; k++) { // Running the loop for "Desired key" times

            String encryptedText = "";

            for (int i = 0; i < result.length(); i++) { // Iterate through each character of the input
                char ch = result.charAt(i);

                int index = -1;
                for (int j = 0; j < engAlphabets.length; j++) { // Find the index of that character in engAlphabets
                    if (engAlphabets[j] == ch) {
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    encryptedText += subsAlphabets[index]; // Substitute with subsAlphabets
                } else {
                    encryptedText += ch; // If it's not an alphabet ( special character or space), keeping it unchanged in the result
                }
            }
            result = encryptedText; // Storing it in result, and starting the loop again with the encrypted text
        }
        return result;
    }

    // Method to DECRYPT
    public static String decryption(String text, int Ckey) {

        String result = text; // Initializing an empty string to store the result

        for (int k = 1; k <= Ckey; k++) { // Running the loop for "Desired key" times
            String decryptedText = "";

            for (int i = 0; i < result.length(); i++) { // Iterate through each character of the input
                char ch = result.charAt(i);

                int index = -1;
                for (int j = 0; j < subsAlphabets.length; j++) { // Find the index of that character in subsAlphabets
                    if (subsAlphabets[j] == ch) {
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    decryptedText += engAlphabets[index]; // Substitute with engAlphabets
                } else {
                    decryptedText += ch; // If it's not an alphabet ( special character or space), keeping it unchanged in the result
                }
            }
            result = decryptedText; // Storing it in result, and starting the loop again with the encrypted text
        }
        return result;
    }
}

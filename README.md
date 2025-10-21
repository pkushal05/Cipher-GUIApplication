# Cipher Encryption/Decryption GUI Application

A desktop application built with **Java Swing** that implements two classical cipher algorithms: **Substitution Cipher** and **Translation (Caesar) Cipher**. This project provides an intuitive graphical user interface for encrypting and decrypting text with customizable complexity keys.

---

## 📋 Table of Contents
- [Features](#-features)
- [Demo](#-demo)
- [Installation](#-installation)
- [Usage](#-usage)
- [Cipher Algorithms](#-cipher-algorithms)
- [Project Structure](#-project-structure)
- [Keyboard Shortcuts](#-keyboard-shortcuts)
- [Accessibility](#-accessibility)
- [Author](#-author)

---

## ✨ Features

- 🔐 **Dual Cipher Support**: Choose between Substitution and Translation (Caesar) ciphers
- 🎨 **Modern GUI**: Clean, intuitive interface built with Java Swing
- ⌨️ **Keyboard Shortcuts**: Alt+E (Encrypt), Alt+D (Decrypt), Alt+C (Clear), Alt+X/Escape (Exit)
- ✅ **Input Validation**: Comprehensive error handling for invalid inputs
- ♿ **AODA Compliant**: Accessible color scheme for users with visual impairments
- 🔄 **Multiple Encryption Passes**: Support for complexity keys in Substitution cipher
- 📝 **Text Area Support**: Handles multi-line text with word wrapping
- 💡 **Tooltips**: Helpful hints for all interactive elements
- 🧹 **Clear Functionality**: Reset all fields with one click

---

## 🎬 Demo

### Application Interface
The application features:
- **Input Area**: Enter text to encrypt or decrypt
- **Output Area**: View encrypted/decrypted results
- **Cipher Selection**: Radio buttons to choose between Substitution and Translation
- **Key Input**: Enter complexity key (Substitution) or shift value (Translation)
- **Action Buttons**: Encrypt, Decrypt, Clear, and Exit

---

## 🚀 Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or NetBeans) or command line

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/pkushal05/Cipher-GUI.git
   cd Cipher-GUI
   ```

2. **Compile the project**
   ```bash
   javac -d out src/*.java
   ```

3. **Run the application**
   ```bash
   java -cp out Main
   ```

### Using an IDE
1. Open the project in your IDE
2. Ensure `src` folder is marked as source root
3. Run `Main.java`

---

## 📖 Usage

### Encrypting Text
1. Enter your text in the **Input** area
2. Select cipher type (Substitution or Translation)
3. Enter a **positive key** value:
   - **Substitution**: Complexity key (number of encryption passes)
   - **Translation**: Shift value (number of positions to shift)
4. Click **Encrypt** or press **Alt+E**
5. View the encrypted text in the **Output** area

### Decrypting Text
1. Enter encrypted text in the **Input** area
2. Select the same cipher type used for encryption
3. Enter the key:
   - **Substitution**: Same positive key used for encryption
   - **Translation**: Negative of the encryption key (e.g., if encrypted with +3, decrypt with -3)
4. Click **Decrypt** or press **Alt+D**
5. View the decrypted text in the **Output** area

---

## 🔐 Cipher Algorithms

### 1. Substitution Cipher
A monoalphabetic substitution cipher using a custom alphabet mapping (COSC1200 cipher).

**Standard Alphabet:**
```
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
a b c d e f g h i j k l m n o p q r s t u v w x y z
```

**Substitution Alphabet:**
```
Y W L R A S K T E Z G M V H Q B X N C D I J F U O P
y w l r a s k t e z g m v h q b x n c d i j f u o p
```

**Complexity Key:** Determines how many times the substitution is applied. A key of 3 means the text is encrypted three times sequentially.

**Example:**
- Input: `HELLO`
- Key: `2`
- After 1st pass: `TAMMQ`
- After 2nd pass: `DYVVX` (Output)

### 2. Translation (Caesar) Cipher
A shift cipher that moves each letter by a fixed number of positions in the alphabet.

**How it works:**
- Each letter is shifted by the key value
- Wraps around at alphabet boundaries (Z → A, z → a)
- Positive key for encryption, negative key for decryption

**Example:**
- Input: `HELLO`
- Key: `+3`
- Output: `KHOOR`

To decrypt: Use key `-3`

---

## 📂 Project Structure

```
Project-GUI/
├── src/
│   ├── Main.java                    # Application entry point
│   ├── WindowStructure.java         # Main GUI implementation
│   ├── Substitution.java            # Substitution cipher logic
│   ├── Translation.java             # Translation cipher logic
│   └── AccessibleWindowTest.java    # Testing/prototype version
├── out/                             # Compiled classes
├── .idea/                           # IDE configuration
├── .gitignore
├── Project-GUI.iml
└── README.md
```

### Class Descriptions

- **Main.java**: Entry point that initializes and displays the GUI
- **WindowStructure.java**: Core GUI implementation with event handlers
- **Substitution.java**: Implements substitution cipher encryption/decryption
- **Translation.java**: Implements translation (Caesar) cipher
- **AccessibleWindowTest.java**: Simplified test version of the GUI

---

## ⌨️ Keyboard Shortcuts

| Shortcut | Action |
|----------|--------|
| `Alt + E` | Encrypt text |
| `Alt + D` | Decrypt text |
| `Alt + C` | Clear all fields |
| `Alt + X` | Exit application |
| `Escape` | Exit application (when focus is in input area) |

---

## ♿ Accessibility

This application follows **AODA (Accessibility for Ontarians with Disabilities Act)** guidelines:

- **High Contrast Colors**: Ensures readability for visually impaired users
- **Keyboard Navigation**: Full application control without mouse
- **Tooltips**: Descriptive hints for all interactive elements
- **Focus Management**: Clear visual indicators for focused elements
- **Screen Reader Friendly**: Proper component labeling

### Color Scheme
- Background: `#F0F4F8` (Light Blue-Gray)
- Text: `#0D1B2A` (Dark Navy)
- Buttons: `#1976D2` (Blue)
- Borders: `#90A4AE` (Gray)

---

## 🛠️ Technologies Used

- **Language**: Java
- **GUI Framework**: Swing
- **Layout**: Absolute positioning (setBounds)
- **IDE**: IntelliJ IDEA
- **Version Control**: Git

---

## 🐛 Error Handling

The application includes comprehensive error handling:

| Error | Description |
|-------|-------------|
| Empty Input | "Please enter a phrase to proceed" |
| Empty Key | "Please enter a key to proceed" |
| Invalid Key | "Please enter a valid key" (non-numeric) |
| Negative Key | "Please enter a positive key" (encryption) |
| Wrong Key Sign | Different validation for encryption vs decryption |

---

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 👤 Author

**Kushal Mayankbhai Patel**

- 💻 GitHub: [@pkushal05](https://github.com/pkushal05)
- 🔗 LinkedIn: [@kushalpatel07](https://linkedin.com/in/kushalpatel07)
- 📧 Email: pkushal1052@gmail.com

---

## 🙏 Acknowledgments

- Durham College - Computer Programming & Analysis Program
- Date: April 14, 2025

---

**Made with ☕ and Java**

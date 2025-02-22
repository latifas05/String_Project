# String Encryption/Decryption

## Project Overview

This Java project implements a **String Encryption/Decryption** system using the **Caesar Cipher** algorithm. The program allows users to encrypt and decrypt text, including handling input and output through files. The project demonstrates string manipulation techniques, encryption algorithms, and file handling in Java.

## Design Choices

- **Encryption Method:** 
  - The encryption uses the **Caesar Cipher** algorithm, where each letter of the input text is shifted by 3 positions. For example, 'A' becomes 'D', 'B' becomes 'E', and so on.
  - The algorithm handles both uppercase and lowercase letters, ensuring that the shift wraps around correctly. Non-alphabetic characters (such as punctuation marks) remain unchanged.
  
- **Decryption Method:**
  - The decryption reverses the encryption process by shifting the letters back by 3 positions, restoring the original text.

- **File Input/Output:** 
  - The program reads the input text from an **input.txt** file, encrypts it, and then saves the encrypted text to an **output.txt** file.
  - The encrypted text is then decrypted, and the original text is compared with the decrypted result to ensure correctness.

## Algorithms & Data Structures

- **Caesar Cipher Algorithm:**
  - Encrypt: For each letter, shift by 3 positions within the alphabet. Handle wrapping around using modulo operations.
  - Decrypt: Shift the letters back by 3 positions to restore the original text.
  
- **Data Structures:**
  - **StringBuilder** is used to construct the encrypted and decrypted strings efficiently.

## Challenges Encountered

- Handling non-alphabetic characters: The Caesar Cipher only affects letters, so special characters, spaces, and punctuation marks needed to be preserved during encryption and decryption.
- File handling: Ensuring that the program reads from and writes to text files correctly was essential for demonstrating file-based input/output processing.

## Improvements

- **File Handling Enhancement:** I improved the way files are read and written by using `Files.readAllBytes()` and `Files.write()` methods, ensuring the text is properly handled with UTF-8 encoding.
- **Code Organization:** I separated the encryption/decryption logic into a separate class (`StringEncryptionDecryption`) to keep the code modular and readable.

## File I/O Explanation

- **Input:** The program reads an input file (`input.txt`) from the resources folder. The content of this file is processed by the encryption method.
- **Output:** The encrypted content is written to an output file (`output.txt`). The program then reads this file and decrypts its content back to the original text, verifying the correctness of the encryption process.

## How to Run

1. Clone this repository to your local machine.
2. Place the `input.txt` file in the `src/test/resources/` folder.
3. Compile and run the `Main.java` file to see the encryption and decryption in action.
4. Check the `output.txt` file for the encrypted text, and verify the decrypted text printed in the console.

## Example Output

### Original Text:
```
Hello, World! This is a test.
```

### Encrypted Text:
```
Khoor, Zruog! Wklv lv d whvw.
```

### Decrypted Text:
```
Hello, World! This is a test.
```

## Unit Tests

The project includes a series of unit tests implemented using **JUnit** to validate the correctness of the encryption and decryption processes. These tests cover various cases, including:
- Normal text
- Empty strings
- Special characters
- Large text

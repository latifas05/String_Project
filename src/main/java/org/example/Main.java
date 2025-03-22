package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose encryption method: ");
        System.out.println("1. Caesar Cipher");
        System.out.println("2. Vigenère Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the text to encrypt/decrypt:");
        String text = scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter shift value:");
            int shift = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Choose action: ");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            int action = scanner.nextInt();
            scanner.nextLine();

            if (action == 1) {
                System.out.println("Encrypted text: " + CaesarCipher.encrypt(text, shift));
            } else {
                System.out.println("Decrypted text: " + CaesarCipher.decrypt(text, shift));
            }

        } else if (choice == 2) {
            System.out.println("Enter key for encryption/decryption:");
            String key = scanner.nextLine();

            System.out.println("Choose action: ");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            int action = scanner.nextInt();
            scanner.nextLine();

            if (action == 1) {
                System.out.println("Encrypted text: " + VigenereCipher.encrypt(text, key));
            } else {
                System.out.println("Decrypted text: " + VigenereCipher.decrypt(text, key));
            }
        }
        scanner.close();
    }
}

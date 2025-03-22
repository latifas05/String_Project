package org.example;

public class VigenereCipher {
    public static String encrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char k = key.charAt(keyIndex % key.length());
                int shift = Character.toUpperCase(k) - 'A';
                c = (char) ((c - base + shift) % 26 + base);
                keyIndex++;
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char k = key.charAt(keyIndex % key.length());
                int shift = Character.toUpperCase(k) - 'A';
                c = (char) ((c - base - shift + 26) % 26 + base);
                keyIndex++;
            }
            decryptedText.append(c);
        }
        return decryptedText.toString();
    }
}


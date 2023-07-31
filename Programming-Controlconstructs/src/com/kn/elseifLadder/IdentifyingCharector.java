package com.kn.elseifLadder;
import java.util.Scanner;
public class IdentifyingCharector {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        String characterType = identifyCharacterType(ch);
        System.out.println("The character '" + ch + "' is a " + characterType);
    }

    public static String identifyCharacterType(char ch) {
        if (isLowerVowel(ch)) {
            return "Lower-case vowel";
        } else if (isUpperVowel(ch)) {
            return "Upper-case vowel";
        } else if (isLowerConsonant(ch)) {
            return "Lower-case consonant";
        } else if (isUpperConsonant(ch)) {
            return "Upper-case consonant";
        } else if (Character.isDigit(ch)) {
            return "Digit";
        } else {
            return "Special character";
        }
    }
    
    public static boolean isLowerVowel(char ch) {
        String vowels = "aeiou";
        return Character.isLowerCase(ch) && vowels.indexOf(ch) != -1;
    }

    public static boolean isUpperVowel(char ch) {
        String vowels = "AEIOU";
        return Character.isUpperCase(ch) && vowels.indexOf(ch) != -1;
    }

    public static boolean isLowerConsonant(char ch) {
        return Character.isLowerCase(ch) && Character.isLetter(ch) && !isLowerVowel(ch);
    }

    public static boolean isUpperConsonant(char ch) {
        return Character.isUpperCase(ch) && Character.isLetter(ch) && !isUpperVowel(ch);
    }





}
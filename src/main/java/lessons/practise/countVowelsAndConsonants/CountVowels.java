package lessons.practise.countVowelsAndConsonants;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your line: ");
        String line = scanner.nextLine();

        int vowelCount = vowelsCount(line);
        int consonantCount = countConsonants(line);

        System.out.println("Vowels count: " + vowelCount);
        System.out.println("Consonants count: " + consonantCount);


//        word = word.toLowerCase();
//
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (Character.isLetter(ch)) {
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//
//        System.out.println("Vowels count: " + vowelCount);
//        System.out.println("Consonants count: " + consonantCount);
    }

    public static int vowelsCount(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isConsonant(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }
}

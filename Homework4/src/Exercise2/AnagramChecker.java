package Exercise2;

import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String a, String b) {
        int[] countA = countLetters(a);
        int[] countB = countLetters(b);

        for (int i = 0; i < 26; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        } return true;
    }

    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        s = s.toLowerCase().replaceAll("\\s+", "");
        for(char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        } return counts;
    }
    public static void printLetterCounts(String s){
        int[] counts = countLetters(s);
        for (int i = 0; i < 26; i++) {
            if(counts[0] > 0){
                System.out.println((char) ('a' + i) + ": " + counts[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        String word2 = scanner.nextLine();

        System.out.println("Anagrams? " + isAnagram(word1, word2));

        printLetterCounts(word1);
    }
}

package Arrays.easy;

import java.util.Set;
import java.util.TreeSet;

public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence));
        System.out.println(checkIfPangram2(sentence2));
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {

            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
                index = sentence.charAt(i) - 'A';

            else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                index = sentence.charAt(i) - 'a';
            else
                continue;
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
        return (true);
    }


    // Using Sets
    static boolean checkIfPangram2(String sentence) {
        if (sentence.length()<26)
            return false;
        Set<Character> uniques = new TreeSet<>();
        int count= 0;
        for (char ch: sentence.toCharArray()) {
            if (uniques.add(ch))
                count++;
            if (count>=26)
                return true;
        }
        return false;
    }


}

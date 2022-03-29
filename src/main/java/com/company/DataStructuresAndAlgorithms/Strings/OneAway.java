package com.company.DataStructuresAndAlgorithms.Strings;

import java.util.HashSet;

public class OneAway {
    public static boolean oneOperation(String word1, String word2) {
        HashSet<Character> set;
        if (word1.length() > word2.length()) {
            set = setter(word1);
            for (int i = 0; i < word2.length(); i++) {
                if (!set.contains(word2.charAt(i))) {
                    return false;
                }
            }

        } else if (word1.length() < word2.length()) {
            set = setter(word2);
            for (int i = 0; i < word1.length(); i++) {
                if (!set.contains(word1.charAt(i))) {
                    return false;
                }
            }
        } else if (word1.length() == word2.length()) {
            int count = 0;
            set = setter(word1);
            for (int i = 0; i < word2.length(); i++) {
                if (set.contains(word2.charAt(i))) {
                    count++;
                }
            }

            if (count + 1 == word1.length()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static HashSet<Character> setter(String word) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(oneOperation("pale", "bake"));
    }
}

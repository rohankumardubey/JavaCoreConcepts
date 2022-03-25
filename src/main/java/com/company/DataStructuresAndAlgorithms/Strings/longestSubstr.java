package com.company.DataStructuresAndAlgorithms.Strings;

import java.util.HashSet;

public class longestSubstr {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxVal=0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
              set.add(s.charAt(right));
              right++;
              maxVal=Math.max(maxVal,set.size());
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        longestSubstr sub = new longestSubstr();
        System.out.println(sub.lengthOfLongestSubstring("ABCDEFGABC"));
    }
}

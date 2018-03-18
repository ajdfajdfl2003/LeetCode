package com.angus.leetcode.LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public static Solution newInstance() {
        return new Solution();
    }

    public int lengthOfLongestSubstring(String s) {
        String result = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            String curr = String.valueOf(s.charAt(i));
            if (!temp.contains(curr)) {
                temp += curr;
            } else {
                temp = (temp.length() > 0 ? temp.substring(temp.indexOf(curr) + 1, temp.length()) : "") + curr;
            }
            if (temp.length() > result.length()) {
                result = temp;
            }
        }
        return result.length();
    }
}

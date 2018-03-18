package com.angus.leetcode.JewelsAndStones;

public class Solution {
    public static Solution newInstance() {
        return new Solution();
    }

    public int numJewelsInStones(String j, String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j.contains(String.valueOf(s.charAt(i)))) {
                result++;
            }
        }
        return result;
    }
}

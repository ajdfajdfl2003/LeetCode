package com.angus.leetcode.JewelsAndStones;

public class Solution {
    public static Solution newInstance() {
        return new Solution();
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                result++;
            }
        }
        return result;
    }
}

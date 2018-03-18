package com.angus.leetcode.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SolutionTest {
    @Test
    public void Given_pwwkew_Length_Should_Get3() {
        String s = "pwwkew";
        Solution target = Solution.newInstance();

        int actual = target.lengthOfLongestSubstring(s);

        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void Given_bbbbb_Length_Should_Get1() {
        String s = "bbbbb";
        Solution target = Solution.newInstance();

        int actual = target.lengthOfLongestSubstring(s);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void Given_abcabcbb_Length_Should_Get3() {
        String s = "abcabcbb";
        Solution target = Solution.newInstance();

        int actual = target.lengthOfLongestSubstring(s);

        assertThat(actual).isEqualTo(3);
    }
}

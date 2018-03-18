package com.angus.leetcode.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SolutionTest {
    @Test
    public void Given_abcabcbb_Length_Should_Get3() {
        String s = "abcabcbb";
        Solution target = Solution.newInstance();

        int actual = target.lengthOfLongestSubstring(s);

        assertThat(actual).isEqualTo(3);
    }
}

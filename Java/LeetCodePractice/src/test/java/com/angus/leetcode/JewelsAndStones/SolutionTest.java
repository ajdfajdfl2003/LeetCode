package com.angus.leetcode.JewelsAndStones;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        this.solution = Solution.newInstance();
    }

    @Test
    public void Given_z_ZZ_Should_Get0() {
        String J = "z";
        String S = "ZZ";

        int actual = this.solution.numJewelsInStones(J, S);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void Given_aA_aAAbbbb_Should_Get3() {
        String J = "aA";
        String S = "aAAbbbb";

        int actual = this.solution.numJewelsInStones(J, S);

        assertThat(actual).isEqualTo(3);
    }
}

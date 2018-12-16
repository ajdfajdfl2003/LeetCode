package com.angus.leetcode.UniqueEmailAddresses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test01() {
        String[] target = {"alice.z@leetcode.com", "alicez@leetcode.com"};

        Solution solution = new Solution();

        Assert.assertEquals(1, solution.numUniqueEmails(target));
    }

    @Test
    public void test02() {
        String[] target = {"alice.z@leetcode.com", "alicez@leet.code.com"};

        Solution solution = new Solution();

        Assert.assertEquals(2, solution.numUniqueEmails(target));
    }

    @Test
    public void test03() {
        String[] target = {"m.y+name@email.com", "my@email.com"};

        Solution solution = new Solution();

        Assert.assertEquals(1, solution.numUniqueEmails(target));
    }

    @Test
    public void test04() {
        String[] target = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        Solution solution = new Solution();

        Assert.assertEquals(2, solution.numUniqueEmails(target));
    }
}
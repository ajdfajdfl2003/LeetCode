package com.angus.leetcode.UniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] names = email.split("@");
            String domain = names[1];
            String local = names[0];
            int plusIndex = local.indexOf("+");
            if (-1 != plusIndex) {
                local = local.substring(0, plusIndex);
            }
            set.add(local.replace(".", "") + "@" + domain);
        }
        return set.size();
    }
}

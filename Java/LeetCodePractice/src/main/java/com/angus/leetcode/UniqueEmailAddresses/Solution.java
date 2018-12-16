package com.angus.leetcode.UniqueEmailAddresses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int numUniqueEmails(String[] emails) {
        List<String> result = new ArrayList<>();

        for (String email : emails) {
            String[] newEmails = email.split("@");
            String[] localNames = newEmails[0].split("[+]");
            email = localNames[0].replace(".", "") + newEmails[1];
            result.add(email);
        }

        return (int) result.stream().distinct().count();
    }
}

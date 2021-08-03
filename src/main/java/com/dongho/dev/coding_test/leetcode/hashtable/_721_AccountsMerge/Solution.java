package com.dongho.dev.coding_test.leetcode.hashtable._721_AccountsMerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    private List<String> getCandidateNameList(Map<String, Set<String>> mailMap, String name) {
        return mailMap.keySet().stream()
            .filter(key -> key.startsWith(name))
            .collect(Collectors.toList());
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {    
        Map<String, Set<String>> mailMap = new HashMap<>();
        int id = 0;

        for (List<String> account : accounts) {
            String name = account.get(0);
            List<String> mailList = account.subList(1, account.size());

            List<String> candidateNameList = getCandidateNameList(mailMap, name);

            if (candidateNameList.size() == 0) {
                String nameKey = name + "_" + id;
                mailMap.put(nameKey, mailList.stream().collect(Collectors.toSet()));
            } else {
                boolean hasMail = false;
                String matched = null;

                LOOP: for (String candidateName : candidateNameList) {
                    Set<String> existMailSet = mailMap.get(candidateName);
                    for (String mail : mailList) {
                        if (existMailSet.contains(mail)) {
                            hasMail = true;
                            matched = candidateName;
                            
                            break LOOP;
                        }
                    }
                }

                if (hasMail) {
                    Set<String> existMailSet = mailMap.get(matched);
                    existMailSet.addAll(mailList);
                    mailMap.put(matched, existMailSet);
                } else {
                    String nameKey = name + "_" + id;
                    mailMap.put(nameKey, mailList.stream().collect(Collectors.toSet()));
                }
            }
            id++;
        }

        List<List<String>> accountList = new ArrayList<>();
        for (String nameKey : mailMap.keySet()) {
            List<String> accountInfo = new ArrayList<>();
            accountInfo.add(nameKey.split("_")[0]);
            accountInfo.addAll(mailMap.get(nameKey).stream().sorted().collect(Collectors.toList()));
            accountList.add(accountInfo);
        }

        return accountList;
    }
}

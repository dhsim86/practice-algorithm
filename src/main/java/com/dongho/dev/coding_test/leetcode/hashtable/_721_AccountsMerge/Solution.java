package com.dongho.dev.coding_test.leetcode.hashtable._721_AccountsMerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    private List<Set<String>> merge(List<Set<String>> nameSetList, List<String> mailList) {
        List<Integer> idxList = new ArrayList<>();

        for (int i = 0; i < nameSetList.size(); i++) {
            Set<String> nameSet = nameSetList.get(i);          

            for (String mail : mailList) {
                if (nameSet.contains(mail)) {
                    idxList.add(i);
                    break;
                }
            }
        }

        Set<String> merged = new HashSet<>();
        for (Integer idx : idxList) {
            merged.addAll(nameSetList.get(idx));
        }
        merged.addAll(mailList);

        List<Set<String>> result = new ArrayList<>();
        result.add(merged);

        for (int i = 0; i < nameSetList.size(); i++) {
            if (idxList.contains(i) == false) {
                result.add(nameSetList.get(i));
            }
        }
        return result;
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {    
        Map<String, List<Set<String>>> mailMap = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            List<String> mailList = account.subList(1, account.size());

            if (mailMap.get(name) == null) {
                Set<String> nameSet = mailList.stream().collect(Collectors.toSet());
                List<Set<String>> nameSetList = new ArrayList<>();
                nameSetList.add(nameSet);
                mailMap.put(name, nameSetList);
            } else {
                List<Set<String>> nameSetList = mailMap.get(name);
                List<Set<String>> newNameSetList = merge(nameSetList, mailList);
                mailMap.put(name, newNameSetList);
            }
        }

        List<List<String>> accountList = new ArrayList<>();
        for (String name : mailMap.keySet()) {
            List<Set<String>> nameSetList = mailMap.get(name);

            for (Set<String> nameSet : nameSetList) {
                List<String> accountInfo = new ArrayList<>();
                accountInfo.add(name);
                accountInfo.addAll(nameSet.stream().sorted().collect(Collectors.toList()));
                accountList.add(accountInfo);
            }
        }

        return accountList;
    }
    
}

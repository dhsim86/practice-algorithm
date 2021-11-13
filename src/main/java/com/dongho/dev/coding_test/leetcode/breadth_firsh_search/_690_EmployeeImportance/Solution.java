package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._690_EmployeeImportance;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class Solution {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = employees.stream()
            .collect(Collectors.toMap(e -> e.id, e -> e));
        
        int sum = 0;

        List<Integer> subOrdinates = new LinkedList<>();
        subOrdinates.add(id);

        while(subOrdinates.isEmpty() == false) {
            Integer subid = subOrdinates.remove(0);
            Employee employee = map.get(subid);

            sum += employee.importance;
            subOrdinates.addAll(employee.subordinates);
        }

        return sum;
    }

}

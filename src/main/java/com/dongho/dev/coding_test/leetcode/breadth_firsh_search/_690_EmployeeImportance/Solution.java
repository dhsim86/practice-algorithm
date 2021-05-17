package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._690_EmployeeImportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class Solution {

    public Map<Integer, Employee> employeeMap;

    private int getImportance(Employee employee) {
        List<Integer> subordinates = employee.subordinates;
        int importance = 0;
        for (Integer subordinate : subordinates) {
            importance += getImportance(employeeMap.get(subordinate));
        }
        return importance + employee.importance;
    }
    
    public int getImportance(List<Employee> employees, int id) {
        if (employeeMap == null) {
            employeeMap = new HashMap<>();

            for (Employee employee : employees) {
                employeeMap.put(employee.id, employee);
            }
        }

        return getImportance(employeeMap.get(id));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsandsetslab;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

/**
 * Create a Set of Employee objects (use the Employee class from the “common”
 * package in the sample project) where there is at least one duplicate. Did the
 * duplicate get removed? Did your remember to override equals() and hashCode()?
 * Did you select one or more properties that uniquely identify an employee? If
 * not, do that now and then run your program again.
 *
 * @author David
 */
public class LabActivityFour {

    public static void main(String[] args) {

        // Creating Employee objects
        Employee emp1 = new Employee("Count", "Chocula", "123-45-6789");
        Employee emp2 = new Employee("Alexander", "Bell", "124-45-6789");
        Employee emp3 = new Employee("Steve", "McQueen", "123-45-6789");
        Employee emp4 = new Employee("James", "Dean", "125-45-6789");

        
        // creating a new set of employees
        Set<Employee> employees = new HashSet<>();
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        
        // run through employee set
        // Output should not contain Steve McQueen
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
    }

}

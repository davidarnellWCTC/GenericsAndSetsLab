package genericsandsetslab;

import java.util.*;

/**
 * Create a new List consisting of three Employee objects (use the Employee
 * class provided in the GenericsAndSets sample project under the “common”
 * package. Use generics to create your list. Now loop through the list (using
 * the new for-each style) and print out some meaningful information about each
 * object. Verify that no cast was necessary. Do you use toString()?
 *
 * @author David
 */
public class LabActivityTwo {

    public static void main(String[] args) {

        // Create arrayList for new employee objects
        // <type> is <Employee>
        List<Employee> employee = new ArrayList<>();

    //constructor for the Employee class, just for reference
        //Employee(String lastName, String firstName, String ssn)
        // Just testing to see if this method works
        // It does
        employee.add(new Employee("Arnell", "David", "123-45-6789"));

        // The employee class does not have an "equals" method for the ssn
        Employee emp1 = new Employee("Count", "Chocula", "123-45-6789");
        Employee emp2 = new Employee("Alexander", "Bell", "123-45-6789");
        Employee emp3 = new Employee("Steve", "McQueen", "123-45-6789");
        Employee emp4 = new Employee("James", "Dean", "123-45-6789");

        // The remainin Employee objects are added to the employee List
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);

        // Printin out the first names of each employee
        for (Employee emp : employee) {
            // toString added, don't need getFirstName()
            //System.out.println(emp.getFirstName());
            System.out.println(emp);
        }

        String empInfo = "";

        // The employee list is run through and the string values for the names and ssn
        // are added to the empInfo string and printed to the consol.
        // The Strings did not need to be cast.
        for (Employee emp : employee) {
            empInfo = emp.getFirstName() + " " + emp.getLastName() + "'s ssn is: "
                    + emp.getSsn();
            System.out.println(empInfo);
        }
    }

}

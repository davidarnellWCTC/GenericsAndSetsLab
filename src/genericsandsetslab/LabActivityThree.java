/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsandsetslab;

import java.util.*;

/**
 * . Create a new List consisting of one or more Employee objects, plus one or
 * more Dog objects (also from the common package). Do not use generics. Now
 * loop through the list and print out some meaningful information about each
 * object. What challenges does this present? How can you overcome these
 * challenges? Did you remember to override the toString() method in the
 * Employee and Dog classes? Did you call that method to output some meaningful
 * information? If not, do that now
 *
 * @author David
 */
public class LabActivityThree {

    public static void main(String[] args) {

        //List dogAndEmployeeObjects = new ArrayList();
        // the type does not need to be specified
        //List<Object> dogAndEmployeeObjects = new ArrayList<>();
        
        List dogAndEmployeeObjects = new ArrayList();

        
        // Creating new Emloyee Objects
        Employee emp1 = new Employee("Count", "Chocula", "123-45-6789");
        Employee emp2 = new Employee("Alexander", "Bell", "123-45-6789");
        Employee emp3 = new Employee("Steve", "McQueen", "123-45-6789");
        Employee emp4 = new Employee("James", "Dean", "123-45-6789");
        
        // Creating new Dog Objects
        // public Dog(String name, int rabiesId)
        Dog dog1 = new Dog("Fido", 12345);
        Dog dog2 = new Dog("Patches", 678900);
        Dog dog3 = new Dog("Spot", 11223);
        
        // Add each employee and dog object to the ArrayList
        dogAndEmployeeObjects.add(emp1);
        dogAndEmployeeObjects.add(emp2);
        dogAndEmployeeObjects.add(emp3);
        dogAndEmployeeObjects.add(emp4);
        dogAndEmployeeObjects.add(dog1);
        dogAndEmployeeObjects.add(dog2);
        dogAndEmployeeObjects.add(dog3);
        
        // Each of the dog and employee classes are Objects
        // Setting the for loop to loop through the Objects de of dogAndEmployeeObjects
        for(Object de: dogAndEmployeeObjects){
            System.out.println(de.toString());
        } 

    }

}


package genericsandsetslab;

import java.util.*;
import static jdk.nashorn.internal.objects.NativeString.substring;
/*
import java.util.ArrayList;
import java.util.List;
*/

/**
 *1. Using instructor sample project “GenericsAndSets” as a guide, create a List
(choose from Vector or ArrayList) of your favorite hobby items, where each
item is represented as a String value. Do not use generics. Populate the list
with at least three items. Then loop through the list and print out the contents
to the console. Don’t forget to cast items as your retrieve them for output.
Next, insert some new items, then run the loop again, showing that the items 
were indeed added. Now remove one or two items and run the loop again to
verify the removal worked.
2. Create a new List consisting 
 * @author David
 */
public class LabActivityOne {
    
    public static void main(String[] args) {
        
        // A list of type ArrayList is created to hold string objects
        List<String> hobbyItems = new ArrayList<>();
        hobbyItems.add("Wrenches");
        hobbyItems.add("Jack Stands");
        hobbyItems.add("Fasteners");
        hobbyItems.add("Pliers");
        
        
        // This for loop runs through each "item" in the hobbyItems list and pritns them
        // Each object is a String object but it still needs to be cast
        // EDIT: added the <String> to the list and item no longer needs to be cast
        for(String item: hobbyItems){
            System.out.println(item);
        }
        
        System.out.println("Adding three more items to the hobbyItems list");
        
        hobbyItems.add("Liquid Wrench");
        hobbyItems.add("Shop Stereo");
        hobbyItems.add("Wheel Ramps");
        
        for(String item: hobbyItems){
            System.out.println(item);
        }
        
        hobbyItems.remove(4);
        hobbyItems.remove(2);
        
        System.out.println("#4 and #2 removed");
        for(String item: hobbyItems){
            System.out.println(item);
        }
                
    }
    
    
    
}

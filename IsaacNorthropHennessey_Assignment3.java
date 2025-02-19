import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class IsaacNorthropHennessey_Assignment3 {
    public static void motorcycley(Scanner scnr, LinkedList<String> motorcycles) { // contains motorcycles
        System.out.println("How many motorcycles will be loaded on this maglev?");
        if (scnr.hasNextInt()) { // checks if first input is int
            Integer motorcount = scnr.nextInt(); // stores that num in var
            System.out.println("Please enter the next motorcycle to load:");
            for (int i = 0; i < motorcount; i++) { // collects motorcycles
                String bacon = scnr.next(); // stores all the motorcycles in bacon var
                motorcycles.add(bacon); // stores the motorcycles in linkedlist
            }
            System.out.println("Original list of motorcycles:"+ motorcycles);
        }
    }

    public static void checker(LinkedList<String> motorcycles) { // checks if linkedlist is null
        if (motorcycles.size() == 0) {
            System.out.println("Check if the above linked list is empty or not: true");
        } else {
            System.out.println("Check if the above linked list is empty or not: false");
        }
    }

    public static void unload(LinkedList<String> motorcycles) { // unloads
        int same = motorcycles.size(); // stores num of motorcycles
        for (int i = 0; i < same; i++) { // keeps counting up until size of LL
            motorcycles.poll(); // prints/removes the motorcycles
        }
        System.out.println("Linked list after unloading the motorcycles:"+ motorcycles);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // scnr is created
        LinkedList<String> motorcycles = new LinkedList<String>();
        motorcycley(scnr, motorcycles); // calls method to store the motorcycles
        checker(motorcycles); // checks if linkedlist is empty
        unload(motorcycles);
        checker(motorcycles);
    }
}

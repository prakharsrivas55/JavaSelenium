package mycodes;

import java.util.ArrayList;

public class ArrayListCode {

    public static void main(String args[]){

        //Define ArrayList
        ArrayList al= new ArrayList();
        // ArrayList <Integer> al= new ArrayList<Integer>();
        // ArrayList <String> al= new ArrayList<String>();

        //Add new elements in ArrayList
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al); //[100, Welcome, 15.5, A, true]

        //size();
        System.out.println("Size of array is- "+al.size()); //5

        //remove();
        al.remove(1);
        System.out.println("After removing element from arra y list- "+al); //Size of array is- 5

        //Insert a new element
        al.add(2, "Java");
        System.out.println("After insertion- "+al); //After insertion- [100, 15.5, Java, A, true]

        //retrieve specific element
        System.out.println(al.get(2)); // Java

        //replace specific element
        al.set(2,"Python");
        System.out.println(al); // [100, 15.5, Python, A, true]

        //Search and contains, return boolean values
        System.out.println(al.contains("Python")); //true
        System.out.println(al.contains("C++")); //false

        //isEmpty()
        System.out.println(al.isEmpty());

        //for loop
        for(int i=0;i<al.size();i++){
            // al.get(i);
            System.out.println(al.get(i));
        }

    }

    
}

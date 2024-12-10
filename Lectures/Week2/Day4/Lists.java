
/**
 * Lists are ordered collections. This means that we could access elements at a certain position of a list,
 * and lists are also allowed to contain duplicate values.
 *
 * We will be using lists quite a bit to store values. They will be the most common Collection we use, and you will
 * become familiar with them over time.
 */
import java.util.*;
public class Lists {
    /**
     * Instantiate and return a List of Integers.
     *
     * List<Integer> list = new List<>(); is not valid code.
     * Two interesting things here: First, List is actually an interface, not a class: its only ability is to define
     * potential behavior, but it does not provide implementation code.
     *  
     * Second, the <Integer> portion represents a Generic. Generics allow an object to contain any object of a certain
     * type, so we can create a List that contains Integers, Strings, or even other Lists. Why do we use Integer and
     * not int? Generics can only contain Objects, and not primitives, so we Integer because it is a Wrapper class,
     * the Object form of a primitive.
     *
     * A popular implementation of List is ArrayList. Look up how to instantiate one.
     */
    public List<Integer> createList(){//Instantiate and return a List of Integers, returning a List<Integer> object.
        List<Integer> list = new ArrayList<Integer>(6);
        return list;
    }
    public int getSize(List<Integer> list){//Get the size of a list.
        return list.size();
    }

    public void addToList(List<Integer> list, int value){//Add an item to a list.
        list.add(value);
    }

    /**
     * Get a particular index of a list.
     * Lists, like arrays, are zero-indexed, so they start counting at zero. For instance,
     *      index 0 of {1,3,5,7,9} is the value 1.
     *      index 1 of {1,3,5,7,9} is the value 3.
     *      index 2 of {1,3,5,7,9} is the value 5.
     *      index 3 of {1,3,5,7,9} is the value 7.
     * Index is the same as saying the position, number, etc of a value.
     * Let's get the element from a list at a certain index.
     *
     * @param list a List<Integer> object that we would like to examine.
     * @param index represents the index of the element we would like to retrieve.
     * @return the int value at the location in 'list' represented by 'index'.
     */
    public int get(List<Integer> list, int index){//Get a particular index of a list.
        return list.get(index);
    }
    public void removeFromList(List<Integer> list, int position){//Remove an index from a list.
        list.remove(position);
    }
    public void updateAtPosition(List<Integer> list, int position, int value){//Update an index of a list.
        list.set(position,value);
    }
    public static void main(String[] args) {
        Lists list = new Lists();
        List<Integer> myList = list.createList();
        list.addToList(myList, 1);
        list.addToList(myList, 2);
        list.addToList(myList, 3);
        list.addToList(myList, 4);
        list.addToList(myList, 5);
        System.out.println("Size: " + list.getSize(myList));
        System.out.println("Index 2: " + list.get(myList, 2));
        list.updateAtPosition(myList, 2, 6);
        System.out.println("Index 2 after update: " + list.get(myList, 2));
        list.removeFromList(myList, 2);
        System.out.println("Size after removal: " + list.getSize(myList));
    }
}
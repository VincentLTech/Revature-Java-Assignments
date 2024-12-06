/**
 * Notice that we are IMPLEMENTING the comparable interface, for type of ObjectToBeCompared.
 * This means that we must implement a method compareTo, otherwise the code will not compile. This compareTo method
 * was first defined in the Comparable interface, which is provided by Java by default, but is also duplicated in the
 * Comparable.java file for your viewing.
 *
 * We leverage compareTo and other functional interfaces because we may need to guarantee that an object is mutually
 * understood as exhibiting Comparable behavior if we are heavily leveraging OOP and generics. If we are creating a
 * data structure that can store any type of object, but must also sort them, we must guarantee that the objects are
 * capable of being sorted and provide a mutually understood method to compare them - compareTo.
 * Implementing an interface can be referred to as a contractual guarantee that a class will exhibit some behavior.
 *
 * You can read more about interfaces here: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 *
 * For this challenge, you should finish the implementation of Comparable by completing the implementation of
 * the compareTo method.
 */

 public class Interfaces implements Comparable<Interfaces>{
    int val;
    /**
     * TODO: implement compareTo for this class
     *
     * CompareTo should return a negative value if this object's 'val' is less than another object's 'val',
     * and positive otherwise. If 'val' is equal for both objects, return 0.
     *
     * @param other another object of type SampleClassC, which we are comparing to 'this' object.
     */
    public int compareTo(Interfaces other) {
        if(val>other.val){
            return 1;
        }
        else if(other.val>val){
            return -1;
        }
        else{
            return 0;
        }
    }

}


/**
 * Interfaces contain methods without bodies, and classes which implement the interfaces must implement those methods.
 * Notice how this interface has a signature for a method, but it doesn't have a body (it ends with a semicolon
 * rather than curly braces.) The method body will be written by the implementing class - in this example, SampleClassC.
 * Implementing an interface can be referred to as a contractual guarantee that a class will exhibit some behavior.
 *
 * You can implement multiple interfaces, but you cannot extend multiple classes.
 *
 * You do not need to change anything in this class, it exists to show off what a Java interface looks like.
 *
 * You can read more about interfaces here: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 *
 * @param <T> the Object that the class that implements this interface will be compared to (usually we write
 *           the class's own name, as we typically compare objects to other objects of the same type.)
 */
interface Comparable<T> {

    int compareTo(T data);

}
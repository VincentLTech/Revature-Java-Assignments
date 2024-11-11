
/**
 * This Dog class represents the behavior of a generic dog that can make a Woof noise. Do not change
 * anything in this class, the test cases rely on the current implementation. Go see the Shiba class.
 */
public class Dog {
    public String sound(){
        return "Woof";
    }

}
/**
 * Notice that the class Shiba extends Dog. This means that it inherits all the behavior of Dog, which at the current
 * moment is a single method called sound() that returns "Woof".
 *
 * Your task here is to override the sound() method that Shiba inherits from dog.
 * It does not matter what you overwrite it to, so long as sound() returns anything other than Woof,
 * to make Shibas unique.
 *
 * You could override sound() with a method like
 * public String sound(){
 *     //code here
 * }
 * and the inherited sound() method will be overriden automatically.
 *
 * The only requirement to pass the tests is to override the sound() method in this class.
 */
public class Shiba extends Dog{

    public String sound(){
        return "Roff";
    }

}
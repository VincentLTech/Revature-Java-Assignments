
public class Instantiation {
    /**
     * Java relies very heavily on OOP, so all of our code will rely on Objects. Before we write our own objects,
     * let's first look into how we can leverage them in our code. Every test, for instance, has to first create an
     * object before it runs the code contained within. Let's do something similar here.
     *
     * Instantiate any object using the 'new' keyword.
     * It doesn't matter what type of object you use.
     * If you're not feeling creative, you can use the Object class.
     *
     * Example:
     *      Type reference = new Type();
     *      return reference;
     *
     * Note: Null is a special type which represents the absence of an object.
     *
     * @return any object.
     */
    public Object instantiateANewObject(){
        Instantiation reference = new Instantiation();
        return reference;
    }
    
    public static void main(String[] args) {
        Instantiation obj = new Instantiation();
        System.out.println(obj.instantiateANewObject());
        // This will print: Instantiation@7852e922
    }
}
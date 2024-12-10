
public class Exceptions{
    
    public void mustThrow() throws Exception {
        throw new Exception("it does not work");
    }
    public static void main(String[] args) {
        Exceptions e = new Exceptions();
        try {
            e.mustThrow();
        } catch (Exception ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}

class CompileErrorExample {
    public static void main(String[] args) {
        // Creating a final variable. 
        // final means the variable cannot be changed to another value later.
        final int x = 10;
        x = 20; // attempting to reassign the variable x which is final will cause a compile-time error
    }
}
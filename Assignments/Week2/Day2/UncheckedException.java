
public class UncheckedException {
    /**
     * This method must throw an unchecked exception.
     * unchecked means that you do not need to wrap the method in a try/catch or a throws declaration.
     * Unchecked exceptions may include situations like arithmetic errors like dividing by zero,
     * accessing an index of an array which is out of bounds, stack overflow (result of infinite recursion), etc.
     *
     * For this challenge, I recommend creatively causing such an exception rather than using the 'throws' keyword,
     * which would also work since RuntimeExceptions are still technically Exceptions.
     *
     * Notice that errors are separate from exceptions. Errors are external to Java and can occur when some external
     * event happens, like running out of computer memory.
     */
    public void throwUncheckedException(){
        int num[] = {1, 2, 3, 4};
        System.out.println(num[5]);//literally create a method that is completely impossible

    }
    public static void main(String[] args) {
        UncheckedException u = new UncheckedException();
        u.throwUncheckedException();
        // This will not compile because throwUncheckedException is not declared as a method in UncheckedException class.
    }
}
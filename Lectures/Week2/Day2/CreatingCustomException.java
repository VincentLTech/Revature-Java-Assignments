
public class CreatingCustomException {

    public void throwCustomException() throws CustomException{
        throw new CustomException();
    }
    public static void main(String[] args) {
        CreatingCustomException ce = new CreatingCustomException();
        try {
            ce.throwCustomException();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
// CustomException.java
class CustomException extends Exception{
}
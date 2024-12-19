public class Public {

  public int myVariable = 10; 

  public void myMethod() {
      System.out.println("This is a public method.");
  }
}
class Main {
  public static void main(String[] args) {
    Public obj = new Public();
    obj.myVariable = 20;
    System.out.println(obj.myVariable); // Output: 20
  }
}
public class StaticKeyword {
    public void changeClassVar(String in){
        Class.global_var= in;
    }
    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword();
        obj.changeClassVar("new value");
        System.out.println(Class.global_var); // should print: new value
    }
}
class Class {
    static String global_var = "this variable is static";
}
class Static1{
  // static method
  static void m1(){
    System.out.println("from m1");
  }
  public static void main(String[] args){
    m1();
  }
}
class Static2{
    // static variable
    static int a = 10;
    static int b;
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String[] args){
       System.out.println("from main");
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
    }
}

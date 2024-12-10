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
class Test{
  // static method
  static void m1(){
    System.out.println("from m1");
  }
  public static void main(String[] args){
    m1();
  }
}
class Class {
    static String global_var = "this variable is static";
}
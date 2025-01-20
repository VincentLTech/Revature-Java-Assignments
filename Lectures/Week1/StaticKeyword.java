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

// Java program to demonstrate execution
// of static blocks and variables
  
class Static3{
    // static variable
    static int a = m1();
      
    // static block
    static {
        System.out.println("Inside static block");
    }
      
    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
      
    // static method(main !!)
    public static void main(String[] args){
       System.out.println("Value of a : "+a);
       System.out.println("from main");
    }
}
/* 
class Static4{
    // static variable
    static int a = 10;
      
    // instance variable
    int b = 20;
      
    // static method
    static void m1(){
        a = 20;
        System.out.println("from m1");
          
         // Cannot make a static reference to the non-static field b
         b = 10; // compilation error
                  
         // Cannot make a static reference to the 
                 // non-static method m2() from the type Test
         m2();  // compilation error
           
         //  Cannot use super in a static context
         System.out.println(super.a); // compiler error 
    }
      
    // instance method
    void m2(){    
        System.out.println("from m2");
    }
    public static void main(String[] args){
        // main method 
    }
}
    */
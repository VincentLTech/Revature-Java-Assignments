public class EntitiesofJava{
    public String copy(String text){
        return text;
    }
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static int sum2(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodParameters mp = new MethodParameters();
        String str = mp.copy("hello");
        System.out.println(str);
        String str2 = mp.copy("hello2");
        // String str = mp.copy("hello3"); this won't work 
        System.out.println(str2);
        sum(1,2);
        int result = sum2(3,4);
        System.out.println(result);
        System.out.println(sum2(5,6));

        Dog max = new Dog();
        String dogBarking = max.bark(); 
        System.out.println(dogBarking);
    }
}

class Dog {
    int age;
  
    String bark() {
      return "WOOF!";
    }
}
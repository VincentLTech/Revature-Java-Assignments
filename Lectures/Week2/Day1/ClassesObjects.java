
public class ClassesObjects {
    public Object instantiateANewObject(){
        ClassesObjects reference = new ClassesObjects();
        return reference;
    }
    public static void main(String[] args) {
        ClassesObjects obj = new ClassesObjects();
        System.out.println(obj.instantiateANewObject());
        // This will print: Instantiation@7852e922
    }
}

class Greeter{
    public void sayHello(){
        System.out.println("Hello, World!");
    }
}
// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.
class HelloApp{
    public static void main(String[] args){
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();
    }
}
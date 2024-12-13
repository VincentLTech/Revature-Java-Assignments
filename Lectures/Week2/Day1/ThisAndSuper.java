public class ThisAndSuper{
    public static void main(String[] args) {
        Child child = new Child();
        child.displayInChild();
    }
}
class Parent {
    public void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    // Using 'super' to call the parent class method
    public void displayInChild() {
        super.display();
        System.out.println("Child class");
    }
}

class MyClass {
    private int value;
    // Constructor using 'this'
    public MyClass(int value) {
        this.value = value;
    }
    // Method using 'this'
    public void printValue() {
        System.out.println("Value: " + this.value);
    }
}
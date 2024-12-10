public class Overriding {
    public static void main(String[] args) {
        Shiba shiba = new Shiba();
        System.out.println("Expected output: Anything other than 'Woof' (because the 'sound' method is supposed to be overridden)");
        System.out.println("Actual Output: " + shiba.sound());
        Dog dog = new Dog();
        System.out.println(dog.sound() + " (Dog's sound)");
        Dog shibaDog = new Shiba();
        System.out.println(shibaDog.sound() + " (Dog's sound)");
    }
}
//This Dog class represents the behavior of a generic dog that can make a Woof noise.
class Dog {
    public String sound(){
        return "Woof";
    }
}
//class Shiba extends Dog. This means that it inherits all the behavior of Dog, which at the current moment is a single method called sound() that returns "Woof".
class Shiba extends Dog{//override the sound() method that Shiba inherits from dog. And the inherited sound() method will be overriden automatically.
    public String sound(){
        return "Roff";
    }

}


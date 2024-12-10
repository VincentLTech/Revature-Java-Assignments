
public class EvenOrOdd {//@return a String "Even" if n is even, and "Odd" of in is odd. The test cases are case-sensitive.
    public String decide(int n){
        if(n%2==1||n%2==-1){
            return "Odd";
        }
        else if(n%2==0){
            return "Even";
        }
        else{
            return "I am Happy, I think";
        }
    }
    public static void main(String[] args) {
        EvenOrOdd ab = new EvenOrOdd();
        System.out.println(ab.decide(3)); // prints: Odd
        System.out.println(ab.decide(4)); // prints: Even
        System.out.println(ab.decide(5)); // prints: Odd
        System.out.println(ab.decide(6)); // prints: Even
        System.out.println(ab.decide(7)); // prints: Odd
        System.out.println(ab.decide(8)); // prints: Even
        System.out.println(ab.decide(9)); // prints: Odd
        System.out.println(ab.decide(10)); // prints: Even
        System.out.println(ab.decide(-3)); // prints: Odd
        System.out.println(ab.decide(-4)); // prints: Even
    }
}
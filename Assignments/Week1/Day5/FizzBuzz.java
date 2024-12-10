
public class FizzBuzz{
    public String FizzBuzzGen(int n){//Return "Fizz" if a number n is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
        if(n%15==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        else{
            return "";
        }
    }
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 1; i <= 30; i++){
            System.out.println(i+". "+fizzBuzz.FizzBuzzGen(i));
        }
    }
}
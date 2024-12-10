
public class GreaterOrLesser {
    public String decide(int a, int b){//@return  If a is less than b, return the string "Lesser". if a is greater than b, return "Greater". neither is true, return "Equal". This problem is case-sensitive!
        if(a>b){
            return "Greater";
        }
        else if(b>a){
            return "Lesser";
        }
        else{
            return "Equal";
        }
    }
    public static void main(String[] args) {
        GreaterOrLesser gol = new GreaterOrLesser();
        System.out.println(gol.decide(5, 3));
        System.out.println(gol.decide(3, 5));
        System.out.println(gol.decide(3, 3));
    }
}
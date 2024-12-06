
/**
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators - eg, 'return !b;'
 */
public class Boolean {
    // return if b is true, return true. if b is false, return false.
    public static boolean returnBoolean(boolean b){
        return b;
    }
    //return if b is true, return false. if b is false, return true.
    public static boolean returnNot(boolean b){
        return !b;
    }
    //return true if both b1 and b2 are true. false otherwise.
    public static boolean returnAnd(boolean b1, boolean b2){
        return b1&&b2;
    }
    //return true if either b1 or b2 are true. false if both are false.
    public static boolean returnOr(boolean b1, boolean b2){
        return b1||b2;
    }
    public static void main(String[] args) {
        boolean b =true;
        boolean b1 =true;
        boolean b2 =false;

        System.out.println(returnBoolean(b));//true
        System.out.println(returnNot(b));//false
        System.out.println(returnAnd(b1, b2));//false
        System.out.println(returnOr(b1, b2));//true
    }

}
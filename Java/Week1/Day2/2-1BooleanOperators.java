
/**
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators - eg, 'return !b;'
 */
public class Lab {
    // return if b is true, return true. if b is false, return false.
    public boolean returnBoolean(boolean b){
        return b;
    }
    //return if b is true, return false. if b is false, return true.
    public boolean returnNot(boolean b){
        return !b;
    }
    //return true if both b1 and b2 are true. false otherwise.
    public boolean returnAnd(boolean b1, boolean b2){
        return b1&&b2;
    }
    //return true if either b1 or b2 are true. false if both are false.
    public boolean returnOr(boolean b1, boolean b2){
        return b1||b2;
    }
    public static void main(String[] args) {
        boolean b =true;
        boolean b1 =true;
        boolean b2 =false;

        returnBoolean(b)
        returnNot(b)
        returnAnd(b1, b2)
        returnOr(b1, b2)
    }

}
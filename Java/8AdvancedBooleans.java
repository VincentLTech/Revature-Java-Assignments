public class 8AdvancedBooleanLogic {
    /**
     * NOT BOTH b1 AND b2
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return false if b1 and b2 are both true. Otherwise, return true.
     */
    public boolean returnNotBoth(boolean b1, boolean b2){
        if(b1==true && b2==true){
            return false;
        }
        return true;
    }
    /**
     * b1 OR b2, BUT NOT BOTH
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return true if either b1 or b2 is true, but false if they are both true or both false.
     */
    public boolean returnExclusiveOr(boolean b1, boolean b2){
        if(b1==true && b2==true){
            return false;
        }
        else if(b1==false && b2==false){
            return false;
        }
        else if(b1==true||b2==true){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Neither b1 NOR b2
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return true if neither b1 nor b2 are true. Return false if either b1 or b2 is true.
     */
    public boolean returnNeitherNor(boolean b1, boolean b2){
        if(b1==true || b2==true){
            return false;
        }
        return true;
    }
}
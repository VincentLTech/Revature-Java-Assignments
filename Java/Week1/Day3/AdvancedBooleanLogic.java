public class AdvancedBooleanLogic {
    public boolean returnNotBoth(boolean b1, boolean b2){//@return false if b1 and b2 are both true. Otherwise, return true.
        return !(b1&&b2);
    }
    public boolean returnExclusiveOr(boolean b1, boolean b2){//@return true if either b1 or b2 is true, but false if they are both true or both false.
        return !(b1==b2);
    }
    public boolean returnNeitherNor(boolean b1, boolean b2){//@return true if neither b1 nor b2 are true. Return false if either b1 or b2 is true.
        return !(b1||b2);
    }
    public static void main(String[] args) {
        AdvancedBooleanLogic abl = new AdvancedBooleanLogic();
        System.out.println(abl.returnNotBoth(true, false));
        System.out.println(abl.returnExclusiveOr(true, false));
        System.out.println(abl.returnNeitherNor(true, false));
        System.out.println(abl.returnNeitherNor(false, false));
    }
}
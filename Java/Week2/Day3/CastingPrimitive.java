// * If you try to just return d without changes, the method will not compile because d needs to be converted to an int first to reflect the int return type.
public class CastingPrimitive {
    public int castToInt(double d){//@return the int form of d.
        int value = (int)d;
        return value;
    }
    public static void main(String[] args) {
        CastingPrimitive castingPrimitive = new CastingPrimitive();
        System.out.println(castingPrimitive.castToInt(3.9)); //prints 3
        System.out.println((int)3.14);//prints 3
        System.out.println((double)3);//prints 3.0
    }
}
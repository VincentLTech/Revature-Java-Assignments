public class Comparisons{
    public static boolean isEqual(int a, int b){
        return a==b;
    }
    public static boolean greaterThan(int a, int b){
        return a>b;
    }
    public static boolean lessThan(int a, int b){
        return a<b;
    }
    public static boolean greaterThanOrEqualTo(int a, int b){
        return a>=b;
    }
    public static boolean lessThanOrEqualTo(int a, int b){
        return a<=b;
    }
    public static boolean notEqualTo(int a, int b){
        return a!=b;
    }
    public static void main(String[] args){
        int a= 10;
        int b =5;
        System.out.println(isEqual(a, b));
        System.out.println(greaterThan(a, b));
        System.out.println(lessThan(a, b));
        System.out.println(greaterThanOrEqualTo(a, b));
        System.out.println(lessThanOrEqualTo(a, b));
        System.out.println(notEqualTo(a, b));
    }
}
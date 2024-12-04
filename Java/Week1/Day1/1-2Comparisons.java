public class 2Comparisons{
    public boolean isEqual(int a, int b){
        return a==b;
    }
    public boolean greaterThan(int a, int b){
        return a>b;
    }
    public boolean lessThan(int a, int b){
        return a<b;
    }
    public boolean greaterThanOrEqualTo(int a, int b){
        return a>=b;
    }
    public boolean lessThanOrEqualTo(int a, int b){
        return a<=b;
    }
    public boolean notEqualTo(int a, int b){
        return a!=b;
    }
    public static void main(String[] args){
        int a= 10;
        int b =5;
        Sytem.out.println(isEqual(a, b));
        Sytem.out.println(greaterThan(a, b));
        Sytem.out.println(lessThan(a, b));
        Sytem.out.println(greaterThanOrEqualTo(a, b));
        Sytem.out.println(lessThanOrEqualTo(a, b));
        Sytem.out.println(notEqualTo(a, b));
    }
}
public class Casting {
    public static void main(String[] args) {
        long a = 10393L;
        int i = (int)a;
        System.out.println(i); // Outputs: 10393


        //initial values
        int j = 200;
        //cast to a short
        short s = (short) j;
        System.out.println(s); //output of s will b 200
        //cast to a double
        double d = (double) j;
        System.out.println(d); //output is 200.0
        //cast to a byte
        byte b = (byte)j;
        System.out.println(b);

    }
}
class AutomaticCasting {
    public static void main(String[] args){
      int n = 10;
      double d = n; //This is now converted from an int to a double.
      System.out.println(d);
    }
}

class ExplicitCasting {
    public static void main(String[] args){
    //   short s = 150;
    //   byte b = s; 
      // this will not compile without an explicit cast 
      // and in this case, even with an explicit cast, there will be data loss
      // as bytes can only hold values up to 127
      // b would actually hold the value -106 here
    }
}

class ExplicitCasting2 {
    public static void main(String[] args){
        //   float f = 10.23f;
        //   int i = f; 
          // this wil also not compile without an explicit cast 
          // although floats and ints are both represented in memory with 32 bits, floats can hold decimal values while ints cannot
          // we can explicitly cast these values, but we lose .23
          // i holds the value 10
    }  
}
import java.util.*;

public class Wrapper {
    public static void main(String[] args) {
        int n = 5; // We start by declaring an int for a primitive type.
        someMethod(n); // autoboxing is done here to wrap the Integer class around int n.
        // 8
      }
      
      public static void someMethod(Integer i) {
        System.out.println(i + 3);
      }
}
class ByteWrapping{
	public static void main(String args[]){
		// byte data type
		byte a = 1;
		// wrapping around Byte object
		Byte byteobj = new Byte(a);
		System.out.println("Byte object byteobj: " + byteobj);
		byte bv = byteobj;
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
	}
}
class WrappingUnwrapping{
	public static void main(String args[]){
		byte a = 1;// byte data type
		Byte byteobj = new Byte(a);// wrapping around Byte object

		int b = 10;// int data type
		Integer intobj = new Integer(b);//wrapping around Integer object

		float c = 18.6f;// float data type
		Float floatobj = new Float(c);// wrapping around Float object

		double d = 250.5;// double data type
		Double doubleobj = new Double(d);// Wrapping around Double object

		char e='a';// char data type
		Character charobj=e;// wrapping around Character object

		// printing the values from objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object byteobj: " + byteobj);
		System.out.println("Integer object intobj: " + intobj);
		System.out.println("Float object floatobj: " + floatobj);
		System.out.println("Double object doubleobj: " + doubleobj);
		System.out.println("Character object charobj: " + charobj);

		// objects to data types (retrieving data types from objects)
		// unwrapping objects to primitive data types
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;

		// printing the values from data types
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("char value, cv: " + cv);

		// More about using Wrapper classes
		Integer i3 = 5000; // autoboxing
		Integer i4 = 5000; // autoboxing
		
		// i3 and i4 are both reference variables
		// In other words, their values are the memory addresses of the objects they are referring to
		// They are pointing to 2 different objects, and therefore, i3 == i4 will be false
		System.out.println("i3 == i4: " + (i3 == i4));
		
		/*
		 * If you have 2 reference variables, and you use == operator, then if they are pointing to
		 * 2 different objects, it will evaluate to false
		 */
		
		// .equals() is a method that can be used for comparing the internal values of 2 objects
		System.out.println("i3.equals(i4): " + i3.equals(i4)); // both objects have the same internal value
		
		/*
		 * The wrapper classes contain a lot of useful static methods that you can utilize
		 * They also contain various constants defined statically
		 */
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// There are also methods to convert a String into its corresponding primitive value
		int age = Integer.parseInt("75"); // take the string "75" and give an int 75
		
		// Collections such as ArrayList can only deal with non-primitive types
		// for example, cannot store int primitives, only Integer objects
		ArrayList<Integer> myInts = new ArrayList<>();
		myInts.add(10);
		myInts.add(1000);
	}
}























class Autoboxing{
	public static void main(String[] args){
		char ch = 'a';
		// Autoboxing- primitive to Character object conversion
		Character a = ch;
        System.out.println(a);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Here, autoboxing of the int 25 takes place because arrayList only stores Integer objects.
		arrayList.add(25);

		// printing the values from object
		System.out.println(arrayList.get(0));
	}
}

class Unboxing2{
	public static void main(String[] args){
		Character cha = 'b';
		// unboxing - Character object to primitive conversion
		char b = cha;
        System.out.println(b);

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(24);

		// unboxing because get method returns an Integer object
		int num2 = arrayList2.get(0);

		// printing the values from primitive data types
		System.out.println(num2);
	}
}
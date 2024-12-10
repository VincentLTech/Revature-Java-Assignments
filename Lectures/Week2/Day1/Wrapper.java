import java.util.ArrayList;

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
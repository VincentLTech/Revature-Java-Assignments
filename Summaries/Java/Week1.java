package Summaries.Java;

public class Week1 {
    
}
class HelloWorld{
    public static String sayHello(){
        return "Hello, world!";
    }
    public static void main(String[] args){
        System.out.println(sayHello());
    }
}


class Array {

    public static void main(String[] args){
        // Array of integers
        int[] arr = new int[5];

        System.out.println("arr size: " + arr.length);
        int[] numbers = {0,1,2,3,4};
        System.out.println("numbers size: " +numbers.length);
        System.out.println("Index 0: " +numbers[0]);
        System.out.println("Index 4: " +numbers[4]);

        int[] input3 = {9,3,7,3,6};
        input3[2]=2;

        // Iterating over an array of strings with enhanced for loop
        for (int number : input3) {
            System.out.println("Iterate " + number);
        }
        // Iterating over an array of integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int[] intArray = new int[3];
        System.out.println("Array Memory Address: "+ intArray);
    }
}
class Methods {
    public static double calculateArea(double triangleBase, double triangleHeight){
      double area = triangleBase * triangleHeight;
      area = area / 2;
      return area;
    }
    public static void main(String[] args) {
      double area = calculateArea(3.5, 7.0);
      System.out.println("The area of the triangle 1 is " + area);
      area = calculateArea(4.0, 10.0);
      System.out.println("The area of the triangle 2 is " + area);
      area = calculateArea(12.0, 3.0);
      System.out.println("The area of the triangle 3 is " + area);
    }
  }

  class PrimitiveValues {
    public static void main(String[] args) {
        //boolean datatype (true or false)
        boolean bool = true;//1-bit size
        //byte datatype (whole number between -128 to 127)
        byte b = 127;//1 byte (8 bits)
        //char datatype (1 character)
        char c1 = 'B'; //2 bytes (16 bits)
        //short datatype (whole number between -32,768 to 32,767)
        short s = 32767; //2 bytes (16 bits)
        //int datatype (whole number between -2,147,483,648 to 2,147,483,647)
        int i = 2147483647;//4 bytes (32 bits)	
        //float datatype (floating point numbers (less accurate))
        float f = 1.234F;//4 bytes (32 bits)	
        //long datatype (whole number between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long l = 9223372036854775807L; //8 bytes (64 bits)	
        //double datatype (floating point numbers (more accurate))
        double d = 1.234;//8 bytes (64 bits)

        System.out.println(bool);
        System.out.println(b);
        System.out.println(c1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
    }
}
class ArithmeticOperators{  
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  
    }
} 

class ComparisonsOperators{
    public static void main(String[] args){
        int a= 10;
        int b =5;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
    }
}

class UnaryOperators {
    public static void main(String[] args) {
        int num = 10;
        // Increment operator
        System.out.println("Increment: " + num++);//10 (11) 
        
        // Decrement operator
        System.out.println("Decrement: " + num--);//11 (10)  
        
        // Increment operator
        System.out.println("Increment: " + ++num);//11
        
        // Decrement operator
        System.out.println("Decrement: " + --num);//10
        
        // Unary negation operator
        System.out.println("Negation: " + -num);
        
        // Bitwise NOT operator
        System.out.println("Bitwise NOT: " + ~num);
        
        // Logical NOT operator
        System.out.println("Logical NOT: " +!true);
    }
}

class StringBasics {

    public static void concatingString(String str1, String str2){
        String newStr = str1.concat(str2); // value in the variable "newStr" will be "Revature"
        System.out.println("Concatenated string: " + newStr);//Revature
    }
    public static void checkIfEqual(String word1, String word2){
        //In this example, because we used literal notation, Java first created a String that has the character sequence “hello” in the String Pool and assigned it to the reference variable word1. Then, Java reused the same String object by having the reference variable word2 point to it. In this case, using either equals() or the equality operator would return true, since the same object is being referenced.
        //So always just use the equals() method when comparing two String objects.
        System.out.println(word1 == word2); // true
        System.out.println(word1.equals(word2)); // true

        String word3 = new String("hello");
        String word4 = new String("hello");
        System.out.println(word3 == word4); // false, because the equality operator is used to check whether the values within the reference variables are the same.
        System.out.println(word3.equals(word4)); // true, because the equals() method to check if the two objects are equivalent (have the same characters)
    }
    public static void changeCase(String word){
        System.out.println("Change to uppercase " + word.toUpperCase());//value in the variable "uppercase" will be "GOODDAY"
        System.out.println("Change to lowercase " + word.toLowerCase());//value in the variable "uppercase" will be "goodday"
    }
    public static void characterLocation(){
        //You need to know this
        String str = "Revature";
        System.out.println("Character at index 0: " + str.charAt(0));// value in the variable character will be 'v'
    }
    public static void checkIfEqualIgnoringCapitals(String word1, String word2){
        System.out.println("Are the strings equal from the equalsIgnoreCase()? " + word1.equalsIgnoreCase(word2));//true 
    }
    public static void stringLength(String word){
        System.out.println("Length of the string: " + word.length());// Output: Length of the string: 9, spaces are counted as characters.
    }
    public static void replaceCharacterWithSomethingElse(String word){
        System.out.println("Replaced string: " + word.replace('*', ' ')); //Bitter black coffee sure is for long days
    }
    public static void removeAllSpaces(String word){
        System.out.println("Trimmed string: " + word.trim()); //Revature      1
    }
    public static void checkIfContainsCharacter(String word1, String word2, String word3){//"potatoes","vanilla","invitev"
        System.out.println(word1.indexOf('v')); // will return -1 because 'v' is not in the string "potatoes"
        System.out.println(word2.indexOf('v')); // will return 0
        System.out.println(word3.indexOf('v')); // will return 2
        // System.out.println(s3.indexOf('in')); // it only takes characters

    }
    public static void combiningStringsAndIntegers(){
        System.out.println("The sum of x and y is " + (2 + 4)); // The sum of x and y is 6
        //Because operations of the same precedence are read from left to right, if we put the addition before the String concatenation, we get the correct value.
        System.out.println(2 + 3 + " is the sum of x and y"); // 5 is the sum of x and y
        //BUT!!!!!!!!!  It combines the string and then 2 first before. Thus it will get you 24 at the end.
        System.out.println("The sum of x and y is " + 2 + 4); // The sum of x and y is 24
    }
    public static void partOfString(String word){
        System.out.println(word.substring(0,3));
    }
    public static void compareLexigraphically(String word1, String word2) {
        System.out.println("CompareTo "+word1.compareTo(word2));
    }
    public static void splitStringIntoMultipleStrings() {
        String s1 = "my favorite sentence";
        String splitAround = " ";
        System.out.println(s1.split(splitAround));
    }
    public static void main(String[] args) {
        concatingString("Rev", "ature");//str1.concat(str2)
        checkIfEqual("hello","Hello");//word1.equals(word2)
        changeCase("GOODday");//word.toUpperCase()  word.toLowerCase()
        characterLocation();//charAt(0)
        checkIfEqualIgnoringCapitals("Apple", "apple");//equalsIgnoreCase()
        stringLength(" Cheese 1");// .length()
        replaceCharacterWithSomethingElse("Bitter*black*coffee*sure*is*for*long*days");// .replace('*', ' ')
        removeAllSpaces("      Revature      1");// trim()
        checkIfContainsCharacter("potatoes","vanilla","invitev");// indexOff(character)
        combiningStringsAndIntegers();

        partOfString("banana");//word.substring(0,3)
        compareLexigraphically("cat", "dog");//s1.compareTo(s2)
        splitStringIntoMultipleStrings();
    }
}

class IfElse {
    public static void main(String[] args) {
        int precipitation = 0;
        int waterOutput = 0;
        int temperature = 80;

        //start an if-statement
        if (precipitation < 20){
            waterOutput = 30;
        }else if (precipitation < 31){
            waterOutput = 10; 
        }else if (precipitation < 56){
            waterOutput = 0;
        }else {
            waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);

    }
}

class ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
    		System.out.println(i);
        }

        // Initially loop is set to run from 0-9
		for (int i = 0; i < 10; i++) {
			// Terminate the loop when i is 5
			if (i == 5)
				break;
			System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");
    }
}


class WhileLoop {
    public static void main(String[] args) {
        //A for loop is an iteration method that is best used when you know the number of iterations ahead of time
        //A while loop is an iteration method that is best used when you don't know the number of iterations ahead of time
        boolean on = true;
        while (on){
    		System.out.println("Inside the while loop");
    		on = false;
    	}
        int d = 1;
        while (d <= 5){
            System.out.println(d);
            d++;
        }
    }
}


class DoWhileLoop {
    public static void main(String[] args) {
        //A `do...while` loop gets executed at least once, even if the condition is false.
        boolean on2 = false;
    	do{
    		System.out.println("Inside the do-while loop");
    	} while (on2);

        int x = 0;
        do{
    		System.out.println(x);
            x++;
    	} while (x<5);

        int y = 0;
        do{
    		System.out.println(y);
            y++;
    	} while (y<1);

        int z = 0;
        do{
    		System.out.println(z);
            z++;
    	} while (z<0);
    }
}




class ContinueBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue; // Continues the loop BUT SKIPS the iteration. So that it skips to print out 4
            }
            if (i == 5) {
                break; // When i is 5 the WHOLE LOOP ENDS HERE
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
			// If the number is 2
			// skip and continue
			if (j == 2)
				continue;

			System.out.print(j + " ");
		}
    }
}


class Switch {
    public static void main(String[] args){
        //Switch Case
        int x = 10;
        switch(x) {
        	case 10: System.out.println("x case 10 ran");
        }
        //Default Case

        int y = 5;
		switch(y) {
			case 10: System.out.println("y case 10 ran");
			default: System.out.println("y The default case ran.");
		}
        //Fall-through

        int z = 5;
		switch(z) {
			default: System.out.println("z The default case ran.");
			case 10: System.out.println("z case 10 ran");
		}

        int a = 5;
        switch(a) {
            case 6: System.out.println("a case 6 ran");
            default: System.out.println("a The default case ran.");
            case 7: System.out.println("a case 7 ran");
            case 10: System.out.println("a case 10 ran");
        }
        //Using break
        int b = 5;
        switch(b) {
            case 6:
                System.out.println("b case 6 ran");
                break;
            default:
                System.out.println("b The default case ran.");
                break;
            case 7:
                System.out.println("b case 7 ran");
                break;
            case 10:
                System.out.println("b case 10 ran");
        }
        int c = 5;

        switch(c) {
            case 6: {
                System.out.println("c case 6 ran");
                break;
            }
            default:{
                System.out.println("c The default case ran.");
                break;
            }
            case 7:{
                System.out.println("c case 7 ran");
                break;
            }
            case 10:{
                System.out.println("c case 10 ran");
                break;
            }
        }


        int i = 2;
		switch (i) {
		case 0:
			System.out.println("i is zero.");
			break;
		case 1:
			System.out.println("i is one.");
			break;
		case 2:
			System.out.println("i is two.");
			break;
		default:
			System.out.println("Invalid number");
		}
    }
}


class StaticKeyword {
}
class VariableScope{
    public static void main(String[] args) {
        int a = 10; // local variable
        System.out.println("a value: " + a);
    }
}
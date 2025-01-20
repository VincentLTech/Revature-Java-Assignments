public class StringBasics {

    public static void concatingString(){
        String str1 = "my string";
        str1.concat(" is the best!");
        System.out.println(str1);//still prints "my string"

        String str2 = "Rev";
        String str3 = "ature";
        String newStr = str2.concat(str3); // value in the variable "newStr" will be "Revature"
        System.out.println("Concatenated string: " + newStr);//Revature
    }
    public static void checkIfEqual(){
        String word1 = new String("hello");
        String word2 = new String("hello");
        System.out.println(word1 == word2); // false, because the equality operator is used to check whether the values within the reference variables are the same.
        System.out.println(word1.equals(word2)); // true, because the equals() method to check if the two objects are equivalent (have the same characters)
        
        //In this example, because we used literal notation, Java first created a String that has the character sequence “hello” in the String Pool and assigned it to the reference variable word1. Then, Java reused the same String object by having the reference variable word2 point to it. In this case, using either equals() or the equality operator would return true, since the same object is being referenced.
        //So always just use the equals() method when comparing two String objects.
        String word3 = "hello";
        String word4 = "hello";
        System.out.println(word3 == word4); // true
        System.out.println(word3.equals(word4)); // true

        String str5 = "Apple";
        String str6 = "apple";
        boolean b = str5.equals(str6); // value in the variable "b" will be false because .equals is case-sensitive.
        System.out.println("Are the strings equal from the equal()? " + b);//false
    }
    public static void changeCase(){
        String str = "Revature";
        String uppercase = str.toUpperCase();  //value in the variable "uppercase" will be "REVATURE"
        System.out.println("Change to uppercase " + uppercase);
        String lowercase = str.toLowerCase(); // value in the variable "lowercase" will be "revature"
        System.out.println("Change to lowercase " + lowercase);
    }
    public static void characterLocation(){
        //You need to know this
        String str = "Revature";
        char c1 = str.charAt(2);  // value in the variable character will be 'v'
        char c2 = str.charAt(6); // value in the variable will be 'r'
        System.out.println("Character at index 2: " + c1);
        System.out.println("Character at index 6: " + c2);
    }
    public static void checkIfEqualIgnoringCapitals(){
        String str1 = "Apple";
        String str2 = "apple";
        boolean c = str1.equalsIgnoreCase(str2); // value in the variable "b" will be true because .equalsIgnoreCase is NOT case-sensitive.
        System.out.println("Are the strings equal from the equalsIgnoreCase()? " + c);//true 
    }
    public static void stringLength(){
        String str = " Cheese ";
        int len = str.length(); // value in the variable "len" will be 8 (characters dont have to be a letter. Spaces and other symbols count as a character as well).
        System.out.println("Length of the string: " + len);// Output: Length of the string: 8, spaces are counted as characters.
    }
    public static void replaceCharacterWithSomethingElse(){
        String str10 = "Bitter*black*coffee*sure*is*for*long*days";
        String newStrReplace = str10.replace('*', ' '); // value in the variable "newStr" will be "Bitter black coffee sure is for long days"
        System.out.println("Replaced string: " + newStrReplace); //Bitter black coffee sure is for long days
    }
    public static void removeAllSpaces(){
        String str = "      Revature      ";
        String newStrTrim = str.trim(); // value in the variable "newStr" will be "Revature"
        System.out.println("Trimmed string: " + newStrTrim); //Revature
    }
    public static void checkIfContainsCharacter(){
        String s1 = "potatoes";
        String s2 =  "vanilla";
        String s3 =  "invitev";
        System.out.println(s1.indexOf('v')); // will return -1 because 'v' is not in the string "potatoes"
        System.out.println(s2.indexOf('v')); // will return 0
        System.out.println(s3.indexOf('v')); // will return 2
        // System.out.println(s3.indexOf('in')); // it only takes characters

    }
    public static void combiningStringsAndIntegers(){
        //When we use the '+' operator between a String and a number, Java will concatenate the String with the number.
        System.out.println("The sum of x and y is " + 2 + 4); // The sum of x and y is 24

        //If the the addition operation happen first by using the (), the sum is correctly calculated and then concatenated.
        System.out.println("The sum of x and y is " + (2 + 3)); // The sum of x and y is 5

        //Because operations of the same precedence are read from left to right, if we put the addition before the String concatenation, we get the correct value.
        System.out.println(2 + 3 + " is the sum of x and y"); // 5 is the sum of x and y
    }
    public static void partOfString(){
        String s = "banana";
        System.out.println(s.substring(0,3));
    }
    public static void compareLexigraphically() {
        String s1 = "cat";
        String s2 = "dog";
        System.out.println(s1.compareTo(s2));
    }
    public static void splitStringIntoMultipleStrings() {
        String s1 = "my favorite sentence";
        String splitAround = " ";
        System.out.println(s1.split(splitAround));
    }
    public static void main(String[] args) {
        concatingString();
        checkIfEqual();//word3.equals(word4)
        changeCase();//.toUpperCase()  .toLowerCase()
        characterLocation();//charAt(2)
        checkIfEqualIgnoringCapitals();//equalsIgnoreCase()
        stringLength();// .length()
        replaceCharacterWithSomethingElse();// .replace('*', ' ')
        removeAllSpaces();// trim()
        checkIfContainsCharacter();// indexOff(character)
        combiningStringsAndIntegers();

        partOfString();
        compareLexigraphically();
        splitStringIntoMultipleStrings();
















        

    }
}

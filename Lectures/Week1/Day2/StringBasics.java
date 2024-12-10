public class StringBasics {
    public static void main(String[] args) {
        String str1 = "my string";
        str1.concat(" is the best!");
        System.out.println(str1);//still prints "my string"

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

        String str = "Revature";

        String uppercase = str.toUpperCase();  //value in the variable "uppercase" will be "REVATURE"
        System.out.println("Change to uppercase " + uppercase);
        String lowercase = str.toLowerCase(); // value in the variable "lowercase" will be "revature"
        System.out.println("Change to lowercase " + lowercase);

        //You need to know this
        String str2 = "Revature";
        char c1 = str2.charAt(2);  // value in the variable character will be 'v'
        char c2 = str2.charAt(6); // value in the variable will be 'r'
        System.out.println("Character at index 2: " + c1);
        System.out.println("Character at index 6: " + c2);

        String str3 = "Rev";
        String str4 = "ature";
        String newStr = str3.concat(str4); // value in the variable "newStr" will be "Revature"
        System.out.println("Concatenated string: " + newStr);//Revature

        String str5 = "Apple";
        String str6 = "apple";
        boolean b = str5.equals(str6); // value in the variable "b" will be false because .equals is case-sensitive.
        System.out.println("Are the strings equal from the equal()? " + b);//false

        String str7 = "Apple";
        String str8 = "apple";
        boolean c = str7.equalsIgnoreCase(str8); // value in the variable "b" will be true because .equalsIgnoreCase is NOT case-sensitive.
        System.out.println("Are the strings equal from the equalsIgnoreCase()? " + c);//true 

        String str9 = " Cheese ";
        int len = str9.length(); // value in the variable "len" will be 8 (characters dont have to be a letter. Spaces and other symbols count as a character as well).
        System.out.println("Length of the string: " + len);// Output: Length of the string: 8, spaces are counted as characters.
    
        String str10 = "Bitter*black*coffee*sure*is*for*long*days";
        String newStrReplace = str10.replace('*', ' '); // value in the variable "newStr" will be "Bitter black coffee sure is for long days"
        System.out.println("Replaced string: " + newStrReplace); //Bitter black coffee sure is for long days
    
        String str11 = "      Revature      ";
        String newStrTrim = str11.trim(); // value in the variable "newStr" will be "Revature"
        System.out.println("Trimmed string: " + newStrTrim); //Revature

        char character = 'v';
        String s1 = "potatoes";
        String s2 =  "vanilla";
        String s3 =  "invite";
        System.out.println(s1.indexOf(character)); // will return -1 because 'v' is not in the string "potatoes"
        System.out.println(s2.indexOf(character)); // will return 0
        System.out.println(s3.indexOf(character)); // will return 2

        //When we use the '+' operator between a String and a number, Java will concatenate the String with the number.
        System.out.println("The sum of x and y is " + 2 + 4); // The sum of x and y is 24

        //If the the addition operation happen first by using the (), the sum is correctly calculated and then concatenated.
        System.out.println("The sum of x and y is " + (2 + 3)); // The sum of x and y is 5

        //Because operations of the same precedence are read from left to right, if we put the addition before the String concatenation, we get the correct value.
        System.out.println(2 + 3 + " is the sum of x and y"); // 5 is the sum of x and y

    }
}

public class StringMethods {
    /**
     * @param s the String to be manipulated.
     * @return the length of string s.
     */
    public int getStringLength(String s){
        return s.length();
    }

    /**
     * charAt can be used to retrieve specific characters of a String, such as the first character.
     * @param s the String to be manipulated.
     * @param n an index of String s.
     * @return the character of String s that is located at position n.
     */
    public char getCharacterAtIndex(String s, int n){
        return s.charAt(n);
    }

    /**
     * indexOf can be used to retrieve the index of the first character of a String, such as the position of character
     * 'a' in banana, which would result in 1.
     * it returns -1 if the character does not exist.
     * @param s the String to be manipulated.
     * @param c a character within s.
     * @return the index of the first occurence of c within s.
     */
    public int getIndexGivenCharacter(String s, char c){
        return s.indexOf(c);
    }
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        String s = "banana";
        System.out.println("Length of String: " + stringMethods.getStringLength(s));
        System.out.println("Character at index 1: " + stringMethods.getCharacterAtIndex(s, 1));
        System.out.println("Index of character 'a': " + stringMethods.getIndexGivenCharacter(s, 'a'));
        String e = "";
        // Test with empty string
        System.out.println("Length of empty String: " + stringMethods.getStringLength(e));
        // System.out.println("Character at index 0 (empty string): " + stringMethods.getCharacterAtIndex(e, 0));
        System.out.println("Index of character 'a' in empty string: " + stringMethods.getIndexGivenCharacter(e, 'a'));
        
    }
}
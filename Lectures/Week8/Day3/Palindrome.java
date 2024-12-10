
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        char newchar1[] = new char[str.length()];
        char newchar2[] = new char[str.length()];
        int j=str.length()-1;
        for(int i=0; i<str.length();i++){
            newchar1[i]= str.charAt(i);
            newchar2[i]=str.charAt(j);
            j--;
        }
        for(int z =0; z<newchar1.length;z++){
            if(newchar1[z]!=newchar2[z]){
                return false;
            }
        }
        return true;
    }
}
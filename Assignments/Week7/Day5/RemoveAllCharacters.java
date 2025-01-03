
public class RemoveAllCharacters {
    /**
     * Return a String that has all the character of a String removed.
     * You could either use a for loop to build a new String that excludes a character, or you could cleverly use
     * the replaceAll method of String to replace a character with a blank space.
     *
     * Here are the docs for String: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param str A string.
     * @param ch A string containing a single character which should be removed from str.
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){
        // String newStr = str.replace(String.valueOf(ch), "");
        // return newStr;
        String temp="";
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length;i++){
            String link = Character.toString(charArray[i]);
            if(charArray[i]!= ch.charAt(0)){
                temp= temp +""+link;
            }
        }
        return temp;
    }
    public String removeAll2(String str, String ch){
        String newone = "";
        char c = ch.charAt(0);
        for(int i = 0;  i < str.length(); i++){
            if(c!=str.charAt(i)){
                newone = newone+""+str.charAt(i);
            }
        }
        return newone;
    }
}
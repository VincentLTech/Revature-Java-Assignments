public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int wordCount=1;

        // Traverse all characters of the input string
        for (int i = 0; i < in.length(); i++) {
            if(Character.isWhitespace(in.charAt(i))){

                wordCount++;
            }
        }

        return wordCount;
    }
}
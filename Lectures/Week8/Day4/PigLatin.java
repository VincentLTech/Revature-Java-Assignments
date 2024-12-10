
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        char newsize[] = new char[in.length()+2];
        for(int i = 0; i<=newsize.length;i++){
            if(i<in.length()-1){
                newsize[i]=in.charAt(i+1);
            }
            if(i==in.length()-1){
                newsize[i]=in.charAt(0);
            }
        }
            newsize[in.length()]= 'a';
            newsize[in.length()+1]= 'y';
        String newword= "";
        for(int z = 0; z<newsize.length;z++){
            newword= newword+""+newsize[z];
        }
        return newword;
    }
}
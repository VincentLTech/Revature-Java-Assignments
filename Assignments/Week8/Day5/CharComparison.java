public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){



        String word1= "";
        String word2= "";
        for(int i = 0; i<a.length;i++){
            word1= word1+ "" +a[i];
        }
        for(int j = 0; j<b.length;j++){
            word2= word2+"" +b[j];
        }
        System.out.println(word1);
        System.out.println(word2);

        int result = word1.compareTo(word2);
        if(result>0){
            return 1;
        }
        else if(result<0){
            return -1;
        }
        else{
            return 0;
        }
        // // char[] a = {'c', 'a', 't'};
        // // char[] b = {'d', 'o', 'g'};
        // int ctotal = 0;
        // if(a.length!=b.length){
        //     return 
        // }
        // for (int i = 0; i < a.length; i++) {
        //     String str1 = String.valueOf(a[i]);
        //     String str2 = String.valueOf(b[i]);
        //     System.out.println(str1);
        //     System.out.println(str2);
        //     int result = str1.compareTo(str2);
        //     System.out.println("this is the result: "+result);
        //     if(result<0){
        //         ctotal--;
        //     }
        //     else if(result>0){
        //         ctotal++;

        //     }
        // }
        // return ctotal;
    }
}
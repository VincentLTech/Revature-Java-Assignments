/**
     * Return a string with an array's contents, formatted with spaces.
     * For example, given the array {3,4,5,6} the string should look like this:
     * 3 4 5 6
     *
     * Spaces at the end of the string will not affect test results.
     *
     * You will need to use a for loop here. Again, the structure of that loop would look similar to a previous problem.
     * However, this challenge introduces the idea that a for loop can manipulate a variable that exists outside of the
     * for loop, which looks something like this:
     *
     * String str;
     * for(int i = 0; i < nums.length; i++){
     *      //do something to str here
     * }
     * return str;
     *
     */
    

// import java.util.Arrays;
public class ReturnArrayContents {//@return a string representation of all values of nums, with the values separated by spaces.
    
    public String arrayToString(int[] nums){
        String result = "";
        for(int i= 0; i<nums.length;i++){
            result= result+" "+ nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        ReturnArrayContents obj = new ReturnArrayContents();
        System.out.println(obj.arrayToString(arr)); // Output: 3 4 5 6
    }
}
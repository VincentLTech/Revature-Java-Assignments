
/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class Array {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr){
        return arr.length;
    }



    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){
        return arr[n];
    }

    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){
        arr[n]=val;
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
        int [] arr =new int[n];
        return arr;
    }

    public static void main(String[] args){
        int[] input = {0,1,2,3,4};
        System.out.println(ab.getLengthOfArray(input));
        int[] input2 = {8,4,7};
        System.out.println(ab.getLengthOfArray(input2));

        int[] input3 = {8,4,7,3,8,5};
        int n = 2;
        System.out.println(ab.getNthElementOfArray(input3, n));

        int[] input4 = {5,3,9,1,0};
        int n = 0;
        System.out.println(ab.getNthElementOfArray(input4, n));

        int[] input5 = {6,4,8};
        int n = 2;
        System.out.println(ab.getNthElementOfArray(input5, n));

        int[] input6 = {9,3,7,3,6};
        int n = 2;
        int val = 5;
        System.out.println(ab.setNthElementOfArray(input6, n, val));
    


        int[] input7 = {9,3,4};
        int n = 0;
        int val = 2;
        ab.setNthElementOfArray(input7, n, val);

        int input8 = 5;
        int[] output = ab.returnNewArraySizeN(input8);
        if(output == null){
            Assert.fail("array nas not been created.");
        }else{
            Assert.assertEquals(output.length, input);
        }
        
        int input9 = 2;
        int[] output = ab.returnNewArraySizeN(input9);
        if(output == null){
            Assert.fail("array nas not been created.");
        }else{
            Assert.assertEquals(output.length, input);
        }
    
    }
}

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
    public static int getLengthOfArray(int[] arr){//@return the length of arr.
        return arr.length;
    }
    public static int getNthElementOfArray(int[] arr, int n){//@return the element at index n of arr.
        return arr[n];
    }
    public static int[] setNthElementOfArray(int[] arr, int n, int val){//set the value at index n to val and return the modified array
        arr[n]=val;
        return arr;
    }
    public static int[] returnNewArraySizeN(int n){//@return a new int array that can contain n elements.
        int [] arr =new int[n];
        return arr;
    }

    public static void main(String[] args){
        int[] input = {0,1,2,3,4};
        System.out.println(getLengthOfArray(input));
        int[] input2 = {8,4,7};
        System.out.println(getLengthOfArray(input2));

        int[] input3 = {8,4,7,3,8,5};
        int n = 2;
        System.out.println(getNthElementOfArray(input3, n));

        int[] input4 = {5,3,9,1,0};
        int a = 0;
        System.out.println(getNthElementOfArray(input4, a));

        int[] input5 = {6,4,8};
        int b = 2;
        System.out.println(getNthElementOfArray(input5, b));

        int[] input6 = {9,3,7,3,6};
        int c = 2;
        int val = 5;
        System.out.println(setNthElementOfArray(input6, c, val));
    


        int[] input7 = {9,3,4};
        int d = 0;
        int val2 = 2;
        setNthElementOfArray(input7, d, val2);

        // int input8 = 5;
        // int[] output = ab.returnNewArraySizeN(input8);
        // if(output == null){
        //     Assert.fail("array nas not been created.");
        // }else{
        //     Assert.assertEquals(output.length, input);
        // }
        
        // int input9 = 2;
        // int[] output = ab.returnNewArraySizeN(input9);
        // if(output == null){
        //     Assert.fail("array nas not been created.");
        // }else{
        //     Assert.assertEquals(output.length, input);
        // }
    
    }
}
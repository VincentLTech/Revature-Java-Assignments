  
import java.util.Arrays; //for the Arrays.toString method
public class SetAllArrayElementsToN   {
    public void set(int[] arr, int n){//you will recieve an array and a number, and you will have to set every element of the array to that number.
        for(int i = 0;i<arr.length;i++){
            arr[i]=n;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SetAllArrayElementsToN setAllArrayElementsToN = new SetAllArrayElementsToN();
        setAllArrayElementsToN.set(arr, 7);
        System.out.println(Arrays.toString(arr)); //prints [7, 7, 7, 7, 7]
    }
}
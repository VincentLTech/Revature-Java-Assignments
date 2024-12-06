public class ArraySum {//@return the sum of all values in arr.
    public int sum(int[] arr){
        int summer=0;
        for(int i=0;i<arr.length;i++){
            summer+=arr[i];
        }
        return summer;
    }
    public static void main(String[] args){
        ArraySum arraySum = new ArraySum();
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println(arraySum.sum(testArray));
    }
}
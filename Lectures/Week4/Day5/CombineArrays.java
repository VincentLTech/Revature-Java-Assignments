public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] newer= new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            newer[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            newer[arr1.length+j]= arr2[j];
        }
        return newer;
    }
    // int arr3[] = new int[arr1.length+arr2.length];
    
    // for(int i = 0; i<arr1.length; i++){
    //     arr3[i]=arr1[i];
    // }
    
    // for(int j = arr1.length; j<(arr2.length+arr1.length); j++){
    //     arr3[j]=arr2[j];
    // }
    // return arr3;
}
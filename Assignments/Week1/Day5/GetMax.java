public class GetMax {
    public int max(int[] arr){//@return the largest value in arr.
        int her = -1000000000;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>her){
                her=arr[i];
            }
        }
        return her;
    }
    
    public static void main(String[] args) {
        GetMax getMax = new GetMax();
        int[] arr = {10, 5, 15, 20, 100};
        System.out.println("The largest value in the array is: " + getMax.max(arr));
    }
}
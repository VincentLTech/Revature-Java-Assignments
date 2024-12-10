

public class Contains {
    public boolean arrayContains(int[] arr, int target){//@return true if arr contains the value you are looking for(target), false otherwise.
        for(int i=0; i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Contains contains = new Contains();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(contains.arrayContains(arr, target)); //prints: true
    }
}
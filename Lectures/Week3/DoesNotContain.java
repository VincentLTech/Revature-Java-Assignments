
public class DoesNotContain {
    public boolean arrayDoesNotContain(int[] arr, int target){//@return true if arr does not contain a number you suggested(target). false otherwise.
        for(int i =0; i<arr.length;i++){
            if(target==arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DoesNotContain doesNotContain = new DoesNotContain();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        int target2 = 3;
        System.out.println(doesNotContain.arrayDoesNotContain(arr, target)); // should print true, since 6 is not in the array.
        System.out.println(doesNotContain.arrayDoesNotContain(arr, target2)); // should print false, since 3 is in the array.
    }
}
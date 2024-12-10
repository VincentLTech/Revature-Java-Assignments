/**
 
 * Note: attempting to solve this problem with an expression like array1==array2 will not work,
 * because even though the arrays may be equivalent, they can occupy different positions in memory,
 * which will cause a==b to fail. When working with Objects (arrays are special objects,) == just
 * compares locations in memory. Object1 == Object2 is only true when they are literally the same
 * object in memory.
 */
public class ArraysAreEqual {
    public boolean equal(int[] a, int[] b){//Check if two arrays are equal to each other
        if(a.length!=b.length){
            return false;
        }
        else{
            for(int i =0; i<a.length; i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArraysAreEqual arraysAreEqual = new ArraysAreEqual();
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 5};
        System.out.println(arraysAreEqual.equal(array1, array2)); // true
        System.out.println(arraysAreEqual.equal(array1, array3)); // false
    }
}
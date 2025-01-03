import java.util.*;
// import java.util.TreeSet;
// import java.util.HashSet;
public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> st = new HashSet<Integer>();
        for(int i =0; i<nums.length;i++){
            if(st.contains(nums[i])){
                return true;
            }
            else{
            st.add(nums[i]);
            }
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums){
        for(int i = 0; i< nums.length; i ++){
            for(int j = i+1 ; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
//
    // TreeSet<Integer> st = new TreeSet<Integer>();
    //     for(int i =0; i<nums.length;i++){
    //         if(st.contains(nums[i])){
    //             return true;
    //         }
    //         else{
    //         st.add(nums[i]);
    //         }
    //     }
    //     return false;
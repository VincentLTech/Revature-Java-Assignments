
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = 0;
        int min =10000;
        for(int i=0; i<nums.size(); i++){
            if(max<nums.get(i)){
                max=nums.get(i);
            }
            if(min>nums.get(i)){
                min=nums.get(i);
            }
        }
        return max-min;
    }
}
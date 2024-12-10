
import java.util.List;

public class MaxMinusMin {
    public int difference(List<Integer> nums){//Return the difference between the highest and lowest values of the List.
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
    public static void main(String[] args) {
        MaxMinusMin mmm = new MaxMinusMin();
        List<Integer> nums = List.of(1, 5, 3, 7, 9, 2);
        System.out.println(mmm.difference(nums));
    }
}
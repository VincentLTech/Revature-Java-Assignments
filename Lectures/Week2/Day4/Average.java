
public class Average {
    //before you divide the sum of all numbers by the amount of numbers in order to produce the average, you'll need do convert the sum to type double because some results from integer division might not be accurate.
    public double getAvg(int[] nums){//@return the average of all the values of nums.
        double total=0;
        for(int i=0; i< nums.length;i++){
            total+=nums[i];
        }
        double quotient=total/nums.length;
        return quotient;
    }
    public static void main(String[] args) {
        Average avg = new Average();
        int[] nums = {1,2,3,4,5,6};
        System.out.println("The average is: " + avg.getAvg(nums));
    }
}
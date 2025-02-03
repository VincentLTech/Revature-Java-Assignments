package MyJava;

import java.util.HashMap;

public class test {
    
}
class NonRepeatingElement {

    public static int findNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with frequency 1
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }

        // If no non-repeating element is found
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 3};
        int nonRepeating = findNonRepeatingElement(arr);
        System.out.println("Non-repeating element: " + nonRepeating);
    }
}

class LargestSum{
    public static void main(String[] args) {
        
        int fire = -10000;
        int [] nums = {1,2,3,4,5,6};
        for(int i = 0; i<=nums.length; i++){
            for(int j= i+1; j<=nums.length; j++){

                if(nums[i]+nums[j]>fire){
                    fire = nums[i]+nums[j];
                }
            }
        }
        System.out.println(fire);
    }
}

class Example {
    public void doStuff() {
        System.out.println("hello"); 
    }
    public void doStuff(int x) { 
        System.out.println(x); 
    }
}

class Example2 {
    public String name;
    public Example2(String s) {
        this.name = s;
    }
}
class Car implements Driveable {
    public void drive() {
        System.out.println("driving the car...");
    }
}

bean id="orderServ"
class="com.revature.services.OrderServiceImpl"
&gt; &lt;property
name="orderDao"
ref="orderDao"
/&gt;
&lt;
/bean&gt;
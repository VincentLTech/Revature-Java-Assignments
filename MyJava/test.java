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
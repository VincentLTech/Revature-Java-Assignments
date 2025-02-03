import java.util.Arrays;
import java.util.HashMap;

public class Assessment {
    public static void main(String[] args) {
        System.out.println("String");
    }
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

class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "olleh";

        if (isAnagram(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
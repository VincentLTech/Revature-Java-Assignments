public class Array {

    public static void main(String[] args){
        // Array of integers
        int[] arr = new int[5];

        System.out.println("arr size: " + arr.length);
        int[] numbers = {0,1,2,3,4};
        System.out.println("numbers size: " +numbers.length);
        System.out.println("Index 0: " +numbers[0]);
        System.out.println("Index 4: " +numbers[4]);

        int[] input3 = {9,3,7,3,6};
        input3[2]=2;

        // Iterating over an array of strings with enhanced for loop
        for (int number : input3) {
            System.out.println("Iterate " + number);
        }
        // Iterating over an array of integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int[] intArray = new int[3];
        System.out.println("Array Memory Address: "+ intArray);
    }
}
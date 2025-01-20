package Lectures.Week7;

public class Sort {
    
}
class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12};
        // Loop through each element of the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < arr.length - i - 1; j++) {
            // Compare adjacent elements and swap if needed
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
    
        // Call the merge sort method
        mergeSort(arr, 0, arr.length - 1);
    
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
  
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
    
            // Recursively sort the left and right sub-arrays
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
    
            // Merge the sorted sub-arrays
            merge(arr, left, middle, right);
        }
    }
  
    public static void merge(int[] arr, int left, int middle, int right) {
        // Find the sizes of the left and right sub-arrays
        int n1 = middle - left + 1;
        int n2 = right - middle;
    
        // Create temporary arrays to hold the left and right sub-arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
    
        // Copy the elements of the left and right sub-arrays into the temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + 1 + j];
        }
    
        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
            } else {
            arr[k] = R[j];
            j++;
            }
            k++;
        }
    
        // Copy any remaining elements from the left sub-array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
    
        // Copy any remaining elements from the right sub-array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
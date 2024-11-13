package com.demo;
import java.util.List;

public class BinarySearchExample {
    public static int binarySearch(List<Integer> sortedList, int target) {
        // Call the recursive binary search function with initial low and high indices
        return binarySearchRecursive(sortedList, target, 0, sortedList.size() - 1);
    }

    private static int binarySearchRecursive(List<Integer> list, int target, int low, int high) {
        // If low is greater than high, the element is not found
        if (low > high) {
            return -1;
        }

        // Calculate the middle index
        int mid = low + (high - low) / 2;

        // Check if the middle element is the target
        if (list.get(mid) == target) {
            return mid; // Return the index if the target is found
        } else if (list.get(mid) > target) {
            // If the middle element is greater than the target, search the left half
            return binarySearchRecursive(list, target, low, mid - 1);
        } else {
            // If the middle element is less than the target, search the right half
            return binarySearchRecursive(list, target, mid + 1, high);
        }
    }
}

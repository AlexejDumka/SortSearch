package com.demo;
import java.util.List;

public class SortSearchApplication {
    public static void main(String[] args) {
        // Example usage of sorting and search algorithms
        List<Integer> numbers = List.of(5, 3, 8, 4, 2);
        System.out.println("Stream Sort: " + StreamSortExample.sortWithStream(numbers));
        System.out.println("Bubble Sort: " + BubbleSortExample.bubbleSort(numbers));
        System.out.println("Insertion Sort: " + InsertionSortExample.insertionSort(numbers));
        System.out.println("Merge Sort: " + MergeSortExample.mergeSort(numbers));

        int target = 4;
        System.out.println("Linear Search: Index of " + target + " is " + LinearSearchExample.linearSearch(numbers, target));

        List<Integer> sortedNumbers = List.of(2, 3, 4, 5, 8);
        System.out.println("Binary Search: Index of " + target + " is " + BinarySearchExample.binarySearch(sortedNumbers, target));
    }
}

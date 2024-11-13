package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BubbleSortExample {
    public static List<Integer> bubbleSort(List<Integer> list) {
        // Copy the list to avoid modifying the original
        List<Integer> sortedList = new ArrayList<>(list);
        int n = sortedList.size(); // Get the size of the list

        // Outer loop to iterate through the list multiple times
        IntStream.range(0, n - 1).forEach(i -> {
            // Inner loop to compare each pair of adjacent elements
            IntStream.range(0, n - i - 1).forEach(j -> {
                // Swap elements if they are in the wrong order
                if (sortedList.get(j) > sortedList.get(j + 1)) {
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            });
        });

        // Return the sorted list
        return sortedList;
    }
}

package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class InsertionSortExample {
    public static List<Integer> insertionSort(List<Integer> list) {
        // Create a copy of the list to avoid modifying the original
        List<Integer> sortedList = new ArrayList<>(list);

        // Iterate from the second element to the end
        IntStream.range(1, sortedList.size()).forEach(i -> {
            int key = sortedList.get(i); // Current element to be placed
            int j = i - 1;

            // Shift elements of sortedList[0...i-1] that are greater than key
            while (j >= 0 && sortedList.get(j) > key) {
                sortedList.set(j + 1, sortedList.get(j));
                j--;
            }
            // Place the key at the correct position
            sortedList.set(j + 1, key);
        });

        // Return the sorted list
        return sortedList;
    }
}


package com.demo;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortExample {
    public static List<Integer> mergeSort(List<Integer> list) {
        // Base case: if the list has 0 or 1 element, it is already sorted
        if (list.size() <= 1) {
            return list;
        }

        // Find the middle index of the list
        int middle = list.size() / 2;

        // Recursively sort the left half of the list
        List<Integer> left = mergeSort(list.subList(0, middle));

        // Recursively sort the right half of the list
        List<Integer> right = mergeSort(list.subList(middle, list.size()));

        // Merge the sorted halves and return the result
        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        // Use Stream to combine and sort elements from left and right
        return Stream.concat(left.stream(), right.stream())
                .sorted() // Sort the combined elements
                .collect(Collectors.toList()); // Collect to a new list
    }
}

package com.demo;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LinearSearchExample {
    public static int linearSearch(List<Integer> list, int target) {
        // Create an IntStream with the indices of the list, from 0 to list.size() - 1
        OptionalInt indexOpt = IntStream.range(0, list.size())
                // Filter to find the index where the element matches the target
                .filter(i -> list.get(i) == target)
                // Retrieve the first index that matches the target
                .findFirst();

        // Return the index if found, or -1 if not found
        return indexOpt.orElse(-1);
    }
}


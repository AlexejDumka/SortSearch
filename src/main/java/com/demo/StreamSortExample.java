package com.demo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static List<Integer> sortWithStream(List<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}


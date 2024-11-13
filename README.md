

# Sorting and Searching Algorithms in Java
***
## Searching Algorithms
Searching algorithms can be divided into two main categories depending on the type of data structure and the type of search:

: Sequential Search: Sequential (or linear) search algorithms traverse each element in a list or array one by one, checking each one until the desired element is found or the end of the data structure is reached. They are best suited for unsorted or unordered data. Example: Linear Search.

: Interval Search: Interval search algorithms are designed to work efficiently on sorted data structures. They use a divide-and-conquer approach to repeatedly target the center of the data structure, narrowing down the search space by half each time. These algorithms are much more efficient than sequential search, especially for large datasets. Example: Binary Search.

***
### Linear Search

The Linear Search algorithm is a simple and straightforward search method. 
: 1. Starting from the first element, it checks each element in sequence to see if it matches the search target. 
: 2. If the target is found, it returns the index; 
: 2a. if not, it traverses the entire list and returns a signal (e.g., -1) indicating the target was not found.

: Complexity: Linear search is inefficient for large datasets but effective for small, unsorted datasets.
: Use Case: Linear search is useful when dealing with unsorted data or when the data is small enough that more complex search algorithms aren't necessary.

***
### Binary Search
Binary Search is a highly efficient search algorithm but requires the data to be sorted beforehand. The algorithm works by dividing the search interval in half each time, reducing the number of comparisons needed to find an element.

: 1. Start by comparing the middle element of the array to the target value.
: 2a. If the target is equal to the middle element, return its position.
: 2b.  If the target is smaller than the middle element, repeat the search on the lower half.
: 2c.   If the target is larger than the middle element, repeat the search on the upper half.
: 3. Continue this process until the target is found or the interval is empty.
: Complexity: Binary search is much faster than linear search for large datasets.
: Use Case: Binary search is best used when working with large, sorted datasets.

## Sorting Algorithms
Sorting algorithms arrange data into a specified order. This ordering enables more efficient searching, better data management, and clearer data structure. Common sorting algorithms include Bubble Sort, Insertion Sort, and Merge Sort.
***

### Bubble Sort
Bubble Sort is a simple comparison-based algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is fully sorted.

Algorithm Steps:

: 1. Start at the beginning of the list.
: 2. Compare each pair of adjacent elements and swap them if needed.
: 3. Repeat the process for each element in the list until no swaps are needed.
: Complexity: Bubble sort is inefficient for large datasets.

Use Case: Bubble sort is primarily used for educational purposes or for very small datasets due to its simplicity but high computational cost.
***
## Insertion Sort
Insertion Sort is a more efficient sorting algorithm than Bubble Sort for small data sets. It builds a sorted list one item at a time, picking the next unsorted element and inserting it into its correct position within the already sorted portion of the list.

Algorithm Steps:

: 1. Start with the second element and consider it the current "key."
: 2. Compare the key with elements in the sorted portion and shift elements if they are greater than the key.
: 3. Insert the key in its correct position.
: 4. Repeat the process for each element in the list.
: Complexity: Insertion sort performs well on small or partially sorted datasets.

Use Case: Insertion sort is efficient for small or nearly sorted datasets, making it useful for real-time applications.
***
### Merge Sort
Merge Sort is a divide-and-conquer algorithm that divides the data into smaller sub-arrays, sorts them, and then merges them back together in the correct order. It is a stable sorting algorithm, meaning it preserves the relative order of equal elements.

Algorithm Steps:

: 1. Divide the list into two halves until each half has only one element.
: 2. Recursively sort each half.
: 3. Merge the sorted halves back together to form a fully sorted list.
: Complexity: Merge sort is efficient for large datasets.

Use Case: Merge sort is ideal for large datasets and is often used in applications where stability is essential, such as database sorting.


### Stream.sorted()
There is a method sorted() in Stream API. By default, elements are sorted in the natural order

## Compiling and Running the Application

```
mvn compile
mvn exec:java -Dexec.mainClass="com.demo.SortSearchApplication"
```

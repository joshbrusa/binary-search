# binary-search

An example of binary search on an array.

Works by repeatedly dividing the search interval in half.

1. Begin with the entire sorted array.
2. Compare the target value with the middle element of the array.
3. If the target value matches the middle element, the search is complete.
4. If the target value is less than the middle element, repeat the search
   process on the sub-array to the left of the middle element.
5. If the target value is greater than the middle element, repeat the search
   process on the sub-array to the right of the middle element.
6. Continue this process until the target value is found or the sub-array has no
   more elements.

Binary search has a time complexity of O(log n), making it much more efficient
than linear search algorithms, especially for large datasets. However, it
requires that the array be sorted beforehand, which can add an additional time
complexity of O(n log n) if sorting is necessary.

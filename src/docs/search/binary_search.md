## [Binary Search](https://en.wikipedia.org/wiki/Binary_search_algorithm)

Binary search, also known as half-interval search, logarithmic search, or binary chop, is a search
algorithm that finds the position of a target value within a sorted array. Binary search compares
the target value to the middle element of the array. If they are not equal, the half in which the
target cannot lie is eliminated and the search continues on the remaining half, again taking the
middle element to compare to the target value, and repeating this until the target value is found.
If the search ends with the remaining half being empty, the target is not in the array.

**NOTE**:

- The given array must be sorted

### Complexities

| Case       | Performance |
| ---------- | ----------- |
| Worst-case | O(log n)    |
| Best-case  | O(1)        |
| Average    | O(log n)    |

### Implementation Example

- [Java](../../java/main/java/search/BinarySearch.java)

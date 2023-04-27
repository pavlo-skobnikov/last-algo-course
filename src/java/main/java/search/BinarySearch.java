package search;

public class BinarySearch implements ArraySearchAlgorithm {

  @Override
  public boolean search(int[] haystack, int needle) {
    boolean found = false;

    int low = 0;
    int high = haystack.length - 1;
    int mid = (low + high) / 2;

    while (low <= high) {
      if (needle == haystack[mid]) {
        found = true;

        break;
      } else if (needle > haystack[mid])
        low = mid + 1;
      else {
        high = mid - 1;
      }

      mid = (low + high) / 2;
    }

    return found;
  }
}

package search;

public class LinearSearch implements ArraySearchAlgorithm {

  @Override
  public boolean search(int[] haystack, int needle) {
    boolean found = false;

    for (int index = 0; index < haystack.length; index++) {
      if (haystack[index] == needle) {
        found = true;
        break;
      }
    }

    return found;
  }
}

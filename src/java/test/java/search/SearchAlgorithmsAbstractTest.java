package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class SearchAlgorithmsAbstractTest {

  public abstract ArraySearchAlgorithm getSearchAlgorithm();

  @Test
  public void search_whenSearchedValuesPresent_returnsTrue() {
    final int[] haystack = { 1, 3, 4, 69, 71, 81, 90, 99, 420, 1337, 69420 };
    final int[] needles = { 69, 69420, 1 };

    final ArraySearchAlgorithm searchAlgorithm = getSearchAlgorithm();

    for (final int needle : needles) {
      Assertions.assertTrue(searchAlgorithm.search(haystack, needle));
    }
  }

  @Test
  public void search_whenSearchedValuesMissing_returnsFalse() {
    final int[] haystack = { 1, 3, 4, 69, 71, 81, 90, 99, 420, 1337, 69420 };
    final int[] needles = { 1336, 69421, 0 };

    final ArraySearchAlgorithm searchAlgorithm = getSearchAlgorithm();

    for (final int needle : needles) {
      Assertions.assertFalse(searchAlgorithm.search(haystack, needle));
    }
  }
}

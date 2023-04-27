package search;

class BinarySearchTest extends SearchAlgorithmsAbstractTest {

  @Override
  public ArraySearchAlgorithm getSearchAlgorithm() {
    return new BinarySearch();
  }
}

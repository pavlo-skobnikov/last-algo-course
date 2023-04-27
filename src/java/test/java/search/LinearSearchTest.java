package search;

class LinearSearchTest extends SearchAlgorithmsAbstractTest {

  @Override
  public ArraySearchAlgorithm getSearchAlgorithm() {
    return new LinearSearch();
  }
}

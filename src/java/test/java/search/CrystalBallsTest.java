package search;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrystalBallsTest {

  @Test
  public void findFirstBreakingFloor_whenGivenValidInput_returnsCorrectResult() {
    final int totalFloors = 10_000;
    final boolean[] floors = new boolean[totalFloors];

    final int indexOfFirstBreakingFloor = (int) (Math.random() * totalFloors);

    IntStream.range(indexOfFirstBreakingFloor, totalFloors).forEach(index -> floors[index] = true);

    Assertions.assertEquals(
        indexOfFirstBreakingFloor, CrystalBallsProblem.findFirstBreakingFloor(floors));
  }
}

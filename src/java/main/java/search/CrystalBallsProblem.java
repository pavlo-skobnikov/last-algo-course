package search;

public class CrystalBallsProblem {

  public static int findFirstBreakingFloor(final boolean[] floors) {
    final int jumpAmount = (int) Math.floor(Math.sqrt((double) floors.length));

    int jumpIndex = jumpAmount;

    while (!floors[jumpIndex] && jumpIndex < floors.length) {
      jumpIndex += jumpAmount;
    }

    int firstBreakingFloor = -1;

    for (int index = (jumpIndex - jumpAmount); index < floors.length - 1; index++) {
      if (floors[index]) {
        firstBreakingFloor = index;

        break;
      }
    }

    return firstBreakingFloor;
  }
}

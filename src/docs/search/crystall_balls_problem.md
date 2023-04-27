## [Crystal Balls Problem](http://www.tanyakhovanova.com/Puzzles/solballs.html)

I am in a N-story building. I have with me two glass balls. I know that if I throw the ball out
of the window, it will not break if the floor number is less than X, and it will always breaks if
the floor number is equal to or greater than X. Assuming that I can reuse the balls which don't

The length of the array is the number of floors in the building. Values contained are either true
or false. True - crystal ball will break if dropped from this floor; false - the crystal ball will
not break. The array has two contiguous parts of false and true.

**NOTE**:

- Can be solved with an O(sqrt(n)) complexity
- The fast complexity is achievable due to fact that the values in the search problem are binary =>
  0/1 || true/false

### Solution

- [Java](../../java/main/java/search/CrystalBallsProblem.java)

# Arrays

They are fixed size, continiguous memory chunks:

- That means you cannot grow it
- There is no "insertAt" or push or pop. Doesn't mean you can't write those though

## Constant Time Operations

All basic operations (insertion, "deletion") over arrays are constant => O(1)

This is due to the fact how we access elements in the array. This is done via
index arithmetic:

1. For array `a`, we go to the memory address of `a`.
2. The we take the ~width~ of the data type contained in `a`
3. Lastly, we multiply ~width~ x given ~index~ and directly access that memory address.

This constant time is only available due to arrays being continiguous!

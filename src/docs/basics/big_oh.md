## What is Big O

Big O is a way to categorize your algorithms time or memory requirements based on input. It is not
meant to be an exact measurement. It will not tell you how many CPU cycles it takes, instead it is
meant to generalize the growth of your algorithm.

### Why do we use it?

Often it will help us make decisions about what data structures and algorithms to use. Knowing how
they will perform can greatly help create the best possible program out there.

### Big O, said differently

As your input grows, how fast does computation or memory grow?

## Important concepts

### 1. Growth is with Respect to the Input

#### In the real world

obviously memory growing is not computationally free, but in the matter of thinking about
algorithms, we don't necessarily think about that.

In languages like Go or JavaScript you pay even heavier penalties because the memory can be kept
around, grows faster, and causes complete halts in your program for cleanup.

### 2. Constants are dropped

O(2N) -> O(N) and this makes sense. That is because Big O is meant to describe the upper bound of
the algorithm (the growth of the algorithm). The constant eventually becomes irrelevant.

Take the following:

- N = 1, O(10N) = 10, O(N^2) = 1
- N = 5, O(10N) = 50, O(N^2) = 25
- N = 100, O(10N) = 1,000, O(N^2) = 10,000 // 10x bigger
- N = 1000, O(10N) = 10,000, O(N^2) = 1,000,000 // 100x bigger
- N = 10000, O(10N) = 100,000, O(N^2) = 100,000,000 // 1000x bigger

#### There is practical vs theoretical differences

Just because N is faster than N^2, doesn't mean practically its always faster for smaller input.

Remember, we drop constants. Therefore, O(100N) is faster than O(N^2) but practically speaking,
you would probably win for some small set of input.

### 3. In BigO we often consider the worst case

Especially in interviews (i have never been asked for best, average, and worst case, just worst
case).

E = 69

Therefore, any string with E in it will terminate early (unless E is the last item in the list).

-> ITS STILL O(N)

![Big O Complexity](https://he-s3.s3.amazonaws.com/media/uploads/ece920b.png "Big O Complexity")

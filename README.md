# LeetCode Solutions in Java

A growing collection of my **LeetCode solutions written in Java**. Each problem is stored in its own directory with the solution and a problem-specific README.

This repository tracks my progress in data structures, algorithms, and writing efficient, readable Java code.

## Repository Overview

- **Language:** Java
- **Platform:** [LeetCode](https://leetcode.com/)
- **Solutions:** 9
- **Difficulty breakdown:** 4 Easy · 4 Medium · 1 Hard

## Problems Solved

| # | Problem | Difficulty | Main Topics | Time Complexity | Space Complexity |
|---:|---|---|---|---:|---:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | Array, HashMap | O(n) average | O(n) |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Array, Kadane's Algorithm, Dynamic Programming | O(n) | O(1) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | Array, Boyer–Moore Voting | O(n) | O(1) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | Array, Two Pointers, In-place Updates | O(n) | O(1) |
| 453 | [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/) | Medium | Array, Math | O(n) | O(1) |
| 462 | [Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/) | Medium | Array, Sorting, Median | O(n log n) | O(log n)* |
| 3505 | [Minimum Operations to Make Elements Within K Subarrays Equal](https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/) | Hard | Sliding Window, Median, TreeMap, Dynamic Programming | O(n log x + nk) | O(nk + n + x) |
| 3693 | [Climbing Stairs II](https://leetcode.com/problems/climbing-stairs-ii/) | Medium | Dynamic Programming | O(n) | O(n) |
| 3736 | [Minimum Moves to Equal Array Elements III](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/) | Easy | Array, Greedy, Math | O(n) | O(1) |

*Space complexity for problem 462 accounts for the sorting implementation's auxiliary stack space; exact implementation details can vary by Java runtime.

## Repository Structure

```text
Leetcode-main/
├── 0001-two-sum/
│   ├── 0001-two-sum.java
│   └── README.md
├── 0053-maximum-subarray/
│   ├── 0053-maximum-subarray.java
│   └── README.md
├── 0169-majority-element/
│   ├── 0169-majority-element.java
│   └── README.md
├── 0283-move-zeroes/
│   ├── 0283-move-zeroes.java
│   └── README.md
├── 0453-minimum-moves-to-equal-array-elements/
│   ├── 0453-minimum-moves-to-equal-array-elements.java
│   └── README.md
├── 0462-minimum-moves-to-equal-array-elements-ii/
│   ├── 0462-minimum-moves-to-equal-array-elements-ii.java
│   └── README.md
├── 3505-minimum-operations-to-make-elements-within-k-subarrays-equal/
│   ├── 3505-minimum-operations-to-make-elements-within-k-subarrays-equal.java
│   └── README.md
├── 3693-climbing-stairs-ii/
│   ├── 3693-climbing-stairs-ii.java
│   └── README.md
├── 3736-minimum-moves-to-equal-array-elements-iii/
│   ├── 3736-minimum-moves-to-equal-array-elements-iii.java
│   └── README.md
└── README.md
```

## Concepts and Patterns Practiced

- **Arrays:** traversal, aggregation, and in-place modification.
- **Hashing:** using a `HashMap` for efficient complement lookups.
- **Two Pointers:** moving non-zero elements while preserving relative order.
- **Greedy and Mathematics:** reducing operations to minimum, maximum, or median-based calculations.
- **Dynamic Programming:** Kadane's algorithm, staircase cost optimization, and selecting non-overlapping subarrays.
- **Sliding Window:** maintaining the median cost of each fixed-size window.
- **Ordered Maps:** using `TreeMap` structures to maintain values on either side of a running median.
- **Sorting and Median:** minimizing the total absolute difference by choosing a median.

## Running a Solution

The Java files use LeetCode's `Solution` class format. They are designed to be submitted to the corresponding problem on LeetCode, where the platform supplies the test harness.

To run a solution locally:

1. Install a Java Development Kit (JDK).
2. Open the problem's `.java` file.
3. Add any imports required by the solution.
4. Create a separate driver or `main` method with test cases.
5. Compile and run the driver.

Example:

```bash
javac Main.java
java Main
```

## Progress

I will keep adding solutions as I practice. The aim is not only to solve more problems, but also to understand the underlying pattern, analyze complexity, and improve the quality of each implementation.

## Connect

- **GitHub:** [Sneha](https://github.com/Sneha-2156)

---

*Built through consistent problem-solving practice, one problem at a time.*

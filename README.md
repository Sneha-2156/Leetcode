# LeetCode Solutions in Java

A collection of my **LeetCode problem solutions implemented in Java**. This repository documents my problem-solving practice, with solutions organized by LeetCode problem number and title.

The goal is to strengthen my understanding of data structures, algorithms, problem-solving patterns, and writing efficient Java code.

## Repository Structure

Each problem has its own directory containing the Java solution and the problem-specific README.

```text
Leetcode/
├── 0001-two-sum/
│   ├── 0001-two-sum.java
│   └── README.md
├── 0053-maximum-subarray/
│   ├── 0053-maximum-subarray.java
│   └── README.md
├── 0169-majority-element/
│   ├── 0169-majority-element.java
│   └── README.md
└── ...
```

## Problems Solved

| # | Problem | Main Concept / Technique | Time Complexity | Space Complexity |
|---:|---|---|---:|---:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | HashMap | O(n) average | O(n) |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Kadane's Algorithm, Dynamic Programming | O(n) | O(1) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Boyer–Moore Voting Algorithm | O(n) | O(1) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Two Pointers, In-place Array Manipulation | O(n) | O(1) |
| 453 | [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/) | Math, Array Traversal | O(n) | O(1) |
| 462 | [Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/) | Sorting, Median | O(n log n) | O(1) auxiliary* |
| 3693 | [Climbing Stairs II](https://leetcode.com/problems/climbing-stairs-ii/) | Dynamic Programming | O(n) | O(n) |
| 3736 | [Minimum Moves to Equal Array Elements III](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/) | Math, Array Traversal | O(n) | O(1) |

\*The sorting implementation may use additional space internally depending on the Java sorting implementation.

## Concepts Practiced

- **Arrays:** traversal, in-place updates, and aggregate calculations.
- **Hashing:** using a `HashMap` to improve lookup efficiency.
- **Two Pointers:** processing arrays without allocating another array.
- **Greedy / Mathematical Reasoning:** deriving optimal operations using minimums, maximums, and medians.
- **Dynamic Programming:** building optimal answers from previously computed states.
- **Algorithmic Patterns:** Kadane's algorithm and Boyer–Moore voting.

## Language and Tools

- **Language:** Java
- **Platform:** [LeetCode](https://leetcode.com/)
- **Editor:** Any Java-compatible IDE or code editor (for example, IntelliJ IDEA or VS Code)
- **Version Control:** Git and GitHub

## Running the Solutions

These files are written in LeetCode's submission format. The `Solution` class is intended to be submitted to the corresponding LeetCode problem, where the platform provides the required test harness.

To run a solution locally:
1. Open the relevant `.java` file.
2. Add any required imports (such as `java.util.HashMap` or `java.util.Arrays`).
3. Add a `main` method and test cases if you want to execute it outside LeetCode.
4. Compile and run it with a Java Development Kit (JDK).

Example:

```bash
javac Main.java
java Main
```

## Progress

This repository is a work in progress. I will continue adding solutions as I solve more problems, and improve earlier implementations when I discover clearer or more efficient approaches.

## Connect

- GitHub: [Sneha](https://github.com/Sneha-2156)

<div align="center">

# LeetCode Solutions in Java

**15 problems solved · clean Java · time and space stated for every one**

![Solved](https://img.shields.io/badge/Solved-15-2ea44f?style=flat-square)
![Easy](https://img.shields.io/badge/Easy-6-00B8A3?style=flat-square)
![Medium](https://img.shields.io/badge/Medium-7-FFB800?style=flat-square)
![Hard](https://img.shields.io/badge/Hard-2-EF4743?style=flat-square)
![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)

[Problem Index](#problem-index) · [Patterns](#patterns) · [Highlights](#highlights) · [Run Locally](#run-locally) · [Connect](#connect)

</div>

---

## About

My Java solutions to LeetCode problems. I solve them to understand *why* an approach works, not just to get an Accepted verdict. Every problem has its own folder with the solution and the original problem statement.

Each solution follows four habits:

- **Right tool first.** The data structure fits the access pattern: hash map, stack, `TreeMap`.
- **Complexity stated.** Time and space are listed for every problem below.
- **Edge cases handled.** Large results use `long` and modular arithmetic where overflow is possible (1524, 3505, 3789).
- **Readable code.** Clear names, small helpers, no tricks for their own sake.

Most recent problems come from LeetCode's Daily Challenge. The rest come from study lists.

---

## Problem Index

Sorted by LeetCode number. Click the problem name for the LeetCode page and **Code** for my solution.

| # | Problem | Level | Technique | Time | Space | |
|---:|---|:---:|---|:---:|:---:|:---:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 🟢 Easy | HashMap, one pass | O(n) | O(n) | [Code](./0001-two-sum/) |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | 🟡 Medium | Kadane's algorithm, DP | O(n) | O(1) | [Code](./0053-maximum-subarray/) |
| 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | 🟡 Medium | Stack | O(n) | O(n) | [Code](./0002-evaluate-reverse-polish-notation/)¹ |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | 🟢 Easy | Boyer–Moore voting | O(n) | O(1) | [Code](./0169-majority-element/) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | 🟢 Easy | Two pointers, in-place | O(n) | O(1) | [Code](./0283-move-zeroes/) |
| 453 | [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/) | 🟡 Medium | Math, arrays | O(n) | O(1) | [Code](./0453-minimum-moves-to-equal-array-elements/) |
| 462 | [Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/) | 🟡 Medium | Sorting, median | O(n log n) | O(log n)² | [Code](./0462-minimum-moves-to-equal-array-elements-ii/) |
| 1524 | [Number of Sub-arrays With Odd Sum](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/) | 🟡 Medium | Prefix sums, parity counting | O(n) | O(1) | [Code](./1524-number-of-sub-arrays-with-odd-sum/) |
| 2243 | [Calculate Digit Sum of a String](https://leetcode.com/problems/calculate-digit-sum-of-a-string/) | 🟢 Easy | String simulation | O(n) per round | O(n) | [Code](./2243-calculate-digit-sum-of-a-string/) |
| 2911 | [Minimum Changes to Make K Semi-palindromes](https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/) | 🔴 Hard | Precomputation, partition DP | ≈ O(n³ log n + n²k) | O(n²) | [Code](./2911-minimum-changes-to-make-k-semi-palindromes/) |
| 3364 | [Minimum Positive Sum Subarray](https://leetcode.com/problems/minimum-positive-sum-subarray/) | 🟢 Easy | Subarray enumeration | O(n²) | O(1) | [Code](./3364-minimum-positive-sum-subarray/) |
| 3505 | [Minimum Operations to Make Elements Within K Subarrays Equal](https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/) | 🔴 Hard | Sliding-window median (TreeMaps), DP | O(n log x + nk)³ | O(nk) | [Code](./3505-minimum-operations-to-make-elements-within-k-subarrays-equal/) |
| 3693 | [Climbing Stairs II](https://leetcode.com/problems/climbing-stairs-ii/) | 🟡 Medium | Dynamic programming | O(n) | O(n) | [Code](./3693-climbing-stairs-ii/) |
| 3736 | [Minimum Moves to Equal Array Elements III](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/) | 🟢 Easy | Greedy, math | O(n) | O(1) | [Code](./3736-minimum-moves-to-equal-array-elements-iii/) |
| 3789 | [Minimum Cost to Acquire Required Items](https://leetcode.com/problems/minimum-cost-to-acquire-required-items/) | 🟡 Medium | Greedy, math | O(1) | O(1) | [Code](./3789-minimum-cost-to-acquire-required-items/) |

<sub>¹ The folder is named `0002-…` after its position in a LeetCode study list. The official problem number is 150.<br>
² Space comes from the sort's recursion stack. No extra array is allocated.<br>
³ `n` is the array length, `x` the subarray length and `k` the number of subarrays.</sub>

---

## Patterns

The same ideas keep coming back. This table maps each pattern to the signal that points to it and to the problems here that use it.

| Pattern | Spot it when… | Problems |
|---|---|---|
| **Hash map lookup** | You need a complement or an earlier element in O(1). | 1 |
| **Two pointers, in-place** | An array must be rearranged without extra memory. | 283 |
| **Stack** | The most recent unresolved item matters, as in postfix expressions or nesting. | 150 |
| **Voting / counting** | One value is guaranteed to fill more than half the array. | 169 |
| **Kadane / running DP** | You want the best contiguous run ending at each index. | 53 |
| **Prefix sums and parity** | You count subarrays by a property of their sum. | 1524 |
| **Median** | You minimize total absolute distance to one target value. | 462, 3505 |
| **Math reformulation** | An operation can be rewritten as a simpler equivalent. Incrementing *n − 1* elements is the same as decrementing one. | 453, 3736 |
| **Greedy** | Each choice has an obvious cheapest option, such as a bundle versus buying separately. | 3736, 3789 |
| **Partition DP** | You split a sequence into *k* segments at minimum total cost. | 2911, 3505 |
| **Step DP** | Each state depends on a few earlier states plus a transition cost. | 3693 |
| **Ordered multiset** | You need order statistics while a window slides. | 3505 |
| **Simulation / enumeration** | The process is spelled out, or brute force is clear and fast enough. | 2243, 3364 |

---

## Highlights

**1524 · Number of Sub-arrays With Odd Sum** 🟡
A subarray sum is odd exactly when its two bounding prefix sums differ in parity. Keep a count of even and odd prefixes seen so far, and each new prefix adds that many subarrays. One pass, O(1) space. [Code →](./1524-number-of-sub-arrays-with-odd-sum/)

**3789 · Minimum Cost to Acquire Required Items** 🟡
Buy matching pairs at the cheaper of "one combined item" or "one of each". Then cover the leftover of the larger need with the cheaper of the single item or the combined item. Math only, O(1). [Code →](./3789-minimum-cost-to-acquire-required-items/)

**3505 · Minimum Operations to Make Elements Within K Subarrays Equal** 🔴
1. Making a window's elements equal costs least at the window's **median**.
2. Two `TreeMap` multisets split the sliding window into a lower and an upper half, each with a running sum. This gives every window's cost in O(log x) per slide.
3. A DP over positions then picks `k` **non-overlapping** windows with the lowest total cost.

[Code →](./3505-minimum-operations-to-make-elements-within-k-subarrays-equal/)

**2911 · Minimum Changes to Make K Semi-palindromes** 🔴
1. **Precompute** `cost[i][j]`, the fewest letter changes that turn `s[i..j]` into a semi-palindrome. Try every proper divisor `d` of the length and compare characters inside each stride-`d` group.
2. **Partition DP** `dp[i][parts]` splits the string into exactly `k` pieces at minimum total cost.

[Code →](./2911-minimum-changes-to-make-k-semi-palindromes/)

---

## Run Locally

Solutions use LeetCode's `Solution` class format. LeetCode supplies the imports and the test harness, so running one locally takes three steps:

1. Copy the solution into a file named `Solution.java`.
2. Add `import java.util.*;` at the top.
3. Add a driver class next to it. For example, for Two Sum:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); // [0, 1]
    }
}
```

```bash
javac Solution.java Main.java
java Main
```

## Repository Layout

```text
Leetcode/
├── README.md
├── 0001-two-sum/
│   ├── 0001-two-sum.java        # solution in LeetCode's Solution class format
│   └── README.md                # problem statement
├── 0053-maximum-subarray/
│   ├── 0053-maximum-subarray.java
│   └── README.md
└── …                            # one folder per problem
```

## Up Next

**Binary Search · Linked Lists · Trees and Graphs · Heaps · Backtracking · more Dynamic Programming**

---

## Connect

I am building a strong foundation in Java, data structures and algorithms on the way to full-stack software engineering.

[![GitHub](https://img.shields.io/badge/GitHub-Sneha--2156-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Sneha-2156)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Sneha%20M%20B-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sneha-m-b-09a70038a)

<div align="center">

<sub>If this repository helped you, consider giving it a ⭐</sub>

</div>

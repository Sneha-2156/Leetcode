<div align="center">

<img src="./assets/banner.svg" alt="Sneha M. B. — LeetCode Java Solutions" width="100%"/>

<br/>

**Java · Data Structures & Algorithms · Full Stack · Problem Solving**

*I build a strong engineering foundation through deliberate problem-solving, clean Java implementations, and a focus on understanding the trade-offs behind every algorithm.*

<p>
  <a href="https://github.com/Sneha-2156">
    <img src="https://img.shields.io/badge/GitHub-Sneha--2156-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
  <a href="https://www.linkedin.com/in/sneha-m-b-09a70038a">
    <img src="https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>
  <a href="https://leetcode.com/">
    <img src="https://img.shields.io/badge/LeetCode-Problem%20Solving-FFA116?style=for-the-badge&logo=leetcode&logoColor=black" alt="LeetCode"/>
  </a>
</p>

<p>
  <img src="https://img.shields.io/badge/Solved-15-2ea44f?style=flat-square" alt="Solved: 15"/>
  <img src="https://img.shields.io/badge/Easy-6-00B8A3?style=flat-square" alt="Easy: 6"/>
  <img src="https://img.shields.io/badge/Medium-7-FFB800?style=flat-square" alt="Medium: 7"/>
  <img src="https://img.shields.io/badge/Hard-2-EF4743?style=flat-square" alt="Hard: 2"/>
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Language: Java"/>
</p>

<p>
  <a href="#overview">Overview</a> ·
  <a href="#progress">Progress</a> ·
  <a href="#problem-index">Problem Index</a> ·
  <a href="#pattern-playbook">Pattern Playbook</a> ·
  <a href="#signature-solutions">Signature Solutions</a> ·
  <a href="#run-locally">Run Locally</a>
</p>

</div>

<img src="./assets/divider.svg" alt="" width="100%"/>

## Overview

This repository holds my Java solutions to LeetCode problems. It is meant as a practical reference for the data structures and algorithmic techniques behind reliable, efficient software.

The goal is more than an accepted submission. Each solution is written with four habits in mind:

| 🧠 Right tool first | ⏱️ Complexity stated | 🛡️ Edge cases handled | 📖 Easy to read |
|:---|:---|:---|:---|
| The data structure is chosen for the access pattern: hash map, stack, ordered map. | Every problem below lists its time and space cost. | Large results use `long` and modular arithmetic where overflow is possible, as in 1524, 3505 and 3789. | Clear names, small helpers, and the problem statement stored beside the code. |

<img src="./assets/divider.svg" alt="" width="100%"/>

## Progress

<div align="center">
  <img src="./assets/stats.svg" alt="15 problems solved: 6 easy, 7 medium, 2 hard" width="820"/>
</div>

<br/>

**How I approach each problem**

```mermaid
flowchart LR
    A[Read the constraints] --> B[Brute-force baseline]
    B --> C[Spot the pattern]
    C --> D[Optimize]
    D --> E[Dry-run edge cases]
    E --> F[State time and space]
```

<img src="./assets/divider.svg" alt="" width="100%"/>

## Problem Index

Every solved problem, sorted by LeetCode number. Click **Code** for the solution and the full problem statement.

| # | Problem | Level | Technique | Time | Space |
|---:|---|:---:|---|:---:|:---:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) · [Code](./0001-two-sum/) | 🟢 Easy | Arrays, HashMap (one pass) | O(n) | O(n) |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) · [Code](./0053-maximum-subarray/) | 🟡 Medium | Kadane's Algorithm, DP | O(n) | O(1) |
| 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) · [Code](./0002-evaluate-reverse-polish-notation/)¹ | 🟡 Medium | Stack | O(n) | O(n) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) · [Code](./0169-majority-element/) | 🟢 Easy | Boyer–Moore Voting | O(n) | O(1) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) · [Code](./0283-move-zeroes/) | 🟢 Easy | Two Pointers, In-place Updates | O(n) | O(1) |
| 453 | [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/) · [Code](./0453-minimum-moves-to-equal-array-elements/) | 🟡 Medium | Mathematics, Arrays | O(n) | O(1) |
| 462 | [Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/) · [Code](./0462-minimum-moves-to-equal-array-elements-ii/) | 🟡 Medium | Sorting, Median | O(n log n) | O(log n)² |
| 1524 | [Number of Sub-arrays With Odd Sum](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/) · [Code](./1524-number-of-sub-arrays-with-odd-sum/) | 🟡 Medium | Prefix Sums, Parity Counting | O(n) | O(1) |
| 2243 | [Calculate Digit Sum of a String](https://leetcode.com/problems/calculate-digit-sum-of-a-string/) · [Code](./2243-calculate-digit-sum-of-a-string/) | 🟢 Easy | String Simulation | O(n) per round | O(n) |
| 2911 | [Minimum Changes to Make K Semi-palindromes](https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/) · [Code](./2911-minimum-changes-to-make-k-semi-palindromes/) | 🔴 Hard | Precomputation, Partition DP | ≈ O(n³ log n + n²k) | O(n²) |
| 3364 | [Minimum Positive Sum Subarray](https://leetcode.com/problems/minimum-positive-sum-subarray/) · [Code](./3364-minimum-positive-sum-subarray/) | 🟢 Easy | Subarray Enumeration | O(n²) | O(1) |
| 3505 | [Minimum Operations to Make Elements Within K Subarrays Equal](https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/) · [Code](./3505-minimum-operations-to-make-elements-within-k-subarrays-equal/) | 🔴 Hard | Sliding-Window Median (TreeMaps), DP | O(n log x + nk) | O(nk) |
| 3693 | [Climbing Stairs II](https://leetcode.com/problems/climbing-stairs-ii/) · [Code](./3693-climbing-stairs-ii/) | 🟡 Medium | Dynamic Programming | O(n) | O(n) |
| 3736 | [Minimum Moves to Equal Array Elements III](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/) · [Code](./3736-minimum-moves-to-equal-array-elements-iii/) | 🟢 Easy | Greedy, Mathematics | O(n) | O(1) |
| 3789 | [Minimum Cost to Acquire Required Items](https://leetcode.com/problems/minimum-cost-to-acquire-required-items/) · [Code](./3789-minimum-cost-to-acquire-required-items/) | 🟡 Medium | Greedy, Mathematics | O(1) | O(1) |

<sub>¹ The folder is named `0002-…` after its position in a LeetCode study list. The official problem number is 150.<br>
² Space is dominated by the sort's recursion stack. No extra array is allocated.<br>
For 3505, `n` is the array length, `x` the subarray length and `k` the number of subarrays.</sub>

<img src="./assets/divider.svg" alt="" width="100%"/>

## Pattern Playbook

The same ideas keep returning. This table maps each pattern to the signal that points to it and to the problems in this repository that use it.

| Pattern | Spot it when… | Problems |
|---|---|---|
| **Hash map lookup** | You need a complement or earlier element in O(1). | 1 |
| **Two pointers, in-place** | An array must be rearranged without extra memory. | 283 |
| **Stack** | The most recent unresolved item matters, as in postfix expressions or nesting. | 150 |
| **Voting / counting** | One value is guaranteed to occupy more than half of the array. | 169 |
| **Kadane / running DP** | You want the best contiguous run that ends at each index. | 53 |
| **Prefix sums & parity** | You count subarrays by a property of their sum. | 1524 |
| **Median** | You minimize total absolute distance to a single target value. | 462, 3505 |
| **Math reformulation** | An operation can be rewritten as a simpler equivalent. For example, incrementing *n − 1* elements is the same as decrementing one. | 453, 3736 |
| **Greedy** | Each choice has an obvious cheapest option, such as a bundle versus buying separately. | 3736, 3789 |
| **Partition DP** | You split a sequence into *k* segments at minimum total cost. | 2911, 3505 |
| **Step DP** | Each state depends on a few earlier states with a transition cost. | 3693 |
| **Ordered multiset** | You maintain order statistics while a window slides. | 3505 |
| **Simulation / enumeration** | The process is spelled out, or a brute-force baseline is clear and fast enough. | 2243, 3364 |

<img src="./assets/divider.svg" alt="" width="100%"/>

## Signature Solutions

### 1524 · Number of Sub-arrays With Odd Sum &nbsp;🟡

**Insight:** a subarray's sum is odd exactly when its two bounding prefix sums have different parity. Counting how many even and odd prefixes have appeared so far answers the question in one pass.

```java
class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        long even = 1;   // the empty prefix counts as even
        long odd = 0;
        long sum = 0;
        long ans = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                ans += odd;   // pair with an earlier odd prefix
                even++;
            } else {
                ans += even;  // pair with an earlier even prefix
                odd++;
            }
            ans %= MOD;
        }
        return (int) ans;
    }
}
```

**Complexity:** O(n) time, O(1) space. &nbsp;[Full folder →](./1524-number-of-sub-arrays-with-odd-sum/)

### 3789 · Minimum Cost to Acquire Required Items &nbsp;🟡

**Insight:** buy matching pairs at the cheaper of "one combined item" or "one of each". Then cover the leftover of the larger need with the cheaper of the single item or a combined item.

```java
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long both = Math.min(costBoth, cost1 + cost2);
        long ans = (long) Math.min(need1, need2) * both;
        if (need1 > need2) {
            ans += (long) (need1 - need2) * Math.min(cost1, costBoth);
        } else {
            ans += (long) (need2 - need1) * Math.min(cost2, costBoth);
        }
        return ans;
    }
}
```

**Complexity:** O(1) time, O(1) space. &nbsp;[Full folder →](./3789-minimum-cost-to-acquire-required-items/)

### 3505 · Minimum Operations to Make Elements Within K Subarrays Equal &nbsp;🔴

1. The cost of making a window's elements equal is smallest at the window's **median**.
2. Two `TreeMap` multisets split the sliding window into a lower half and an upper half, with a running sum for each. This gives every window's cost in O(log x) per slide.
3. A DP over positions then picks `k` **non-overlapping** windows with the lowest total cost.

[Full folder →](./3505-minimum-operations-to-make-elements-within-k-subarrays-equal/)

### 2911 · Minimum Changes to Make K Semi-palindromes &nbsp;🔴

1. **Precompute** `cost[i][j]`, the fewest letter changes that turn `s[i..j]` into a semi-palindrome. This tries every proper divisor `d` of the length and compares characters inside each stride-`d` group.
2. **Partition DP** `dp[i][parts]` splits the string into exactly `k` pieces at minimum total cost.

[Full folder →](./2911-minimum-changes-to-make-k-semi-palindromes/)

<img src="./assets/divider.svg" alt="" width="100%"/>

## Repository Layout

```text
Leetcode/
├── README.md
├── assets/                      # banner, stats card, dividers
├── 0001-two-sum/
│   ├── 0001-two-sum.java        # solution in LeetCode's Solution class format
│   └── README.md                # problem statement
├── 0053-maximum-subarray/
│   ├── 0053-maximum-subarray.java
│   └── README.md
└── …                            # one folder per problem
```

## Run Locally

<details>
<summary><b>Steps to compile and run a solution</b></summary>

<br/>

Solutions use LeetCode's `Solution` class format. LeetCode supplies the imports and the test harness, so running them locally takes three small steps:

1. Copy the solution into a file named `Solution.java`.
2. Add `import java.util.*;` at the top.
3. Add a driver class next to it, for example:

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

</details>

## Up Next

Planned topics: **Binary Search · Linked Lists · Trees & Graphs · Heaps · Backtracking · more Dynamic Programming**

<img src="./assets/divider.svg" alt="" width="100%"/>

## Connect

I'm interested in software engineering, backend development, and a deeper understanding of the fundamentals that make software efficient and dependable.

<p>
  <a href="https://github.com/Sneha-2156">
    <img src="https://img.shields.io/badge/GitHub-github.com%2FSneha--2156-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
  <a href="https://www.linkedin.com/in/sneha-m-b-09a70038a">
    <img src="https://img.shields.io/badge/LinkedIn-sneha--m--b-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>
</p>

<div align="center">

<br/>

**Clear thinking. Efficient code. Strong fundamentals.**

<sub>If this repository helped you, consider giving it a ⭐</sub>

</div>

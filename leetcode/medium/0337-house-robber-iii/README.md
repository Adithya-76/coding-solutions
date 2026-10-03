# House Robber III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The thief has found himself a new place for his thievery again. There is only one entrance to this area, called `root`.

Besides the `root`, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if  **two directly-linked houses were broken into on the same night**.

Given the `root` of the binary tree, return  *the maximum amount of money the thief can rob  **without alerting the police***.

 

 **Example 1:** 

```
Input: root = [3,2,3,null,3,null,1]
Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.

```

 **Example 2:** 

```
Input: root = [3,4,5,1,3,null,1]
Output: 9
Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- 0 <= Node.val <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.7 MB (beats 42.35%)  
**Submitted:** 2026-10-03T06:47:23.743Z  

```java
class Solution {
    public int rob(TreeNode root) {
        int[] option = traverse(root);
        return Math.max(option[0], option[1]);
    }

    public int[] traverse(TreeNode root) {
        if (root == null)
            return new int[2];

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        int[] option = new int[2];

        option[0] = root.val + left[1] + right[1];
        option[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return option;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/house-robber-iii/)
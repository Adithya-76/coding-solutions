# leaf-under-budget

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T13:31:25.655Z  

```py
class Solution:
    def getCount(self, root, k):
        levels = []

        def dfs(node, level):
            if node is None:
                return

            # Leaf node
            if node.left is None and node.right is None:
                levels.append(level)
                return

            dfs(node.left, level + 1)
            dfs(node.right, level + 1)

        dfs(root, 1)

        # Choose cheapest leaves first
        levels.sort()

        total = 0
        count = 0

        for cost in levels:
            if total + cost <= k:
                total += cost
                count += 1
            else:
                break

        return count

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/leaf-under-budget/1)
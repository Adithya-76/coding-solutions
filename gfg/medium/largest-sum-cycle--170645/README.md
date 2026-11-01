# largest-sum-cycle--170645

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T19:06:45.433Z  

```py
class Solution:
    def largestSumCycle(self, edge):
        # code here
        v = [-1] * len(edge)
        def visit(i:int, s:int) -> int:
            if edge[i] <0:
                return -1
            if v[i] >= 0:
                return s+i -v[i]
            v[i] = s+i
            result = visit(edge[i],s+i)
            edge[i] = -1
            return result
        return max(visit(i,0) for i in range(len(edge)))
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-sum-cycle--170645/1)
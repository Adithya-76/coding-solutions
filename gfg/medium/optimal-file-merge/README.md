# optimal-file-merge

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T05:40:21.626Z  

```py
class Solution:
    def minComputation(self, files):
        # code here
        from heapq import heappop, heapreplace, heapify
        heapify(files)
        cost = 0
        while len(files) > 1:
            f = heappop(files) + files[0]
            cost += f
            heapreplace(files ,f)
        return cost
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/optimal-file-merge/1)
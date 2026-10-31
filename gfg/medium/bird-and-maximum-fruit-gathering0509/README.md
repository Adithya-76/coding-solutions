# bird-and-maximum-fruit-gathering0509

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T17:15:17.376Z  

```py
class Solution:
    def maxPackages(self, arr: list[int], totalTime: int) -> int:
        # code here
        n = len(arr)
        if totalTime >=n:
            return sum(arr)
        current_sum = sum(arr[:totalTime])
        max_packages = current_sum
        for i in range(totalTime ,n):
            current_sum += arr[i] - arr[i-totalTime]
            if current_sum > max_packages:
                max_packages = current_sum
        return max_packages
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1)
# maximum-sum-subarray--143510

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T12:12:59.745Z  

```py
class Solution:

    def maximumSubarray(self, arr: list[int]) -> int:
        """ code here """
        dp0 = arr[0]
        dp1 = arr[0] * arr[0]
        ans = max(dp0,dp1)
        for x in arr[1:]:
            new_dp0 = max(x, dp0+x)
            new_dp1 = max(x*x , dp1+x,dp0+x*x)
            dp0 = new_dp0
            dp1 = new_dp1
            ans = max(ans , dp0 ,dp1)
        return ans
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-sum-subarray--143510/1)
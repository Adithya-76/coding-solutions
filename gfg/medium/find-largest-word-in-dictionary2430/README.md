# find-largest-word-in-dictionary2430

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T12:35:33.851Z  

```py
class Solution:
    def findLongestWord(self, s: str, d: list) -> str:
        # code here
        from bisect import bisect_left

        chars = [[] for _ in range(26)]
        for i, e in enumerate(s):
            idx = ord(e)-ord('a')
            chars[idx].append(i)

        def ok(ss, chars):
            start = 0
            for e in ss:
                lst = chars[ord(e)-ord('a')]
                i = bisect_left(lst, start)
                if i == len(lst):
                    return False
                start = lst[i]+1
            return True

        ret = ""
        for ss in d:
            if ok(ss, chars):
                if len(ss) > len(ret):
                    ret = ss
                elif len(ss) == len(ret):
                    ret = min(ret, ss)

        return ret
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-largest-word-in-dictionary2430/1)
# Longest Common Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings  **s1**  and  **s2**, determine the length of the  **longest substring**  that appears in both strings.

 **Examples:** 

```
Input: s1 = "ABCDGH", s2 = "ACDGHR"
Output: 4
Explanation: The longest common substring is "CDGH" with a length of 4.

```

```
Input: s1 = "abc", s2 = "acb"
Output: 1
Explanation: The longest common substrings are "a", "b", "c" all having length 1.

```

```
Input: s1 = "YZ", s2 = "yz"
Output: 0
Explanation: Comparison is case-sensitive, so 'Y' ≠ 'y' and 'Z' ≠ 'z'. Hence, no common substring exists.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T06:09:49.544Z  

```java
class Solution {
    public int longCommSubstr(String s1, String s2) {
               int m = s1.length();
               int n = s2.length();
               int[][] dp = new int[m+1][n+1];
               int maxLen = 0;
               for(int i = 1; i<=m; i++){
                   for(int j = 1; j<=n; j++){
                       if(s1.charAt(i-1)==s2.charAt(j-1)) {
                           dp[i][j] = dp[i-1][j-1]+1;
                           maxLen = Math.max(maxLen , dp[i][j]);
                       }
                   }
               }
               return maxLen;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1)
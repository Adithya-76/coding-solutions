# House Robber II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are  **arranged in a circle.**  That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and  **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return  *the maximum amount of money you can rob tonight  **without alerting the police***.

 

 **Example 1:** 

```
Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

```

 **Example 2:** 

```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

```

 **Example 3:** 

```
Input: nums = [1,2,3]
Output: 3

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 22.92%)  
**Submitted:** 2026-09-26T05:30:31.806Z  

```java
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<2) return nums[0];
        int skip_last_house[] = new int[n-1];
        int skip_first_house[] =new int[n-1];
        for(int i =0; i<n-1; i++ ){
            skip_last_house[i] = nums[i];
            skip_first_house[i] = nums[i+1];
        }
        int loot_skiplast = robhelper(skip_last_house, n-1);
        int loot_skipfirst = robhelper(skip_first_house, n-1);
        return Math.max(loot_skiplast , loot_skipfirst);
    }
        public int robhelper(int house[],int n){
       n = house.length;
        if(n==0) return 0;
        if(n==1) return house[0];
        int[] dp = new int[n];
        dp[0] = house[0];
        dp[1] = Math.max(house[0], house[1]);
        for(int i =2; i<n; i++){
            dp[i] = Math.max(dp[i-2]+house[i],dp[i-1]);
        }
        return dp[n-1];
        }
}

```

---

[View on LeetCode](https://leetcode.com/problems/house-robber-ii/)
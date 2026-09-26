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

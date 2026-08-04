class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost,dp),helper(1,cost,dp));
    }
    int helper(int i,int[] cost,int[] dp){
        int n = cost.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int cost1 = cost[i] + helper(i+1,cost,dp);
        int cost2 = cost[i] + helper(i+2,cost,dp);
        dp[i] = Math.min(cost1,cost2);
        return dp[i];
    }
}
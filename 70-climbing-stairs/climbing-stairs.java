// class Solution {
//     public int climbStairs(int n) {
        

//     }
// } 
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);

    }

    int helper(int n, int[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int step1 = helper(n-1,dp);
        int step2 = helper(n-2,dp);
        dp[n] = step1 + step2;
        return dp[n];
    }
}    
// class Solution {
//     public int climbStairs(int n) {
//        if(n == 0 || n == 1){
//         return 1;
//        } 
      
//       int step1 =  climbStairs(n-1);
//        int step2 = climbStairs(n-2);
//        return step1 + step2;
//     }
// }
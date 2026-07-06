class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int first = 0;
        int second = nums[n-1];
        int current = 0;
        for(int i=n-2; i>=0; i--){
            int rob = nums[i] + first;
            int skip = second;
            current = Math.max(rob,skip);
            first = second;
            second = current;
        }
        return current;
    }
}



// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int dp[] = new int[n+1];
//         dp[n] = 0;
//         dp[n-1] = nums[n-1];
//         for(int i = n-2; i>=0; i--){
//             int rob = nums[i] + dp[i+2];
//             int skip = dp[i+1];
//             int max = Math.max(skip,rob);
//             dp[i] = max;
//         }
//     return dp[0];
//     }
//}
// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int dp[] = new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(0,nums,dp);

//     }
//     int helper(int index, int []nums, int []dp){
//         if(index>=nums.length){
//             return 0;
//         }

//         if(dp[index]!=-1){
//             return dp[index];
//         }
//         int rob = nums[index] + helper(index + 2,nums,dp);
//         int skip = helper(index + 1,nums,dp);
//         int max = Math.max(rob,skip);
//         dp[index] = max;
//         return dp[index]; 
//     }
// }

// class Solution {
//     public int rob(int[] nums) {
//         return helper(0,nums);
//     }

//     int helper(int index, int[] nums) {
//         if(index>=nums.length){
//             return 0;
//         }

//         int rob = nums[index] + helper(index + 2, nums);

//         int skip = helper(index + 1, nums);
//         int max = Math.max(rob, skip);
//         return max;
//     }
// }
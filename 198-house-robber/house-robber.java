// class Solution {
//     public int rob(int[] nums) {

//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);

    }
    int helper(int index, int []nums, int []dp){
        if(index>=nums.length){
            return 0;
        }

        if(dp[index]!=-1){
            return dp[index];
        }
        int rob = nums[index] + helper(index + 2,nums,dp);
        int skip = helper(index + 1,nums,dp);
        int max = Math.max(rob,skip);
        dp[index] = max;
        return dp[index]; 
    }
}

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
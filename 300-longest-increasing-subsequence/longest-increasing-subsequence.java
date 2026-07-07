//space optimisation
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int tailSize = 0;
        for(int num : nums){
            int low = 0;
            int high = tailSize;
            while(low < high){
                int mid = (low + high)/2;
                if(tails[mid]<num){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
            tails[low] = num;
            if(low == tailSize){
                tailSize++;
            }
        }
        return tailSize;
    }
}





//Approach -3 tabulation 
// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int dp[] = new int[n+1];
//         Arrays.fill(dp,1);
//         for(int current = 1; current<n; current++){
//             for(int prev = 0; prev<current; prev++){
//                 if(nums[prev]<nums[current]){
//                     dp[current] = Math.max(dp[current],dp[prev]+1);
//                 }
//             }
//         }
//        int ans = 1;
//        for(int val : dp){
//         ans = Math.max(val,ans);
//        }
//        return ans;
//     }
// }
// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         return helper(0,-1,nums);
//     }
//     int helper(int currIndex , int prevIndex,int nums[]){
//         if(i==nums.length){
//             return 0;
//         }

//         int skip = helper(currIndex + ,prevIndex, nums);
//         int include = 0;
//         if(prevIndex == -1 || nums[currIndex]>nums[prevIndex]]{
//             include = 1 + (currIndex + 1,currIndex,nums);
//         }
//        return Math.max(skip,inlude,;) 
//     }
// }
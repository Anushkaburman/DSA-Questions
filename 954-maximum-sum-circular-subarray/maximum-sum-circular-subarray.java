class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int sum = 0;
        int maxSum = nums[0];
        for(int num : nums){
            sum += num;
            sum = Math.max(num,sum);
            maxSum = Math.max(maxSum , sum); 
        }
        int currSum = 0;
        int minSum = nums[0];
        for(int num : nums){
            currSum = Math.min(num,currSum + num);
            minSum = Math.min(currSum , minSum);
        }
        
        int result = Math.max(maxSum,totalSum-minSum);
        
        if(result == 0){
            return maxSum;
        }
        return result;
    }
}
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
       int[] maxLeft = new int[n];
       maxLeft[0] = nums[0];
       int max = maxLeft[0];
       int[] minRight = new int[n];
       minRight[0] = nums[n-1];
       int min = minRight[0]; 
       for(int i=1; i<nums.length; i++){
        max = Math.max(nums[i],max);
        maxLeft[i] = max; 
       }
       for(int i=n-1; i>0; i--){
        min = Math.min(nums[i],min);
        minRight[i] = min; 
       } 
       for(int i=0; i<n-1; i++){
        if(maxLeft[i]<=minRight[i+1]){
            return i+1;
        }
       }
       return -1;
    }
}
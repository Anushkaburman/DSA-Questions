class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;;
        for(int i=0; i<=nums.length-k; i++){
            int sum = 0;
            for(int j = i; j<i+k; j++){
                sum = sum + nums[j];
            }
            maxAverage = Math.max(maxAverage,(double)sum/k);
        }
        return maxAverage;
    }
}
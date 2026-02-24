class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }
        int maxSum = sum;
        for(int right = k; right<nums.size(); right++){
            int left = right - k;
            sum = sum - nums[left] + nums[right];
            maxSum = max(sum,maxSum);
        }
        return (double)maxSum/k; 
    }
};
class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int sum = 0 ;
        int sum2 = 0;
        int n = nums.size();
        for(int i = 0; i<=n-1; i++){
            sum += nums[i];

            while(nums[i] > 0){
                int r = nums[i] % 10;
                sum2 = sum2 + r;
                nums[i] = nums[i]/10;
            }
        }
        return abs(sum-sum2);
        

    }
};
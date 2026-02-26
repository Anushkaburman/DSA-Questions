class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        int ans = INT_MAX;
        sort(nums.begin(), nums.end());
        if (k == 1) {
            return 0;
        } else {
            for (int i = 0; i + k - 1 < nums.size(); i++) {
                int diff =  nums[i + k - 1] - nums[i];
                ans = min(ans, diff);
            }
        }
        return ans;
    }
};
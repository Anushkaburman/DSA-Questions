class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int maxel = *max_element(nums.begin(),nums.end());
        int minel = *min_element(nums.begin(),nums.end());

        return max(0, (maxel-k)-(minel+k));
    }
};
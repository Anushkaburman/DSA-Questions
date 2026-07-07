class Solution {
public:
    int maxProduct(vector<int>& nums) {
       int minProd = nums[0];
        int maxProd = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.size(); i++){
            int tempMin = minProd;
            int tempMax = maxProd;
            minProd = min({nums[i],nums[i]*tempMin,nums[i]*tempMax});
            maxProd = max({nums[i],nums[i]*tempMax,nums[i]*tempMin});
            ans = max(maxProd,ans);
        }
       return ans;
    }
};
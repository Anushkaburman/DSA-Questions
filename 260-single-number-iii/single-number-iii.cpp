class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        unordered_map<int,int>mp;
        vector<int>ans;
        for(int num : nums){
            mp[num]++;
        }
        for(auto val : nums){
            if(mp[val]==1){
                ans.push_back(val);
            }
        }
        return ans;
    }
};
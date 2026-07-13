class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int>mp;
        for(int num : nums){
            mp[num]++;
        }
        for(auto val : nums){
            if(mp[val]==1){
                return val;
                break;
            }
        }
        return -1;
    }
};
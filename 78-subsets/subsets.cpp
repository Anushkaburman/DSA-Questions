class Solution {
public:
    vector<vector<int>>n;
    void generate(vector<int> &subset,int i,vector<int>nums){
        if(i == nums.size()){
            n.push_back(subset);
            return;
        }
        generate(subset,i+1,nums);
        subset.push_back(nums[i]);
        generate(subset,i+1,nums);
        subset.pop_back();
    }

    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int>empty;
        generate(empty,0,nums);
        return n;
    }
};
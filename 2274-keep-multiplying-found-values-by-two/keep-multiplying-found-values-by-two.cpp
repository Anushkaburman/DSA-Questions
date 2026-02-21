class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        while(true){
            bool found = false;
            for(int i=0; i<nums.size(); i++){
                if(original == nums[i]){
                    original = 2*original;
                    found = true;
                    break;
                } 
            }
             if(!found) break;
        }
        return original;
    }
};
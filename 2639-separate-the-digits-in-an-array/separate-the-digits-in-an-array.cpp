class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int>arr;
        int r;
        for(int i = 0; i<nums.size(); i++){
            vector<int>temp;
            if(nums[i]==0){
                arr.push_back(0);
            }else{
                while(nums[i]>0){
                r = nums[i]%10;
                temp.push_back(r);
                nums[i] = nums[i]/10;
            }
            reverse(temp.begin(),temp.end());
            }
           arr.insert(arr.end(),temp.begin(),temp.end());
        }

        return arr;
    }
};
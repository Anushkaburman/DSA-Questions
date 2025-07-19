class Solution {
public:
    int missingNumber(vector<int>& nums) {
       sort(nums.begin(),nums.end());
        long long lo = 0;
        long long hi = nums.size();
        
        while(lo<hi){
            long long mid = lo + (hi-lo)/2;
            if(nums[mid]>mid){
                hi = mid ;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
};
class Solution {
public:
    int search(vector<int>& nums, int target) {
        long long lo = 0;
        long long hi = nums.size()-1;
        //long long result;
        while(lo<=hi){
            long long mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return -1;
    }
};
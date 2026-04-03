class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        for(int i=0; i<nums2.size(); i++){
            nums1.push_back(nums2[i]);
        }
        sort(nums1.begin(),nums1.end());
        int total = nums1.size();
        if(total%2==0){
            return (nums1[total/2-1] + nums1[total/2])/2.0;
        }else{
            return (nums1[total/2]);
        }
        return -1;
    }
};
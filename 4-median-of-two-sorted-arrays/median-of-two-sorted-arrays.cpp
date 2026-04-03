class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        int i=0;
        int j=0;
        int k=0;
        vector<int>result(m+n);

        while(i<nums1.size() && j<nums2.size()){
            if(nums1[i] < nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k] = nums2[j];
            j++;
            k++;
        }
        int total = result.size();
        int median;
        if(total%2 == 0){
            return (result[total/2 -1] + result[total/2])/2.0;
        }else{
            return result[total/2];
        }

    }
};
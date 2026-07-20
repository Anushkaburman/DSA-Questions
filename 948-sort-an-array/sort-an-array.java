class Solution {
    void mergeSort(int[] nums,int s,int e){
        if(s<e){
            int m = s + (e-s)/2;
            mergeSort(nums,s,m);
            mergeSort(nums,m+1,e);
            merge(nums,s,e,m);
        }
    }
    void merge(int[] nums,int s,int e,int m){
        int l = m-s+1;
        int r = e-m;
        int[] arr1 = new int[l];
        int[] arr2 = new int[r];
        for(int i=0; i<l; i++){
            arr1[i] = nums[s+i];
        }
        for(int i=0; i<r; i++){
            arr2[i] = nums[m+1+i];
        }
        int i=0;
        int j=0;
        int k=s;
        while(i<l && j<r){
            if(arr1[i]<=arr2[j]){
                nums[k] = arr1[i];
                i++;
            }else{
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<l){
            nums[k] = arr1[i];
            i++;
            k++;
        }
        while(j<r){
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}